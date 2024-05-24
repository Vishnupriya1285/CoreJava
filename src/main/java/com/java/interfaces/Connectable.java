package com.java.interfaces;

public interface Connectable {
    default void connect()
    {
        System.out.println("Connecting...");
    }
    void disconnect();
}
