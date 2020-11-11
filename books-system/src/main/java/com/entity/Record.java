package com.entity;

import lombok.Data;

import java.util.Date;

@Data
public class Record {
    Integer id;
    Integer chapterId;
    Integer words;
    Date readDate;
    Integer userId;
}
