package com.ljp.ycu.mybatis.dao;

import com.ljp.ycu.mybatis.model.UmsAdmin;
import org.springframework.stereotype.Repository;

@Repository
public interface UmsAdminDao {
    int deleteByPrimaryKey(Long id);

    int insert(UmsAdmin record);

    int insertSelective(UmsAdmin record);

    UmsAdmin selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UmsAdmin record);

    int updateByPrimaryKey(UmsAdmin record);

    /** 根据用户名和密码进行查询 */
    UmsAdmin selectByUsernameAndPassword(UmsAdmin umsAdmin);

    /** 根据用户名查询 */
    UmsAdmin selectByUsername(UmsAdmin umsAdmin);



}