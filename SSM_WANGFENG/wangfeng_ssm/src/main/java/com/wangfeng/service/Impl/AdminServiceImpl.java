package com.wangfeng.service.Impl;

import com.wangfeng.domain.Admin;
import com.wangfeng.mapper.AdminMapper;
import com.wangfeng.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 管理员服务层
 */
@Service("adminService")
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminMapper adminMapper;

    /**
     * 登录验证方法
     * @param adminname 登录名
     * @param password 登录密码
     * @return 返回比对对象
     */
    public Admin login(String adminname, String password) {
            return adminMapper.login(adminname,password);
    }



}
