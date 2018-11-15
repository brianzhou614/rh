package com.brian.rh.jdbc.spring.utils;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * @Author: zhouxinye
 * @Date: 2018/11/13 13:31
 * @Version 1.0
 */
public class ApplicationContextUtils {
    private static ApplicationContext ioc = new FileSystemXmlApplicationContext("src/main/resources/application.xml");
    public static void main(String[] args){
        System.out.print(ApplicationContextUtils.ioc);
    }
    public static ApplicationContext getApplicationContext(){
        return ioc;
    }
}
