package com.imooc.service.impl;

import com.imooc.dto.OrderDTO;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;

import static org.junit.Assert.*;

/**
 * Created by zhichao on 2018/8/9.
 */
@SpringBootTest
@RunWith(SpringRunner.class)
@Slf4j
@Transactional
public class OrderServiceImplTest {

    @Autowired
    private OrderServiceImpl orderService;

   private static String orderid = "123456";
    @Test
    public void create() throws Exception {
    }

    @Test
    public void findOne() throws Exception {

        OrderDTO result = orderService.findOne(orderid);
        log.info("[查询单个订单] result={}", result);
        Assert.assertEquals(orderid,result.getOrderId());
    }

    @Test
    public void findList() throws Exception {
    }

    @Test
    public void cancel() throws Exception {
        OrderDTO result = orderService.findOne("4");

        OrderDTO cancel = orderService.cancel(result);

        Assert.assertEquals("2",cancel.getOrderStatus().toString());
    }

    @Test
    public void finish() throws Exception {
        OrderDTO result = orderService.findOne("4");

        OrderDTO cancel = orderService.finish(result);

        Assert.assertEquals("1",cancel.getOrderStatus().toString());
    }

    @Test
    public void paid() throws Exception {
        OrderDTO result = orderService.findOne("4");

        OrderDTO cancel = orderService.paid(result);

        Assert.assertEquals("1",cancel.getPayStatus().toString());
    }

}