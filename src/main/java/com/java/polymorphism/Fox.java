package com.java.polymorphism;

public class Fox extends Animal{
    private String animalName;
    Fox(String animalName)
    {
        super(animalName);
        this.animalName=animalName;
    }

    @Override
    public void makeSound() {
        System.out.println(animalName+" the fox is howling!");
    }

    @Override
    public void makeMoves() {
        System.out.println(animalName+" the fox is walking!");
    }
}
