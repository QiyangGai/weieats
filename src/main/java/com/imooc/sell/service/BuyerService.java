package com.imooc.sell.service;

import com.imooc.sell.dto.OrderDTO;

/**
 * buyer service query and cancel
 */
public interface BuyerService {
    //Query one order
    OrderDTO findOrderOne(String openid, String orderId);

    //Cancel a order
    OrderDTO cancelOrder(String openid, String orderId);

}
