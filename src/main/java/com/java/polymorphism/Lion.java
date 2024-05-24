package com.java.polymorphism;

public class Lion extends Animal{
    private String animalName;
    Lion(String animalName)
    {
        super(animalName);
        this.animalName=animalName;
    }
    @Override
    public void makeSound() {
        System.out.println(animalName+" the Lion is roaring!");
    }

    @Override
    public void makeMoves() {
        System.out.println(animalName+" the Lion is making moves");
    }
}
