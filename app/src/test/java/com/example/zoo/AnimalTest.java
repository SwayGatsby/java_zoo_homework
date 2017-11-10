package com.example.zoo;

import com.example.zoo.animals.Animal;
import com.example.zoo.animals.Lion;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 10/11/2017.
 */

public class AnimalTest {

    Animal animal;
    Lion lion;

    @Before
    public void before() {
        animal = new Animal(100, "Jennifer");
        lion = new Lion(250, "Ted");
    }

    @Test
    public void testCanGetAnimalCashValue() {
        assertEquals(100, animal.getCashValue(), 0.10);
    }

    @Test
    public void testCanGetLionName() {
        assertEquals("Ted", lion.getName());
    }

}
