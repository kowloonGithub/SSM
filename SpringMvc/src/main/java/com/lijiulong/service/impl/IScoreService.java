package com.lijiulong.service.impl;

import com.lijiulong.dao.ScoreMapper;
import com.lijiulong.model.Score;
import com.lijiulong.service.ScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("score")
public class IScoreService implements ScoreService {

    @Autowired
    public ScoreMapper scoreMapper;

    public Score getScoreById(Integer subjectId) {
       return scoreMapper.selectByPrimaryKey(subjectId);
    }
}
