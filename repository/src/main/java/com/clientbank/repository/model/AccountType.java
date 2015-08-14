package com.clientbank.repository.model;

/**
 * Created by elena on 04.08.15.
 */
public enum AccountType {
    DEBIT("Debit"),
    CREDIT("Credit");

    AccountType(String name) {
        this.name=name;
    }

    private String name;

    public String getName() {
        return name;
    }
}
