/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2013 All Rights Reserved.
 */
package com.custom.app.service.task;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 
 * @author wb-tianzd
 * @version $Id: QuartzTest.java, v 0.1 2013-10-18 上午10:41:47 wb-tianzd Exp $
 */
public class QuartzTest {

    /**
     * 
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Test start.");
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-*.xml");
        //如果配置文件中将startQuertz bean的lazy-init设置为false 则不用实例化
        System.out.print("Test end..\n");
    }

}
