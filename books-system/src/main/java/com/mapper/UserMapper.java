package com.mapper;

import com.entity.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper extends BaseMapper<User,Integer>{
    User findByName(@Param("name") String name, @Param("password") String password);
}
