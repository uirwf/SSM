package com.wangfeng.service;

import com.wangfeng.domain.Admin;

/**
 * 管理员服务层接口
 */
public interface AdminService {

    public Admin login(String adminname,String password);


}
