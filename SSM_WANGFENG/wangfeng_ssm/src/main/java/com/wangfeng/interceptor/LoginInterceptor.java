package com.wangfeng.interceptor;

import com.wangfeng.domain.Admin;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * 登录拦截器
 */
public class LoginInterceptor implements HandlerInterceptor {

    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws IOException {

        //判断管理员是否登录
        HttpSession session = request.getSession();
        Admin admin = (Admin)session.getAttribute("admin");
        if (admin == null){
            //没有登录，继续登录
            response.sendRedirect(request.getContextPath()+"/login.jsp");
            //不放行
            return  false;
        }

        //登录成功，放行
        return true;
    }
}
