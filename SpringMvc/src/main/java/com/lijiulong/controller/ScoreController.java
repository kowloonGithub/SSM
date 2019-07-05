package com.lijiulong.controller;

import com.lijiulong.model.Score;
import com.lijiulong.service.ScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/score")
public class ScoreController {

    @Autowired
    public ScoreService scoreService;

    @ResponseBody
    @RequestMapping("/index")
    public Score getScore(HttpServletRequest request, HttpServletResponse response){
        return scoreService.getScoreById(Integer.parseInt(request.getParameter("id")));
    }

}
