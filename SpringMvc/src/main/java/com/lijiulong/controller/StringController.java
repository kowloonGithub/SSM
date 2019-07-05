package com.lijiulong.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/string")
public class StringController {
    @RequestMapping("/index")
    public String returnString(){
        return "success";
    }
}
