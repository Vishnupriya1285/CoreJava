package com.java.java8.defaultmethods;

interface Vehicle
{
    void start();
    default void sportingSound()
    {
        System.out.println("Default sporting sound...");
    }
}
class Car implements Vehicle
{

    @Override
    public void start() {
        System.out.println("The car is Starting...");
    }
    @Override
    public void sportingSound() {
        //Vehicle.super.sportingSound();
        System.out.println("The car's sporting sound...");
    }
}
class Train implements Vehicle
{

    @Override
    public void start() {
        System.out.println("The Train is Starting...");
    }
}
public class DefaultMethodOverridingExample {
    public static void main(String[] args) {
        Vehicle c1=new Car();
        c1.start();
        c1.sportingSound();

        System.out.println("===================================");
        Vehicle t1=new Train();
        t1.start();
        t1.sportingSound();
    }
}
