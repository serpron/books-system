package com.entity;

import lombok.*;

import java.util.Date;
import java.util.List;

@Data                     // 生成set/get方法、equals方法、hadcode方法和toString方法
@RequiredArgsConstructor  // 生成所有必填属性构成的构造方法
@NoArgsConstructor        // 生成默认的构造方法
public class Book {
    Integer id;
    @NonNull String title;
    @NonNull Integer author;
    User owner;
    String summary;
    Integer chapterCount;
    Integer processState;
    Integer points;
    Double score;
    Integer replies;
    Integer currentChapter;
    Date publishDate;
    String coverPic;
    @NonNull Integer categoryId;
    List<Chapter> chapterList;
}
