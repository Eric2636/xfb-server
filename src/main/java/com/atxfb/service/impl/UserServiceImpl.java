package com.atxfb.service.impl;

import com.atxfb.entity.User;
import com.atxfb.mapper.UserMapper;
import com.atxfb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: chengly
 * @Date: 2025/1/15 21:14
 */

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public List<User> getUserList() {
        return userMapper.selectList(null);
    }
}
