package com.lijiulong.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/model")
public class ModelController {

    /**
     * 此注解可以往model添加个model
     * @param a
     * @param model
     * @return
     */
    @RequestMapping("/index")
    public String model(@ModelAttribute String a, Model model){
        return "success";
    }
}
