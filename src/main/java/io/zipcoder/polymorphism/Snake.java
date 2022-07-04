package io.zipcoder.polymorphism;

public class Snake extends Pets {


    public Snake(String petName) {
        super(petName);
    }

    @Override
    public String speak() {
        return "SLITHHHHHHHHER!";
    }
}
