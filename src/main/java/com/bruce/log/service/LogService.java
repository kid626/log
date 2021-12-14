package com.bruce.log.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * @Copyright Copyright © 2021 fanzh . All rights reserved.
 * @Desc
 * @ProjectName log
 * @Date 2021/12/14 9:11
 * @Author fzh
 */
@Service
public class LogService {

    private final Logger logger = LoggerFactory.getLogger(LogService.class);

    public void third() {
        logger.info("third step");
    }
}
