package com.lijiulong.service.impl;

import com.lijiulong.dao.UserMapper;
import com.lijiulong.model.User;
import com.lijiulong.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")
public class IUserService implements UserService {

    @Autowired
    private UserMapper userMapper;


    public User getUserById(Integer userId) {
        return userMapper.selectByPrimaryKey(userId);
    }
}
