package com.example.zoo.zoo;

import com.example.zoo.animals.Animal;

import java.util.ArrayList;

/**
 * Created by user on 10/11/2017.
 */

public class Zoo {

    private ArrayList<Enclosure> enclosures;
    private double balance;
//    private Animal animal;
    private double ticketPrice;
    private ArrayList<Visitor> visitors;

    public Zoo(double balance, double ticketPrice) {

        this.enclosures = new ArrayList<>();
        this.balance = balance;
//        this.animal = animal;
        this.ticketPrice = ticketPrice;
        this.visitors = new ArrayList<>();

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

    public ArrayList<Visitor> getVisitors() {
        return visitors;
    }

    public double getTicketPrice() {
        return ticketPrice;

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
////        for(int i = 0 ; i < getEnclosures().size() ; i++) {
////            Enclosure enclosure = getEnclosures().get(i);
////            for ( Animal animal : enclosure ) {
////                totalValue += animal.getCashValue();
////            }
////        }
//
//        for( Enclosure enclosure : enclosures ) {
//            for( Animal animal :  ) {
//                totalValue += animal.getCashValue();
//            }
//        }
//
//        return totalValue;
//    }

    public void visitorEntersTheZoo(Visitor visitor) {
        visitors.add(visitor);
        balance += ticketPrice;
    }


}
