package com.lhx.testlin;

import com.lhx.testlin.entity.User;
import com.lhx.testlin.mapper.HelloMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Autowired
    HelloMapper helloMapper;
    @GetMapping("/hello")
    public String hello(){
        User name = helloMapper.getName();

        System.out.println(111222111);
        return name.toString();

    }
}
