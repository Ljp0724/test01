package com.ljp.ycu.mybatis.web;

import com.ljp.ycu.mybatis.dao.CustomerDao;
import com.ljp.ycu.mybatis.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerController {

    @Autowired
    private CustomerDao customerDao;

    @RequestMapping("/getCustomers")
    public List<Customer> getCustomers() {
        List<Customer> customers = this.customerDao.getAll();
        return customers;
    }

    @RequestMapping("/getCustomer")
    public Customer getCustomer(Long id) {
        Customer customer = this.customerDao.getOne(id);
        return customer;
    }

    @RequestMapping("/add")
    public void add(Customer customer) {
        this.customerDao.insert(customer);

    }

    @RequestMapping("/update")
    public void update(Customer customer) {
        this.customerDao.update(customer);

    }

    @RequestMapping("/delete/{id}")
    public void delete(@PathVariable("id") Long id) {
        this.customerDao.delete(id);

    }
}
