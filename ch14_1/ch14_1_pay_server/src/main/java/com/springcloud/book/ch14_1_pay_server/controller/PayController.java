package com.springcloud.book.ch14_1_pay_server.controller;

import com.springcloud.book.ch14_1_common.OperationResponse;
import com.springcloud.book.ch14_1_common.pay.ReduceBalanceRequestVO;
import com.springcloud.book.ch14_1_pay_server.service.PayService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2019/9/7
 * @Time: 22:05
 * @email: inwsy@hotmail.com
 * Description:
 */
@RestController
@RequestMapping("/pay")
@Slf4j
public class PayController {
    @Autowired
    private PayService payService;

    @PostMapping("/reduceBalance")
    @ResponseBody
    public OperationResponse reduceBalance(@RequestBody ReduceBalanceRequestVO reduceBalanceRequestVO) throws Exception {
        return payService.reduceBalance(reduceBalanceRequestVO);
    }
}
