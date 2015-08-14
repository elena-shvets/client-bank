package com.clientbank.repository.model;

import java.util.Date;

/**
 * Created by elena on 04.08.15.
 */
//@Entity
//@Table(name="account")
public class Account {

//    @Id
//    @GeneratedValue(strategy= GenerationType.AUTO)
//    @Column(name="id_account", unique=true, nullable=false)
    private Integer id;

//    @Column(name="client_id")
    private int clientId;

//    @Column(name="type_id")
    private int typeId;

//    @Column(name="balance")
    private double balance;

//    @Column(name="currency")
    private Currency currency;


    private AccountType accountType;

//    @Column(name="date_create")
    public Date date_create;

    public Account() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    public int getTypeId() {
        return typeId;
    }

    public void setTypeId(int typeId) {
        this.typeId = typeId;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }

    public Date getDate_create() {
        return date_create;
    }

    public void setDate_create(Date date_create) {
        this.date_create = date_create;
    }
}
