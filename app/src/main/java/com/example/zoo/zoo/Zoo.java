package com.example.zoo.zoo;

import com.example.zoo.animals.Animal;

import java.util.ArrayList;

/**
 * Created by user on 10/11/2017.
 */

public class Zoo {

    private ArrayList<Enclosure> enclosures;
    private double balance;

    public Zoo(double balance) {

        this.enclosures = new ArrayList<>();
        this.balance = balance;

    }

    public void addAnEnclosure(Enclosure enclosure) {
        enclosures.add(enclosure);
    }

    public void removeAnEnclosure(Enclosure enclosure) {
        enclosures.remove(enclosure);
    }

    public ArrayList<Enclosure> getEnclosures() {
        return enclosures;
    }

    public double getBalance() {
        return balance;
    }

    public int getTotalNumberOfAnimalsInAllEnclosures() {
        int i;
        int totalAnimals = 0;
        for(i = 0 ; i < getEnclosures().size() ; i++) {
            Enclosure enclosure = getEnclosures().get(i);
            int animalsInThisEnclosure = enclosure.getSize();
            totalAnimals += animalsInThisEnclosure;
        }
        return totalAnimals;
    }

    public double sellAnAnimal(Animal animal) {
        balance += animal.getCashValue();
        return balance;
    }

}
