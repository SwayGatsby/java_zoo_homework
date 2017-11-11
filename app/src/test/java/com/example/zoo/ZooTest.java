package com.example.zoo;

import com.example.zoo.animals.Lion;
import com.example.zoo.zoo.Enclosure;
import com.example.zoo.zoo.Zoo;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 10/11/2017.
 */

public class ZooTest {

    Zoo zoo = new Zoo();
    Enclosure lionEnclosure = new Enclosure<Lion>();
    Lion lion = new Lion(55, "Jeremy");

    @Before
    public void before() {
        Enclosure<Lion> lionEnclosure;
        Zoo zoo = new Zoo();
        Lion lion = new Lion(55, "Jeremy");
    }

    @Test
    public void testCanAddAnEnclosureToZoo() {
        zoo.addAnEnclosure(lionEnclosure);
        assertEquals(1, zoo.getEnclosures().size());
    }

    @Test
    public void testCanRemoveAnEnclosureFromZoo() {
        int i;
        for(i = 0 ; i < 5 ; i++){
            zoo.addAnEnclosure(lionEnclosure);
        }
        zoo.removeAnEnclosure(lionEnclosure);
        assertEquals(4, zoo.getEnclosures().size());
    }

    @Test
    public void testCanAddAnimalToEnclosure() {
        lionEnclosure.addAnimalToEnclosure(lion);
        assertEquals(1, lionEnclosure.getEnclosure().size());
    }

    @Test
    public void testCanRemoveAnimalFromEnclosure() {
        int i;
        for(i = 0 ; i < 5 ; i++){
            lionEnclosure.addAnimalToEnclosure(lion);
        }
        lionEnclosure.removeAnimalFromEnclosure(lion);
        assertEquals(4, lionEnclosure.getEnclosure().size());
    }


}
