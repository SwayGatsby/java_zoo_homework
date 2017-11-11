package com.example.zoo.zoo;

import com.example.zoo.animals.Animal;

import java.util.ArrayList;

/**
 * Created by user on 10/11/2017.
 */

public class Enclosure<T extends Animal> {

    private ArrayList<T> enclosure;

    public Enclosure() {
        this.enclosure = new ArrayList<>();
    }

    public void addAnimalToEnclosure(T animal) {
        enclosure.add(animal);
    }

    public void removeAnimalFromEnclosure(T animal) {
        enclosure.remove(animal);
    }

    public ArrayList<T> getEnclosure() {
        return enclosure;
    }

    public int getSize() {
        return enclosure.size();
    }
}
