package com.entity;

import lombok.Data;

import java.util.Date;

@Data
public class ExchangeType {
    Integer id;
    Integer money;
    Integer points;
    Integer state;
    Date publishDate;
}
