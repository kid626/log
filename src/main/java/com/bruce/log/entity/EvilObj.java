package com.bruce.log.entity;

import javax.naming.Context;
import javax.naming.Name;
import javax.naming.spi.ObjectFactory;
import java.util.Hashtable;

/**
 * @Copyright Copyright © 2021 fanzh . All rights reserved.
 * @Desc
 * @ProjectName log
 * @Date 2021/12/13 18:00
 * @Author fzh
 */
public class EvilObj implements ObjectFactory {

    static {
        System.out.println("I'm evil");
    }

    @Override
    public Object getObjectInstance(Object obj, Name name, Context nameCtx, Hashtable<?, ?> environment) throws Exception {
        return null;
    }
}
