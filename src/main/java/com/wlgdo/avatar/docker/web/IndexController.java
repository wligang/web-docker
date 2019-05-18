package com.wlgdo.avatar.docker.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author: Ligang.Wang[wlgchun@l63.com]
 * Date: 2019/5/18 23:52
 */
@RestController
public class IndexController {

    Logger logger = LoggerFactory.getLogger(getClass());

    @GetMapping("index")
    public Object index() {

        logger.info("This is atest:{}");
        return "welcome to Hido";
    }
}
