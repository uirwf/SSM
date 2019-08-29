package com.wangfeng.service.Impl;

import com.wangfeng.domain.User;
import com.wangfeng.mapper.UserMapper;
import com.wangfeng.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 用户服务层
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private  UserMapper userMapper;

    public void save(User user) {
            userMapper.save(user);
    }

    public User findUserByUsername(String username){
        return userMapper.findUserByUsername(username);
    }


    public List<User> findAll() {
            return  userMapper.findAll();
    }


    public List<User> findAllUserWithAccount(){
        return userMapper.findAllUserWithAccount();
    }


    public void deleteByUid(Integer uid) {
            userMapper.deleteByUid(uid);
    }


    public void deleteById(Integer userId) {
            userMapper.deleteById(userId);

    }

    public User findUserById(Integer id){
        return userMapper.findUserById(id);
    }

    public void updateUserById(User user){
        userMapper.updateUserById(user);
    }




}
