package com.util;

import lombok.Data;
import java.util.List;

@Data
public class Message<T> {
    String code;
    String msg;
    Integer count;
    List<T> data;
}
