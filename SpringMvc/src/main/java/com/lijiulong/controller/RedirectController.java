package com.lijiulong.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/redirect")
public class RedirectController {

    @RequestMapping("/index")
    public String redirect(RedirectAttributes redirectAttributes){

        redirectAttributes.addFlashAttribute("message","hello world");
        return "redirect:/success";
    }
}
