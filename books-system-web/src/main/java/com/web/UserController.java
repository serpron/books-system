package com.web;

import com.entity.User;
import com.service.UserService;
import com.util.Message;
import com.util.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping(value = "/users")
    public Message<User> list(User user,
                              @RequestParam(defaultValue = "1") int page,
                              @RequestParam(defaultValue = "10") int rows){
        return userService.list(user, page, rows);
    }
}
