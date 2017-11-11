package com.example.zoo.zoo;

import java.util.ArrayList;

/**
 * Created by user on 10/11/2017.
 */

public class Zoo {

    private ArrayList<Enclosure> enclosures;

    public Zoo() {

        this.enclosures = new ArrayList<>();

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

}
