package com.java.java8.defaultmethods;

public class BackwardCompatibility {
    public static void main(String[] args) {

    }
}
interface AppleMusicSystem
{
    void bluetooth();
    void fmRadio();
    default void doblyAtomsChannel()
    {
        System.out.println("Dobly Atoms Channel");
    }
    static void satelliteConnectivity()
    {
        System.out.println("Connected to the Satellite");
    }
}
class MGHector implements AppleMusicSystem
{
    @Override
    public void bluetooth() {
        AppleMusicSystem.satelliteConnectivity();
    }
    @Override
    public void fmRadio() {

    }
    @Override
    public void doblyAtomsChannel()
    {

    }
}
class TeslaModel3 implements AppleMusicSystem
{

    @Override
    public void bluetooth() {

    }

    @Override
    public void fmRadio() {

    }
}