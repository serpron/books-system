package com.web;

import com.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
public class ParamController {
    // http://localhost:8080/single?name=张三&password=123
    @RequestMapping("/single")
    public void single(String name, String password, HttpServletResponse response)
            throws IOException {
        response.getWriter().write("success");
    }
    // http://localhost:8080/single?id=100
    @RequestMapping("/findByid")
    public void findById(int id, HttpServletResponse response)
            throws IOException {
        response.getWriter().write("success");
    }
    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public void add(User user, HttpServletResponse response) throws IOException {
        response.getWriter().write("success");
    }
}
