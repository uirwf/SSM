package com.wangfeng.mapper;

import com.wangfeng.domain.User;

import java.util.List;

/**
 * 用户mapper
 */
public interface UserMapper {

    public void save(User user);

    public List<User> findAll();

    public void deleteByUid(Integer uid);

    public void deleteById(Integer userId);

    public User findUserByUsername(String username);

    public List<User> findAllUserWithAccount();

    public  User findUserById(Integer id);

    public void updateUserById(User user);



}
