package com.java.polymorphism;

public class AnimatedCharacter {
    public static void main(String[] args) {
        Animal animal;
        animal=new Fox("Jack");
        animal.makeSound();
        animal.makeMoves();
        animal.eating();
        animal=new Lion("Sher");
        animal.makeSound();
        animal.makeMoves();
        animal.eating();
        animal=new Monkey("George");
        animal.makeSound();
        animal.makeMoves();
        ((Monkey)animal).swinging();
        animal.eating();
    }

}
