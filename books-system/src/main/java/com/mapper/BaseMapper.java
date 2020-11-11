package com.mapper;

import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface BaseMapper<T,I> {
    T findById(I id);
    List<T> find(T entity);
    I count(@Param("entity") T entity);
    List<T> findPage(@Param("entity") T entity, @Param("start") int start, @Param("rows") int rows);
    void add(T entity);
    void update(T entity);
    void delete(I id);
}
