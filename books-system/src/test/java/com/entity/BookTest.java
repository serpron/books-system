package com.entity;

import org.junit.Test;

public class BookTest {

    @Test
    public void book(){
        Book book = new Book();
        Book book1 = new Book("测试",1,1);
        System.out.println(book1.toString());
    }
}
