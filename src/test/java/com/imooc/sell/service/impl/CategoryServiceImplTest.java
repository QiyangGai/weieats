package com.imooc.sell.service.impl;

import com.imooc.sell.dataobject.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import java.util.Arrays;
import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest
public class CategoryServiceImplTest {

    @Autowired
    private CategoryServiceImpl categoryService;

    @Test
    public void findOne() throws Exception {

        ProductCategory productCategory = categoryService.findOne(3);
        Assert.assertEquals(new Integer(3),productCategory.getCategoryId());

    }

    @Test
    public void findAll() throws Exception {

        List<ProductCategory> productCategoryList = categoryService.findAll();
        Assert.assertNotEquals(0, productCategoryList.size());

    }

    @Test
    public void findByCategoryTypeIn() throws Exception {

        List<ProductCategory> productCategoryList = categoryService.findByCategoryTypeIn(Arrays.asList(2,0));
        Assert.assertNotEquals(0, productCategoryList.size());
        System.out.println(productCategoryList.size());

    }

    @Test
    public void save() throws Exception {

        ProductCategory productCategory = new ProductCategory("831special3", 5);
        ProductCategory result = categoryService.save(productCategory);
        Assert.assertNotNull(result);

    }
}
