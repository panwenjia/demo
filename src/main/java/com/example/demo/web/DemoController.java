package com.example.demo.web;

import com.example.demo.entity.DataResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description: 测试请求
 * @Author panwenjia
 * @Date 2019-11-06 18:32
 */
@RestController
@RequestMapping("user")
public class DemoController {

    private static final Logger LOG = LoggerFactory.getLogger(DemoController.class);

    @PostMapping("login")
    public DataResult login(String userName,String password){
        Thread curThread = Thread.currentThread();
        String name = curThread.getName();
        LOG.debug("请求成功，线程：{}, username:{}, password:{}",name,userName,password);
        return DataResult.success();
    }
}
