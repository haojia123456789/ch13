package com.bdqn.ch12_1.controller;

import com.bdqn.ch12_1.pojo.SmbmsUser;
import com.bdqn.ch12_1.service.SmbmsUserService;
import com.bdqn.ch12_1.utils.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller

public class UserController {
    @Autowired
    private SmbmsUserService userService;
    @RequestMapping("/dologin")
    public String queryUser(SmbmsUser user,
                            String type,
                            HttpSession session,
                            HttpServletRequest request){
        SmbmsUser dbUser = userService.queryByName(user.getUserCode());
        //flag=1 dev 2=admin
        if(dbUser==null){
            request.setAttribute("error","用户名不存在");
            return "login";
        }
        if(!dbUser.getUserPassword().equals(user.getUserPassword())){
            request.setAttribute("error","密码错误");
            return "login";
        }

        session.setAttribute(Constants.SESSIONUSER,dbUser);


        return "redirect:/backend/admin";
    }

    @RequestMapping("/backend/admin")
    public ModelAndView toAdmin(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("admin");
        System.out.println(mv.getViewName());
        return mv;
    }

    public void weba(){

    }
}
