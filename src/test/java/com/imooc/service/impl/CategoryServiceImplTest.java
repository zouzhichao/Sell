package com.imooc.service.impl;

import com.imooc.dataobject.ProductCategory;
import com.imooc.service.CategoryService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by zhichao on 2018/7/11.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class CategoryServiceImplTest {

    @Autowired
    private CategoryServiceImpl categoryService;
    @Test
    public void findOne() throws Exception {
        ProductCategory productCategory = categoryService.findOne(1);
        Assert.assertNotEquals(new Integer(1),productCategory);
    }

    @Test
    public void findAll() throws Exception {
        List<ProductCategory> list = categoryService.findAll();
        Assert.assertNotEquals(0,list);
    }

    @Test
    public void findByCategoryTypeIn() throws Exception {
        List<Integer> list = Arrays.asList(2, 3, 4);
        List<ProductCategory> result = categoryService.findByCategoryTypeIn(list);
        Assert.assertNotEquals(0,list);
    }

    @Test
    public void save() throws Exception {
        ProductCategory productCategory = new ProductCategory("xiaosan", 6);
        ProductCategory save = categoryService.save(productCategory);
        Assert.assertNotNull(save);
        Arrays.asList();
    }

}