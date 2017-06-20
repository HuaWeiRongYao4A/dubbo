package com;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @author: lkz
 * @description : 启动Provider服务
 * @createTime : 2017/06/19
 */
public class StartProvider {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"config/dubbo-provider.xml"});
        context.start();
        System.out.println("这里是dubbo-provider服务...");
        try {
            //为保证服务一直开着，利用输入流的阻塞来模拟
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
