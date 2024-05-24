package com.java.interfaces;

public class Tablet implements Power,Connectable,WiFiRouter{
    private WiFiRouter wiFiRouter;
    public Tablet(WiFiRouter wiFiRouter)
    {
        this.wiFiRouter=wiFiRouter;
    }
    @Override
    public void connect() {
        wiFiRouter.connect();
        System.out.println("Connected ...");
    }

    @Override
    public void disconnect() {
        System.out.println("Disconnected...");
    }

    @Override
    public void turnOn() {
        System.out.println("Turned on!");
    }

    @Override
    public void turnOff() {
        System.out.println("Turning Off...");
    }
    public void playingGames()
    {
        System.out.println("The game is on...You are playing the game!!!");

    }

    @Override
    public void configure() {
        System.out.println("Configured!");
    }

    @Override
    public void reset() {
        System.out.println("Reset done!");
    }
}
