package com.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration  // java配置bean
public class MyBatisConfig {
    @Bean
    public DruidDataSource druidDataSource(){
        com.alibaba.druid.pool.DruidDataSource dataSource
                = new com.alibaba.druid.pool.DruidDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://127.0.0.1:3306/books?useUnicode=true&amp;characterEncoding=utf-8");
        dataSource.setUsername("root");
        dataSource.setPassword("111111111");
        return dataSource;
    }
}
