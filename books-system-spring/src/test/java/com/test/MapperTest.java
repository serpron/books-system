package com.test;

import com.entity.Book;
import com.entity.User;
import com.mapper.UserMapper;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class MapperTest {
    @Test
    public void find(){
        // 1. 创建Spring工厂，读取XML，读取文件，监听器加载
        ApplicationContext factory
                = new ClassPathXmlApplicationContext("main.xml");
        // 2. 向工厂索取对象
        UserMapper userMapper = (UserMapper)factory.getBean("userMapper");
        List<User> users = userMapper.find(null);
        Assert.assertNotNull(users);
        Assert.assertEquals(8, users.size());
    }
}
