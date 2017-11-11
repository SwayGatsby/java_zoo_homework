package com.example.zoo.animals;

/**
 * Created by user on 10/11/2017.
 */

public class Animal {

    private double cashValue;
    private String name;

    public Animal(double cashValue, String name) {
        this.cashValue= cashValue;
        this.name = name;
    }

    public double getCashValue() {
        return cashValue;
    }

    public String getName() {
        return name;
    }
}
