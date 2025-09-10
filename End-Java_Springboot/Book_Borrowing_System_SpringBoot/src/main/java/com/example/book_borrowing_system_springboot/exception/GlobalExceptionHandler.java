package com.example.book_borrowing_system_springboot.exception;

import com.example.book_borrowing_system_springboot.common.Result;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 功能：全局异常处理 || 自定义异常
 * 作者：憶终人
 * 日期：2025/9/10 18:30
 */

@ControllerAdvice("com.example.book_borrowing_system_springboot.controller")
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    @ResponseBody   //返回json串
    public Result error(Exception e){
        e.printStackTrace();
        return Result.error();
    }

    @ExceptionHandler(CustomException.class)
    @ResponseBody   //返回json串
    public Result error(CustomException e){
        return Result.error(e.getCode(), e.getMsg());
    }
}
