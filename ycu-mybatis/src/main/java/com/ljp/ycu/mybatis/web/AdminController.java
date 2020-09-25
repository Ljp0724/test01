package com.ljp.ycu.mybatis.web;

import com.ljp.ycu.mybatis.model.UmsAdmin;
import com.ljp.ycu.mybatis.result.Result;
import com.ljp.ycu.mybatis.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    private AdminService adminService;

    @RequestMapping("/index")
    @ResponseBody
    public String index() {
        return "Hello, 欢迎！！！";
    }

    @RequestMapping("/login")
    @ResponseBody
    public Result<UmsAdmin> login(Model model, String username, String password) {
        UmsAdmin admin = new UmsAdmin();
        admin.setUsername(username);
        admin.setPassword(password);

        Result<UmsAdmin> login = this.adminService.login(admin);

        return login;
    }
}


