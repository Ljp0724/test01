package com.ljp.ycu.mybatis.dao;

import com.ljp.ycu.mybatis.model.Customer;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CustomerMapperTest {
    @Autowired
    private CustomerDao customerDao;

    @Test
    public void testInsert() throws Exception {
        this.customerDao.insert(new Customer("张三", "zs123456", "M"));
        this.customerDao.insert(new Customer("天天", "tt123456", "F"));
        this.customerDao.insert(new Customer("小刚", "xg123456", "M"));

        Assert.assertEquals(3, this.customerDao.getAll().size());
    }

    @Test
    public void testQuery() throws Exception {
        List<Customer> customerList= this.customerDao.getAll();
        if (customerList == null || customerList.size() == 0) {
            System.out.println("没有数据");
        }else {
            System.out.println(customerList.toString());
        }
    }
    @Test
    public void testUpdate() throws Exception{
        Customer customer = this.customerDao.getOne(2L);
        System.out.println(customer);
        customer.setNickName("尼奥");

        this.customerDao.update(customer);

        Assert.assertTrue("尼奥".equals(this.customerDao.getOne(2L).getNickName()));
    }


}
