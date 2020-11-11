package com.util;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * 表示一页的数据
 * @param <T> 分页类存储的数据的类型
 */
@Data
public class Page<T> {
    private int total;        // 总记录数
    private int pages;        // 总页数
    private int page;         // 当前页码
    private int num = 10;     // 每页显示的记录数
    private int start;        // 当前页的起始位置
    private List<T> data = new ArrayList<>();  // 一页的数据
    public Page(int total){
        this(total,1);
    }
    public Page(int total, int page){
        this(total,page,10);
    }
    public Page(int total, int page, int num){
        this.total = total;
        this.page = page;
        this.num = num;
        this.pages = total % num == 0 ? total / num : total / num + 1;
        this.start = (this.page - 1) * this.num;
    }

    public Message<T> toMessage() {
        Message<T> message = new Message<>();
        message.setCode("0");
        message.setData(data);
        message.setCount(total);
        return message;
    }
}
