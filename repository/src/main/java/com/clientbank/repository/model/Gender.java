package com.clientbank.repository.model;

/**
 * Created by elena on 04.08.15.
 */
public enum Gender {

    FEMALE("Female"),
    MALE("Male");

    Gender(String name) {
        this.name=name;
    }

    private String name;

    public String getName() {
        return name;
    }
}
