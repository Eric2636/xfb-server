package com.atxfb.service;

import com.atxfb.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: chengly
 * @Date: 2025/1/15 02:05
 */

public interface UserService {
    List<User> getUserList();
}
