package com.atxfb.controller;

import com.atxfb.common.Result;
import com.atxfb.common.ResultCodeEnum;
import com.atxfb.entity.User;
import com.atxfb.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: chengly
 * @Date: 2025/1/15 01:19
 */

@SpringBootTest
@RestController // 标记为控制器，并自动将返回结果作为 JSON
@RequestMapping("/user") // 请求路径的前缀
public class UserMeun {
 @Autowired
 private UserService userService;

 @Test
 @GetMapping("/list")
 public String  getUserList(){
//  List<User> list = userService.getUserList();
//  return Result.build(list, ResultCodeEnum.SUCCESS);
   return "123";
 }

}
