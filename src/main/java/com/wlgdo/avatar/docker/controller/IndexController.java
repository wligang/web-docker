package com.wlgdo.avatar.docker.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalTime;
import java.util.Date;

/**
 * Author: Ligang.Wang[wlgchun@l63.com]
 * Date: 2019/5/18 23:52
 */
@RestController
public class IndexController {

    Logger logger = LoggerFactory.getLogger(getClass());

    @GetMapping("index")
    public Object index() {

        logger.info("Hello developer,when you see this console,you have been successful({})", LocalTime.now());
        return String.format("welcome to Hido:[%s]", LocalTime.now());
    }

    @GetMapping("user/{userName}")
    public Object getUser(@PathVariable String userName) {
        logger.info("Welcome to you :[{}]---{}", userName, new Date());

        return String.format("welcome to Hido,your login UserName is[%s]", userName);
    }


}
