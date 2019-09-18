package com.imooc.sell.service;

import com.imooc.sell.dto.OrderDTO;

/**
 * Pay
 */
public interface payService {
    void create(OrderDTO orderDTO);
}
