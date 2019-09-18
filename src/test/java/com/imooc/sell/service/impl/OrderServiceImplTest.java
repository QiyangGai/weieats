package com.imooc.sell.service.impl;

import com.imooc.sell.dataobject.OrderDetail;
import com.imooc.sell.dto.OrderDTO;
import com.imooc.sell.enums.OrderStatusEnum;
import com.imooc.sell.enums.PayStatusEnum;
import com.imooc.sell.service.OrderService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderServiceImplTest {
    @Autowired
    private OrderServiceImpl orderService;

    private final String BUYER_OPENID = "110110";

    private final String ORDER_ID = "1567566907951711327";

    @Test
    public void create() throws Exception {

        OrderDTO orderDTO = new OrderDTO();
        orderDTO.setBuyerName("keven");
        orderDTO.setBuyerAddress("49 Ave");
        orderDTO.setBuyerPhone("917680465");
        orderDTO.setBuyerOpenid(BUYER_OPENID);
        //Create cart
        List<OrderDetail> orderDetailList = new ArrayList<>();
        OrderDetail o1 = new OrderDetail();
        o1.setProductId("123456");
        o1.setProductQuantity(1);
        orderDetailList.add(o1);

        OrderDetail o2 = new OrderDetail();
        o2.setProductId("123457");
        o2.setProductQuantity(2);
        orderDetailList.add(o2);

        orderDTO.setOrderDetailList(orderDetailList);
        OrderDTO res = orderService.create(orderDTO);
        Assert.assertNotNull(res);
    }

    @Test
    public void findOne() throws Exception {
        OrderDTO res= orderService.findOne(ORDER_ID);
        Assert.assertEquals(ORDER_ID, res.getOrderId());
    }

    @Test
    public void findList() throws Exception {
        PageRequest request = new PageRequest(0,2);
        Page<OrderDTO> orderDTOPage = orderService.findList(BUYER_OPENID, request);
        Assert.assertNotEquals(0, orderDTOPage.getTotalElements());


    }

    @Test
    public void cancel() throws Exception {
        OrderDTO orderDTO= orderService.findOne(ORDER_ID);
        OrderDTO res = orderService.cancel(orderDTO);
        Assert.assertEquals(OrderStatusEnum.CANCEL.getCode(), res.getOrderStatus());
    }

    @Test
    public void finish() throws Exception {
        OrderDTO orderDTO= orderService.findOne(ORDER_ID);
        OrderDTO res = orderService.finish(orderDTO);
        Assert.assertEquals(OrderStatusEnum.FINISHED.getCode(), res.getOrderStatus());
    }

    @Test
    public void paid() throws Exception {
        OrderDTO orderDTO= orderService.findOne(ORDER_ID);
        OrderDTO res = orderService.paid(orderDTO);
        Assert.assertEquals(PayStatusEnum.SUCCESS.getCode(), res.getPayStatus());
    }

    @Test
    public void testFindList() {
    }
}