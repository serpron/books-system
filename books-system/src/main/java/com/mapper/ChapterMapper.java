package com.mapper;

import com.entity.Chapter;
import java.util.List;

public interface ChapterMapper extends BaseMapper<Chapter,Integer> {
    List<Chapter> findWithBook();
}
