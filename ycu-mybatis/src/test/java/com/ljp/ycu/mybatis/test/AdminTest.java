package com.ljp.ycu.mybatis.test;

import com.ljp.ycu.mybatis.dao.UmsAdminDao;
import com.ljp.ycu.mybatis.model.UmsAdmin;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AdminTest {
    @Autowired
    private UmsAdminDao adminDao;

    @Test
    public void insertAdminTest() {
        UmsAdmin admin = new UmsAdmin();
        admin.setNickName("fenzi");
        admin.setCreateTime(new Date());
        admin.setPassword("123456");
        admin.setUsername("大帅B");

        this.adminDao.insertSelective(admin);
    }

    @Test
    public void deleteAdminTest(){
        this.adminDao.deleteByPrimaryKey((long) 7);
    }

    @Test
    public void selectAdminTest(){

    }
}
