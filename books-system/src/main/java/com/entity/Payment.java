package com.entity;

import lombok.Data;

import java.util.Date;
@Data
public class Payment {
    Integer id;
    Integer userId;
    Date payDate;
    String period;
    Integer money;
    Integer state;
    Integer approveId;
    Date approveDate;
}
