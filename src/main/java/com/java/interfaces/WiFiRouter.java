package com.java.interfaces;

public interface WiFiRouter extends Configurable {
    default void connect()
    {
        //Connectable.super.connect();
        System.out.println("Connecting with WiFiRouter...");
    }
}
