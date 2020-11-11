package com.service.impl;

import com.entity.User;
import com.mapper.UserMapper;
import com.service.UserService;
import com.util.Message;
import com.util.Page;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userService")     // 专用于业务层
@Data
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public Message<User> list(User user, int page, int rows) {
        int total = userMapper.count(user);
        Page<User> pageBean = new Page(total,page,rows);
        List<User> list = userMapper.findPage(user, pageBean.getStart(), rows);
        pageBean.setData(list);
        return pageBean.toMessage();
    }
    @Override
    public User login(String name, String password) {
        return null;
    }

    @Override
    public void register(User user) {

    }

}
