package com.example.zoo.zoo;

import java.util.ArrayList;

/**
 * Created by user on 10/11/2017.
 */

public class Enclosure<Animal> {

    private ArrayList<Animal> enclosure;

    public Enclosure() {
        this.enclosure = new ArrayList<>();
    }

    public void addAnimalToEnclosure(Animal animal) {
        enclosure.add(animal);
    }

    public void removeAnimalFromEnclosure(Animal animal) {
        enclosure.remove(animal);
    }

    public ArrayList<Animal> getEnclosure() {
        return enclosure;
    }
}
