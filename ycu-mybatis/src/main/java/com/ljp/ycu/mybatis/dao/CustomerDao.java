package com.ljp.ycu.mybatis.dao;

import com.ljp.ycu.mybatis.model.Customer;
import org.springframework.stereotype.Repository;

import java.util.List;

// 数据层
@Repository     //只放在dao层，将其识别为bean,此处为测试加的注解，可去掉
public interface CustomerDao {

    /** 查询所有的客户 */
    List<Customer> getAll();

    /** 根据id查询 */
    Customer getOne(Long id);

    /** 增加客户 */
    void insert(Customer customer);

    /** 更新客户 */
    void update(Customer customer);

    /** 删除客户 */
    void delete(Long id);

}
