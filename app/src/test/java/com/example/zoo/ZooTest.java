package com.example.zoo;

import com.example.zoo.animals.Lion;
import com.example.zoo.animals.Panda;
import com.example.zoo.zoo.Enclosure;
import com.example.zoo.zoo.Zoo;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 10/11/2017.
 */

public class ZooTest {

    private Zoo zoo;
    private Enclosure lionEnclosure;
    private Enclosure pandaEnclosure;
    private Lion lion;
    private Panda panda;

    @Before
    public void before() {
        lionEnclosure = new Enclosure<Lion>();
        pandaEnclosure = new Enclosure<Panda>();
        zoo = new Zoo(0.00);
        lion = new Lion(55, "Jeremy");
        panda = new Panda(80, "Midge");
    }

    @Test
    public void canGetZooBalance() {
        assertEquals(0.00, zoo.getBalance(), 0.10);
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

    @Test
    public void testZooCanCalculateTotalNumberOfAnimalsInAllEnclosures() {
        zoo.addAnEnclosure(lionEnclosure);
        zoo.addAnEnclosure(pandaEnclosure);
        lionEnclosure.addAnimalToEnclosure(lion);
        pandaEnclosure.addAnimalToEnclosure(panda);
        assertEquals(2, zoo.getTotalNumberOfAnimalsInAllEnclosures());
    }

    @Test
    public void testTheZooCanSellAnAnimal() {
        assertEquals(55.00, zoo.sellAnAnimal(lion), 0.10);
    }

//    @Test
//    public void testGetTotalValueOfAllAnimalsInTheZoo() {
//        zoo.addAnEnclosure(lionEnclosure);
//        zoo.addAnEnclosure(pandaEnclosure);
//        lionEnclosure.addAnimalToEnclosure(lion);
//        pandaEnclosure.addAnimalToEnclosure(panda);
//        assertEquals(135.00, zoo.getTotalValueOfAllAnimalsInZoo(), 0.10);
//    }

}