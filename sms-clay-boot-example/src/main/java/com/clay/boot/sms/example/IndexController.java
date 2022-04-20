package com.clay.boot.sms.example;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.clay.boot.sms.autoconfigure.SmsSender;

/**
 * @author lei
 */
@RestController
public class IndexController {

    @Resource
    private SmsSender aliyunSmsSender;

    @GetMapping("/")
    public String index() {
        aliyunSmsSender.send();
        return "hi";
    }

}
