package com.entity;

import lombok.Data;

import java.util.Date;

@Data
public class Chapter {
    Integer id;
    Integer chapterId;
    String content;
    Integer words;
    Date publishDate;
    Integer bookId;   // 书的id
    Book book;          // 书籍类的对象
    Integer readCount;
    Integer replyCount;
    Integer payState;
    String title;
}
