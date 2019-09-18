package com.imooc.sell.service.impl;

import com.imooc.sell.dataobject.OrderMaster;
import com.imooc.sell.dto.OrderDTO;
import com.imooc.sell.service.OrderService;
import com.imooc.sell.service.payService;
import com.lly835.bestpay.service.impl.BestPayServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PayServiceImpl implements payService {

    @Autowired
    OrderService orderService;

    @Override
    public void create(OrderDTO orderDTO) {

        BestPayServiceImpl bestPayService(OrderDTO orderdto) {
            OrderMaster orderMaster = orderService.findList(String openid) {

            }
        }

}
