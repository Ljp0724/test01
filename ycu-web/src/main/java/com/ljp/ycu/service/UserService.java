package com.ljp.ycu.service;

import com.ljp.ycu.model.User;

import java.util.List;

public interface UserService {
    //获取所有的用户
    List<User> getUserList();

    //根据用户id查询用户
    User findUserByid(long id);

    //保存用户
    void save(User user);

    //编辑用户
    void edit(User user);

    //删除用户
    void delete(long id);
}
