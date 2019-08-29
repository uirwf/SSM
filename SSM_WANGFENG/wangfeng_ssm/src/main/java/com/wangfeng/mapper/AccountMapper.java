package com.wangfeng.mapper;

import com.wangfeng.domain.Account;

import java.util.List;

/**
 * 账户mapper
 */
public interface AccountMapper {

    public void save(Account account);

    public void deleteById(Integer id);

    public void deleteByUid();

    public Account findAccountById(Integer id);

    public List<Account> findAll();

    public List<Account> findAllAccount();

    public void updateAccountById(Account account);



}
