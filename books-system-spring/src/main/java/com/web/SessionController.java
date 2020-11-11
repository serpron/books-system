package com.web;

import com.entity.User;
import com.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

@Controller
// 请求作用域、会话作用域
public class SessionController {
    @Resource
    UserMapper userMapper;
    @RequestMapping(value = "/find",method = RequestMethod.GET)
    public String add(String name, String password,
                    Map map,  // 请求作用域
                    HttpServletRequest request) throws IOException {
        User user = userMapper.findByName(name,password);
        map.put("user1",user); //
        request.getSession().setAttribute("user2",user);  // 存入会话作用域
        return "result";
    }
}
