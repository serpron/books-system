package com.service;
import com.entity.User;
import com.util.Message;
import com.util.Page;

/**
 * 业务： 用户词汇=开发词汇（增删改查），登录=查询(findByName)，注册=添加，发布=添加
 */
public interface UserService {
    // 登录
    User login(String name, String password);
    // 注册
    void register(User user);
    // 所有的用户清单
    Message<User> list(User user, int page, int rows);
}
