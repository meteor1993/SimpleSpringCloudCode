package com.springcloud.book.ch15_1_pay_server.service;

import com.springcloud.book.ch15_1_common.OperationResponse;
import com.springcloud.book.ch15_1_common.pay.ReduceBalanceRequestVO;

/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2019/9/7
 * @Time: 22:01
 * @email: inwsy@hotmail.com
 * Description:
 */
public interface PayService {
    OperationResponse reduceBalance(ReduceBalanceRequestVO reduceBalanceRequestVO) throws Exception;
}
