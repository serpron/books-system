package com.web;

import com.entity.User;
import com.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Map;

@Controller
public class ReturnController {
    @Resource
    UserMapper userMapper;
    @RequestMapping(value = "/user/findAll")
    public String findAll(Map map){
        List<User> users = userMapper.find(null);
        map.put("list",users);
        return "list";
    }
    @RequestMapping(value = "/user/findAll2")
    public void findAll2(HttpServletResponse response) throws IOException {
        List<User> users = userMapper.find(null);
        // <option value="1">张三</option>
        response.setContentType("text/html;charset=utf-8");
        PrintWriter writer = response.getWriter();
        for(User user: users){
            String option = String.format("<option value='%d'>%s</option>"
                    ,user.getId(),user.getName());
            writer.write(option);
        }
        writer.flush();
    }
    @RequestMapping(value = "/user/findAll3")
    public String findAll3(Map map) throws IOException {
        List<User> users = userMapper.find(null);
        map.put("users",users);
        return "/html/option";
    }

    @RequestMapping(value = "/user/findAll4",produces = {MediaType.APPLICATION_JSON_UTF8_VALUE})
    @ResponseBody
    public List<User> findAll4() throws IOException {
        List<User> users = userMapper.find(null);
        return users;
    }
}
