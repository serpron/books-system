package com.entity;

import lombok.Data;

@Data
public class User {
    Integer id;
    String name;
    Integer roleId;
    String phone;
    String email;
    String weixin;
    String qq;
    String uuid;
}
