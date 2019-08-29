package com.wangfeng.controller;

import com.wangfeng.domain.Account;
import com.wangfeng.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * 账户控制器
 */
@Controller
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    //1.添加账户数据
    @RequestMapping("/save")
    public String save(Account account){
        accountService.save(account);
        return "redirect:/account/findAllAccount";
    }

    //2.删除账户数据
    @RequestMapping("/del/{id}")
    public String delete(@PathVariable("id") Integer id){
        accountService.deleteById(id);
        return "redirect:/account/findAllAccount";
    }

    //3.查询所有账户数据
    @RequestMapping("/findAllAccount")
    public ModelAndView findAllAccount(){
        List<Account> accountList = accountService.findAllAccount();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("accountList",accountList);
        modelAndView.setViewName("accountList2");
        return modelAndView;
    }

    //4.查询账户数据及其关联用户数据
    @RequestMapping("/findAll")
    public ModelAndView findAll(){
        List<Account> accountList = accountService.findAll();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("accountList",accountList);
        modelAndView.setViewName("accountList");
        return  modelAndView;
    }

    //5.1更新账户数据(修改表单回显)
    //根据账户id查询账户数据
    @RequestMapping("/findAccountById/{id}")
    public ModelAndView findAccountById(@PathVariable("id") Integer id){
        Account account = accountService.findAccountById(id);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("account",account);
        modelAndView.setViewName("editAccount");
        return modelAndView;
    }

    //5.2更新账户数据(修改表单回显修改后进行提交)
    @RequestMapping("/update")
    public String update(Account account){
        accountService.updateAccountById(account);
        return "redirect:/account/findAllAccount";
    }





}
