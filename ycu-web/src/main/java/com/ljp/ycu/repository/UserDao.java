package com.ljp.ycu.repository;

import com.ljp.ycu.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

//数据层接口
public interface UserDao extends JpaRepository<User,Long> {
    //JpaRepository<T1,T2> T1表示类型。T2表主键，也就是id的类型

    /**根据id查询用户*/
    User findById(long id);

    /*** 根据id删除用*/
    void deleteById(long id);
}
