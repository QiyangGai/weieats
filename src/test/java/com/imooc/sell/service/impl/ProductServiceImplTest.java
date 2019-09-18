package com.imooc.sell.service.impl;

import com.imooc.sell.dataobject.ProductInfo;
import com.imooc.sell.enums.ProductStatusEnum;
import com.imooc.sell.service.ProductService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductServiceImplTest {

    @Autowired
    private ProductServiceImpl productService;

    @Test
    public void findOne() throws Exception {

        ProductInfo productInfo =  productService.findOne("123456");
        Assert.assertEquals("123456", productInfo.getProductId());

    }

    @Test
    public void findUpAll() throws Exception {

        List<ProductInfo> productInfoList = productService.findUpAll();
        Assert.assertNotEquals(0,productInfoList.size());

    }

    @Test
    public void findAll() throws Exception {

        PageRequest request = new PageRequest(0,5);
        Page<ProductInfo> productInfoPage = productService.findAll(request);
        System.out.println(("The types of foods is: " + productInfoPage.getTotalElements()));
        Assert.assertNotEquals(0, productInfoPage.getTotalElements());
    }

    @Test
    public void save() throws Exception {

        ProductInfo productInfo = new ProductInfo();
        productInfo.setProductId("123457");
        productInfo.setProductName("chicken nuggets");
        productInfo.setProductPrice(new BigDecimal(4.5));
        productInfo.setProductStock(100);
        productInfo.setProductDescription("deep fried");
        productInfo.setProductIcon("https://dinnerthendessert.com/buffalo-wings/");
        productInfo.setProductStatus(ProductStatusEnum.DOWN.getCode());
        productInfo.setCategoryType(2);

        ProductInfo res = productService.save(productInfo);
        Assert.assertNotNull(res);

    }
}