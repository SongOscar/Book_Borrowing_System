package com.example.book_borrowing_system_springboot.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 用户表
 * @TableName sys_user
 */
@TableName(value ="sys_user")
@Data
public class SysUser implements Serializable {
    /**
     * ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 学号
     */
    @TableField(value = "studentno")
    private Long studentno;

    /**
     * 用户名
     */
    @TableField(value = "username")
    private String username;

    /**
     * 密码
     */
    @TableField(value = "password")
    private String password;

    /**
     * 联系电话
     */
    @TableField(value = "phone")
    private String phone;

    /**
     * 班级
     */
    @TableField(value = "classes")
    private String classes;

    /**
     * 电子邮件
     */
    @TableField(value = "email")
    private String email;

    /**
     * 地址
     */
    @TableField(value = "address")
    private String address;

    /**
     * 昵称
     */
    @TableField(value = "nickname")
    private String nickname;

    /**
     * 个人头像
     */
    @TableField(value = "userpic")
    private String userpic;

    /**
     * 角色：0-超级管理员，1-管理员，2-普通用户
     */
    @TableField(value = "role")
    private Integer role;

    /**
     * 找回密码问题
     */
    @TableField(value = "question")
    private String question;

    /**
     * 找回密码答案
     */
    @TableField(value = "answer")
    private String answer;

    /**
     * IP地址
     */
    @TableField(value = "ip")
    private String ip;

    /**
     * 创建时间
     */
    @TableField(value = "create_time")
    private Date createTime;

    /**
     * 更新时间
     */
    @TableField(value = "update_time")
    private Date updateTime;

    /**
     * 最后登录时间
     */
    @TableField(value = "login_date")
    private Date loginDate;

    /**
     * 备注
     */
    @TableField(value = "remark")
    private String remark;

    /**
     * 帐号状态（0正常 1停用）
     */
    @TableField(value = "status")
    private String status;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}
