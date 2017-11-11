package com.example.zoo.zoo;

import com.example.zoo.animals.Animal;

import java.util.ArrayList;

/**
 * Created by user on 10/11/2017.
 */

public class Zoo {

    private ArrayList<Enclosure> enclosures;
    private double balance;
    private Animal animal;

    public Zoo(double balance) {

        this.enclosures = new ArrayList<>();
        this.balance = balance;
        this.animal = animal;

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
        int totalAnimals = 0;
        for(int i = 0 ; i < getEnclosures().size() ; i++) {
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

//    public double getTotalValueOfAllAnimalsInZoo() {
//        int totalValue = 0;
//
//        for(int i = 0 ; i < getEnclosures().size() ; i++) {
//            Enclosure enclosure = getEnclosures().get(i);
//            for ( animal : enclosure ) {
//                totalValue += animal.getCashValue();
//            }
//        }
//
//        return totalValue;
//    }
}
