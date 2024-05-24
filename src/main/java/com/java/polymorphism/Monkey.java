package com.java.polymorphism;

public class Monkey extends Animal{
    private String animalName;
    Monkey(String animalName)
    {
        super(animalName);
        this.animalName=animalName;
    }
    @Override
    public void makeSound() {
        System.out.println(animalName+" the monkey is making sound!");
    }

    @Override
    public void makeMoves() {
        System.out.println(animalName+" the monkey is climbing on a tree");
    }
    protected void swinging()
    {
        System.out.println(animalName+" the monkey is swinging on the tree!");
    }
}
