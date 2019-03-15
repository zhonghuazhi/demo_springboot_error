package net.cc.demo_springboot_error.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @classname HelloController
 * @author: zhonghua.zhi
 * @date: 2019-03-15 11:57
 * @version: 1.0
 * @description: TODO
 */
@RestController
public class HelloController {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String sayHello() {
        throw new RuntimeException("Test Error.");
    }
}