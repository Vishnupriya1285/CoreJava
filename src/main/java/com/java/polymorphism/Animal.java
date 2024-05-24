package com.java.polymorphism;

public abstract class Animal {
    private String animalName;
    protected Animal(String animalName)
    {
        this.animalName=animalName;
    }
    public abstract void makeSound();
    public abstract void makeMoves();
    public void eating()
    {
        System.out.println(animalName+" is eating food!");
    }
}
