package com.atxfb.controller;

import com.atxfb.common.Result;
import com.atxfb.common.ResultCodeEnum;
import com.atxfb.entity.User;
import com.atxfb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: chengly
 * @Date: 2025/1/15 20:51
 */

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/list")
    public Result getUserList(){
        List<User> list = userService.getUserList();
        return Result.build(list, ResultCodeEnum.SUCCESS);
    }
}