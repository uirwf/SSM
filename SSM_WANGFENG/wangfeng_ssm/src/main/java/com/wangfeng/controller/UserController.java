package com.wangfeng.controller;

import com.wangfeng.domain.User;
import com.wangfeng.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * 用户控制器
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    //1.添加用户数据
    @RequestMapping(value = "/save", produces = "text/html;charset=utf-8")
    //@ResponseBody
    public String save(User user) {
        userService.save(user);
        return "redirect:/user/findAll";
    }

    //2.删除用户数据
    @RequestMapping("/del/{userId}")
    public String delete(@PathVariable("userId") Integer userId) {
        userService.deleteByUid(userId);
        userService.deleteById(userId);
        return "redirect:/user/findAll";
    }

    //3.根据用户名查询用户信息
    @RequestMapping("/findUserByUsername")
    public ModelAndView findUserByUsername(String username) {
        User user = userService.findUserByUsername(username);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("user", user);
        modelAndView.setViewName("userList3");
        return modelAndView;
    }


    //4.查询所有用户数据
    @RequestMapping("/findAll")
    public ModelAndView findAll() {
        List<User> userList = userService.findAll();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("userList", userList);
        modelAndView.setViewName("userList");
        return modelAndView;
    }

    //5.查询有关联账户的所有用户数据
    @RequestMapping("/findAllUserWithAccount")
    public ModelAndView findAllUserWithAccount() {
        List<User> userListWithAccount = userService.findAllUserWithAccount();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("userListWithAccount", userListWithAccount);
        modelAndView.setViewName("userList2");
        return modelAndView;
    }

    //6.1更新用户数据(修改表单回显)
    //根据用户id查询用户数据
    @RequestMapping("/findUserById/{userId}")
    public ModelAndView findUserById(@PathVariable("userId") Integer id) {
        User user = userService.findUserById(id);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("user", user);
        modelAndView.setViewName("editUser");
        return modelAndView;
    }

    //6.2更新用户数据(修改表单回显修改后进行提交)
    @RequestMapping("/update")
    public String update(User user) {
        userService.updateUserById(user);
        return "redirect:/user/findAll";
    }



}
