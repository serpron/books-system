package com.entity;

import lombok.Data;

import java.util.Date;

@Data
public class Reply {
    Integer id;
    Integer bookId;
    String content;
    Integer star;
    Date publishDate;
    Integer parentId;
    Integer level;
}
