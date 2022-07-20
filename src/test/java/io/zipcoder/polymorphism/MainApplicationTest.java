package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MainApplicationTest {

    @Test
    public void setNewPetName() {
        Pets p = new Dog ("Mark");
        p.setNewPetName("MarkBark");

        Assert.assertEquals("MarkBark", p.getPetName());
    }

    @Test
    public void getPetName(){
        Pets p = new Dog ("Bark");
        p.speak();
        Assert.assertEquals("WOOF!!!", p.speak());
    }
@Test
    public void setNewPetName2() {
        Pets p = new Cat ("Mewo");
        p.setNewPetName("Meowth");

        Assert.assertEquals("Meowth", p.getPetName());
    }

    @Test
    public void getPetName2(){
        Pets p = new Cat ("Meowth");
        p.speak();
        Assert.assertEquals("ME-OWWWWWWW!", p.speak());
    }

    @Test
    public void setNewPetName3() {
        Pets p = new Snake ("Slithy");
        p.setNewPetName("Slitheren");

        Assert.assertEquals("Slitheren", p.getPetName());
    }

    @Test
    public void getPetName3(){
        Pets p = new Snake ("Slitheren");
        p.speak();
        Assert.assertEquals("SLITHHHHHHHHER!", p.speak());
    }


}