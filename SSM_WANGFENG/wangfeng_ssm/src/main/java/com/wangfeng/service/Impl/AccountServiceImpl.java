package com.wangfeng.service.Impl;

import com.wangfeng.domain.Account;
import com.wangfeng.mapper.AccountMapper;
import com.wangfeng.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 账户服务层
 */
@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountMapper accountMapper;

    public void save(Account account) {
        accountMapper.save(account);
    }

    public void deleteById(Integer id){
        accountMapper.deleteById(id);
    }

    public void deleteByUid(Integer uid) {

    }

    public Account findAccountById(Integer id){
        return  accountMapper.findAccountById(id);
    }

    public List<Account> findAllAccount(){
        return accountMapper.findAllAccount();
    }

    public List<Account> findAll() {
        return accountMapper.findAll();
    }

    public void updateAccountById(Account account){
        accountMapper.updateAccountById(account);
    }




}
