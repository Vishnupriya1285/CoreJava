package com.java.realtimeprojects.collections.iterators;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailSafeIteratorExample {
    public static void main(String[] args) throws InterruptedException {

        //Creating a Collection and adding few elements
        List<String> transactions = new CopyOnWriteArrayList<>();

        transactions.add("Transaction 1");
        transactions.add("Transaction 2");
        transactions.add("Transaction 3");

        System.out.println(Thread.currentThread().getName() + " :: Transactions:: "+ transactions);

        // Creating an Iterator on the collection
        Iterator<String> iterator = transactions.iterator();

        //Creating a Separate Thread
        Runnable runnable = () -> {
            transactions.add("Transaction 4");
            transactions.remove("Transaction 2");
            System.out.println("Thread Name:: " + Thread.currentThread().getName());
            System.out.println("Transactions :: "+ transactions);
        };
        Thread newSeparateThread = new Thread(runnable , "Hacker thread");
        //Starting a new Separate Thread
        newSeparateThread.start();

        //Sleeping Thread-Main for a Second
        Thread.sleep(1000);

        //Iterating the Elements of Collections on Thread-Main
        while(iterator.hasNext()) {
            String transaction = iterator.next();
            System.out.println(Thread.currentThread().getName() +" :: "+transaction);
        }
    }
}
