package com.bdqn.ch12_1.utils;

import com.bdqn.ch12_1.pojo.SmbmsUser;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginInterceptor
implements HandlerInterceptor {

    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
        HttpSession session = httpServletRequest.getSession();

        StringBuffer requestURL = httpServletRequest.getRequestURL();
        String ru=requestURL.toString();
        SmbmsUser user = (SmbmsUser)session.getAttribute(Constants.SESSIONUSER);
        if(user==null) {
            httpServletResponse.sendRedirect("/login");
            return false;
        }
        else
            return true;
    }
    public void postHandle(HttpServletRequest httpServletRequest,
                           HttpServletResponse httpServletResponse,
                           Object o,
                           ModelAndView modelAndView) throws Exception {
        HttpSession session = httpServletRequest.getSession();
        SmbmsUser user = (SmbmsUser)session.getAttribute(Constants.SESSIONUSER);

        modelAndView.setViewName("bbb");
    }

    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}
