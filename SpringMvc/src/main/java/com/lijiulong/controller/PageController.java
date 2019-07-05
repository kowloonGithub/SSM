package com.lijiulong.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("/page")
public class PageController {

    @RequestMapping("/index")
    public String success(Model model) {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("success");
        mav.addObject("msg","success");
        return "success";
    }
}
