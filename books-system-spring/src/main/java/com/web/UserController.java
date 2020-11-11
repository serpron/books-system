package com.web;

import com.entity.User;
import com.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/user")
public class UserController {
    // 告诉Spring，给我注入UserMapper类型的对象，如果存在两个这样的对象会报错，如果不存在也会报错
    @Autowired
    private UserMapper userMapper;
    @RequestMapping(value = "/find",method = RequestMethod.GET)
    public String find(Map map){
        List<User> list = userMapper.find(null);
        map.put("list",list);
        return "/index"; // redirect:/index.jsp  forward:/index
    }
    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public String add(User user,Map map){
        userMapper.add(user);
        return "/index";
    }
}
