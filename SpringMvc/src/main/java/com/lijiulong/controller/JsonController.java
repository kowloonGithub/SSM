package com.lijiulong.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/json")
public class JsonController {

    @ResponseBody
    @RequestMapping("/index")
    public Map<String, String> returnJson(){
        Map<String, String> map = new HashMap<String, String>();
        map.put("code","200");
        return map;
    }
}
