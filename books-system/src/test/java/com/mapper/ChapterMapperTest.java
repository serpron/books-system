package com.mapper;

import com.entity.Book;
import com.entity.Chapter;
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
import java.util.List;

public class ChapterMapperTest {

    ChapterMapper chapterMapper;
    BookMapper bookMapper;
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
        chapterMapper = sqlSession.getMapper(ChapterMapper.class);
        bookMapper = sqlSession.getMapper(BookMapper.class);
    }
    @After
    public void destory(){
        sqlSession.close();
    }
    @Test
    public void findWithBook(){
        List<Chapter> list = chapterMapper.findWithBook();
        Assert.assertNotNull(list);
        Assert.assertEquals(24,list.size());
    }

    @Test
    public void findAllBook(){
        List<Book> list = bookMapper.find(null);
        Assert.assertNotNull(list);
    }

    
}
