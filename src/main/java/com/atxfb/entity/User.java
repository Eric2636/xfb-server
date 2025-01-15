package com.atxfb.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * @Author: chengly
 * @Date: 2025/1/15 00:46
 */
@Data
@TableName("users") // 对应数据库中的表名
public class User {
    @TableId // 指定主键字段
    private Long id;

    private String username; // 用户名
    private String password; // 密码
    private String email;    // 邮箱
    private String phone;    // 电话
    private Integer status;  // 状态：0-禁用，1-启用

    private LocalDateTime createTime; // 创建时间
    private LocalDateTime updateTime; // 更新时间
}
