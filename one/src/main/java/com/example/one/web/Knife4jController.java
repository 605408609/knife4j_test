package com.example.one.web;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Xiaok
 * @Date: 2020/11/19 17:24
 */
@Api(tags = "测试controller")
@RestController
@RequestMapping("/test")
public class Knife4jController {

    @ApiOperation("hello1")
    @PostMapping
    public String test1(String name) {
        return "hello," + name;
    }
}
