package com.wangfeng.controller;

import com.wangfeng.domain.Admin;
import com.wangfeng.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

/**
 * 管理员控制器
 */
@Controller
@RequestMapping("/admin")
public class AdminController {

        @Autowired
        private AdminService adminService;

        //管理员登录
        @RequestMapping("/login")
        public String login(String adminname, String password, HttpSession session){
            Admin admin = adminService.login(adminname, password);
            if (admin != null){
                //登录成功 将admin存储到session中
                session.setAttribute("admin",admin);
                return "redirect:/index.jsp";
            }
            //登录失败，继续登录
            return "redirect:/login.jsp";

        }


}
