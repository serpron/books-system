package com.mapper;

import com.entity.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.Reader;

public class UserMapperTest {

    UserMapper userMapper;
    SqlSession sqlSession;
    @Before
    public void init() throws IOException {
        // 3. 获取SqlSession=》java.sql.Connection
        // SqlSessionFactoryBuilder(建工厂的工人)=>SqlSessionFactory（工厂）=>SqlSession
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        // 1.加载配置文件
        Reader reader = Resources.getResourceAsReader("mybatis-config.xml");
        // 2.创建SqlSessionFactory
        SqlSessionFactory factory = builder.build(reader);
        // 3. 获取SqlSession
        sqlSession = factory.openSession();
        userMapper = sqlSession.getMapper(UserMapper.class);
    }
    @After
    public void destory(){
        sqlSession.close();
    }
    @Test
    public void findById(){
        User user = userMapper.findById(1);
        Assert.assertNotNull(user);
        Assert.assertEquals("张三",user.getName());
    }

    @Test
    public void findByName(){
        User user = userMapper.findByName("张三","123");
        Assert.assertNotNull(user);
        Assert.assertEquals(1,user.getId().intValue());
    }
}
