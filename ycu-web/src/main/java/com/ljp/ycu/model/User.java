package com.ljp.ycu.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity   //实体类
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  //自增长
    private Long id;

    //列，空指针判断，唯一性（这里表示不能为空，唯一性）
    @Column(nullable = false, unique = true)
    private String username;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private int age;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
