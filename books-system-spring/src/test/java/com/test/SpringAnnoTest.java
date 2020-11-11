package com.test;

import com.entity.Book;
import ioc.A;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringAnnoTest {
    @Test
    public void getBean(){
        // 1. 创建Spring工厂，读取XML，读取文件，监听器加载
        ApplicationContext factory
                = new ClassPathXmlApplicationContext("test.xml");
        // 2. 向工厂索取对象
        A a = (A)factory.getBean("a");
        a.call();
        Assert.assertNotNull(a);
    }
}
