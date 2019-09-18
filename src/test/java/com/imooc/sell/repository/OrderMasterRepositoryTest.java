package com.imooc.sell.repository;

import com.imooc.sell.dataobject.OrderMaster;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

import static org.junit.Assert.*;


@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderMasterRepositoryTest {

    @Autowired
    private OrderMasterRepository repository;

    private  final String OPENID = "110110";

    @Test
    public void SaveTest() {
        OrderMaster ordermaster = new OrderMaster();
        ordermaster.setOrderId("345678");
        ordermaster.setBuyerName("jason");
        ordermaster.setBuyerPhone("9176910890");
        ordermaster.setBuyerAddress("89 Fleet AVE");

        ordermaster.setOrderAmount(new BigDecimal(5.5));
        OrderMaster res = repository.save(ordermaster);
        Assert.assertNotNull(res);
    }
    @Test
    public void findByBuyerOpenid() throws Exception {
        PageRequest request = new PageRequest(0,10);
        Page<OrderMaster> res = repository.findByBuyerOpenid(OPENID, request);
        Assert.assertNotEquals(0,res.getTotalElements());
        System.out.println(res.getTotalElements());
    }
}