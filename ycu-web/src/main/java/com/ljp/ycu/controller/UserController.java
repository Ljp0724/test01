package com.ljp.ycu.controller;

import com.ljp.ycu.model.User;
import com.ljp.ycu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/")
    public String index() {
        return "redirect:/list";  //重定向到list
    }

    @RequestMapping("/list")
    public String list(Model model) {
        List<User> users = this.userService.getUserList();
        model.addAttribute("user", users);
        return "user/list";
    }

    @RequestMapping("/toAddPage")  //跳转到添加用户界面
    public String toAdd() {
        return "user/userAdd";
    }

    @RequestMapping("/toEditPage")   //跳转到更改用户界面
    public String toEdit(Model model, Long id) {
        User user = this.userService.findUserByid(id);
        model.addAttribute("user", user);
        return "user/userEdit";
    }

    @RequestMapping("/add")    //添加用户
    public String add(User user) {
        this.userService.save(user);
        return "redirect:/list";
    }

    @RequestMapping("/edit")   //更改用户
    public String edit(User user) {
        this.userService.edit(user);
        return "redirect:/list";
    }

    @RequestMapping("/delete")   //更改用户
    public String edit(Long id) {
        this.userService.delete(id);
        return "redirect:/list";
    }

}
