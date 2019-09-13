package com.springcloud.book.ch14_1_pay_server.service.impl;

import com.springcloud.book.ch14_1_common.OperationResponse;
import com.springcloud.book.ch14_1_common.pay.ReduceBalanceRequestVO;
import com.springcloud.book.ch14_1_pay_server.dao.AccountDao;
import com.springcloud.book.ch14_1_pay_server.model.Account;
import com.springcloud.book.ch14_1_pay_server.service.PayService;
import io.seata.core.context.RootContext;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2019/9/7
 * @Time: 22:03
 * @email: inwsy@hotmail.com
 * Description:
 */
@Service
@Slf4j
public class PayServiceImpl implements PayService {

    @Autowired
    private AccountDao accountDao;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public OperationResponse reduceBalance(ReduceBalanceRequestVO reduceBalanceRequestVO) throws Exception {
        log.info("当前 XID: {}", RootContext.getXID());

        checkBalance(reduceBalanceRequestVO.getUserId(), reduceBalanceRequestVO.getPrice());

        log.info("开始扣减用户 {} 余额", reduceBalanceRequestVO.getUserId());
        Integer record = accountDao.reduceBalance(reduceBalanceRequestVO.getUserId(), reduceBalanceRequestVO.getPrice());
        log.info("扣减用户 {} 余额结果:{}", reduceBalanceRequestVO.getUserId(), record > 0 ? "操作成功" : "扣减余额失败");

        return OperationResponse.builder()
                .success(record > 0)
                .message(record > 0 ? "操作成功" : "扣余额失败")
                .build();

    }

    private void checkBalance(Long userId, Integer price) throws Exception {
        log.info("检查用户 {} 余额", userId);
        Optional<Account> account = accountDao.findById(userId);
        if (account.isPresent()) {
            Integer balance = account.get().getBalance();
            if (balance < price) {
                log.warn("用户 {} 余额不足，当前余额:{}", userId, balance);
                throw new Exception("余额不足");
            }
        }
    }
}
