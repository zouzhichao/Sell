package com.imooc.repository;

import com.imooc.dataobject.OrderMaster;
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

/**
 * Created by zhichao on 2018/7/30.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderMasterRepositoryTest {
    @Autowired
    private OrderMasterRepository orderMasterRepository;
    @Test
    public void findByBuyerOpenid() throws Exception {
        PageRequest pageRequest = new PageRequest(0, 1);
        Page<OrderMaster> result = orderMasterRepository.findByBuyerOpenid("905862033", pageRequest);
        Assert.assertNotEquals(0,result.getTotalElements());
    }

    @Test
    public void save(){
        OrderMaster orderMaster = new OrderMaster();
        orderMaster.setBuyerAddress("慕课网2");
        orderMaster.setBuyerName("我要吃2");
        orderMaster.setBuyerPhone("12345678911");
        BigDecimal bigDecimal = new BigDecimal(1.3);
        orderMaster.setOrderAmount(bigDecimal);
        orderMaster.setOrderId("3");
        orderMaster.setBuyerOpenid("905862033");
        OrderMaster save = orderMasterRepository.save(orderMaster);
        Assert.assertNotNull(save);
    }

}