package com.springcloud.book.ch14_1_order_server.service;


import com.springcloud.book.ch14_1_common.OperationResponse;
import com.springcloud.book.ch14_1_common.order.PlaceOrderRequestVO;

/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2019/9/7
 * @Time: 21:37
 * @email: inwsy@hotmail.com
 * Description:
 */
public interface OrderService {
    OperationResponse placeOrder(PlaceOrderRequestVO placeOrderRequestVO);
}
