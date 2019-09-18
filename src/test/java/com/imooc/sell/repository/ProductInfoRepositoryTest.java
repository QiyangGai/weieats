package com.imooc.sell.repository;
import com.imooc.sell.dataobject.ProductInfo;
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
public class ProductInfoRepositoryTest {

    @Autowired
    private ProductInfoRepository repository;

    @Test
    public void saveTest() {
        ProductInfo productInfo = new ProductInfo();
        productInfo.setProductId("123456");
        productInfo.setProductName("chicken wing");
        productInfo.setProductPrice(new BigDecimal(6.5));
        productInfo.setProductStock(100);
        productInfo.setProductDescription("Hot and Spicy Buffalo favor");
        productInfo.setProductIcon("https://dinnerthendessert.com/buffalo-wings/");
        productInfo.setProductStatus(0);
        productInfo.setCategoryType(2);
        ProductInfo res = repository.save(productInfo);
        Assert.assertNotNull(res);
    }

    @Test
    public void findByProductStatus() throws Exception {

        List<ProductInfo> productInfoList = repository.findByProductStatus(0);
        Assert.assertNotEquals(0,productInfoList.size());
    }
}