package com.imooc.sell.repository;

import com.imooc.sell.dataobject.OrderDetail;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderDetailRepositoryTest {

    @Autowired
    private  OrderDetailRepository repository;

    @Test
    public void saveTest() throws Exception {
        OrderDetail orderDetail = new OrderDetail();
        orderDetail.setDetailId("123456");
        orderDetail.setOrderId("2019090201");
        orderDetail.setProductIcon("http://xxx1.jpg");
        orderDetail.setProductId("002");
        orderDetail.setProductName("fries");
        orderDetail.setProductPrice(new BigDecimal(4));
        orderDetail.setProductQuantity(1);
        OrderDetail res = repository.save(orderDetail);
        Assert.assertNotNull(res);
    }
    @Test
    public void findByOrderId() throws Exception {
        List<OrderDetail> orderDetailList = repository.findByOrderId("20190902");
        Assert.assertNotEquals(0,orderDetailList.size());
        System.out.println(orderDetailList.size());
    }
}