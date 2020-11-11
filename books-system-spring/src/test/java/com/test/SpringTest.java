package com.test;

import com.entity.Book;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {
    @Test
    public void getBean(){
        // 1. 创建Spring工厂，读取XML，读取文件，监听器加载
        ApplicationContext factory
                = new ClassPathXmlApplicationContext("applicationContext.xml");
        // 2. 向工厂索取对象
        Book book = (Book)factory.getBean("book");
        Assert.assertNotNull(book);
        Assert.assertEquals(2,book.getChapterList().size());
        System.out.println(book.getChapterList().size());
    }
}
