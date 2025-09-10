package com.example.book_borrowing_system_springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.book_borrowing_system_springboot.mapper")
public class BookBorrowingSystemSpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(BookBorrowingSystemSpringBootApplication.class, args);
    }

}
