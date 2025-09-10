package com.example.book_borrowing_system_springboot.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.book_borrowing_system_springboot.entity.SysUser;
import com.example.book_borrowing_system_springboot.service.SysUserService;
import com.example.book_borrowing_system_springboot.mapper.SysUserMapper;
import org.springframework.stereotype.Service;

/**
* @author thinkbook
* @description 针对表【sys_user(用户表)】的数据库操作Service实现
* @createDate 2025-09-10 19:25:58
*/
@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser>
    implements SysUserService{

}




