package com.clientbank.repository.model;

/**
 * Created by elena on 04.08.15.
 */
public enum Role {

    ADMIN("Admin"),
    CLIENT("Client"),
    CASHIER("Cashier");

    Role(String name) {
        this.name=name;
    }

    private String name;

    public String getName() {
        return name;
    }

}
