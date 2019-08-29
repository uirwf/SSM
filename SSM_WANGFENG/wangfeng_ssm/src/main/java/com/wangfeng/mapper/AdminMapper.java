package com.wangfeng.mapper;

import com.wangfeng.domain.Admin;
import org.apache.ibatis.annotations.Param;

/**
 * 管理员mapper
 */
public interface AdminMapper {

    public Admin login(@Param("adminname") String adminname, @Param("password") String password);


}
