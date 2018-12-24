package com.herongxian;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 主程序：springboot 应用程序的入口
 *
 * 注解@SpringBootApplication用来标注它是一个springboot应用
 * main方法使它成为一个主程序，将在启动时首先被执行
 * 其次，注解@RestController 同时标注它还是一个控制器，在浏览器访问应用根目录将调用home方法
 */
@SpringBootApplication
@RestController
public class Application {
    @RequestMapping("/")
    String home(){
        return "hello world";
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
