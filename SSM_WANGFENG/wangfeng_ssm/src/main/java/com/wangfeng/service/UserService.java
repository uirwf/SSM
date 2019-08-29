package com.wangfeng.service;

import com.wangfeng.domain.User;


import java.util.List;

/**
 * 用户服务层接口
 */
public interface UserService {

    public void save(User user);

    public User findUserByUsername(String username);

    public List<User> findAll();

    public List<User> findAllUserWithAccount();

    public User findUserById(Integer id);

    public void deleteByUid(Integer uid);

    public void deleteById(Integer userId);

    public void updateUserById(User user);

}
