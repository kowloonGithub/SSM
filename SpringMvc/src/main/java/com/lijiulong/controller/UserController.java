package com.lijiulong.controller;


import com.lijiulong.model.User;
import com.lijiulong.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * of use httpservletrequest.getparameter来获取id参数
     *
     * @param id
     * @return
     */
    @ResponseBody
    @RequestMapping("/getuser")
    public User getUser(@RequestParam int id){
        return userService.getUserById(id);
    }
}
