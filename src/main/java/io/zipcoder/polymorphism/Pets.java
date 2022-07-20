package io.zipcoder.polymorphism;

public class Pets {
    private String petName;

    public Pets(String petName){
        this.petName = petName;
    }
    public void setNewPetName(String newName){
        this.petName = newName;
    }

    public String getPetName(){
        return petName;
    }
public String speak(){
   return "uhhh... animal sounds of some sort";
    }


}
