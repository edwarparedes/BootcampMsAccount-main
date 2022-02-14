package com.bank.account.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class Account {
    @Id
    private String id;
    private String nameProduct;
    private String cardNumber;
    private String typeAccount;
    private String accountNumber;

    private Double maintenanceFee;
    private int movementLimit;

    private Double balance;

}
