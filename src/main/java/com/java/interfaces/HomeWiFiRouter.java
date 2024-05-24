package com.java.interfaces;

public class HomeWiFiRouter implements Power,Connectable,WiFiRouter{
    @Override
    public void configure() {
        System.out.println("Configuring...");
    }

    @Override
    public void reset() {
        System.out.println("Reset done!!!");
    }

    @Override
    public void connect() {
        Connectable.super.connect();
        WiFiRouter.super.connect();
    }

    @Override
    public void disconnect() {
        System.out.println("Disconnected from this WiFi");
    }

    @Override
    public void turnOn() {
        System.out.println("Home WiFi Router is turned on!");
    }

    @Override
    public void turnOff() {
        System.out.println("Home WiFi Router is turning off...");

    }
}
