package com.entity;

import lombok.Data;

import java.util.Date;

@Data
public class ExchangeRecord {
    Integer id;
    Integer userId;
    Integer money;
    Integer points;
    Integer exchangeTypeId;
    Date exchangeDate;
}
