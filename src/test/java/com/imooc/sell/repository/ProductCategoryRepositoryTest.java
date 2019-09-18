package com.imooc.sell.repository;


import com.imooc.sell.dataobject.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;

import java.util.Arrays;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryRepositoryTest {
    @Autowired
    private ProductCategoryRepository repository;

    @Test
    public void findOneTest() {

        ProductCategory productCategory = repository.findOne(1);

        System.out.println(productCategory.toString());

    }
    @Test
    @Transactional
    public void saveATest() {

        ProductCategory productCategory = new ProductCategory("8.31 special2",3);
        ProductCategory result = repository.save(productCategory);
        Assert.assertNotNull(result);
    }

    @Test
    public void findByCategoryTypeInTest() throws Exception {

        List<Integer> list = Arrays.asList(0,2);
        List<ProductCategory>result = repository.findByCategoryTypeIn(list);
        Assert.assertNotEquals(0, result.size());
        System.out.println(result.size());
    }


}
