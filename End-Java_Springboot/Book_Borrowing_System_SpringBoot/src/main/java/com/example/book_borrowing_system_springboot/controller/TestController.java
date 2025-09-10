package com.example.book_borrowing_system_springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 功能：
 * 作者：憶终人
 * 日期：2025/9/10 18:22
 */
@RestController
public class TestController {
    @GetMapping("/test")
        public String Test() {
            return "测试";
        }
}
