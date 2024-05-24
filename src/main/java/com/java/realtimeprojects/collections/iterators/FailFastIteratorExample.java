package com.java.realtimeprojects.collections.iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FailFastIteratorExample {
    public static void main(String[] args) throws InterruptedException {
        List<String> transactionsList=new ArrayList<>();
        transactionsList.add("Transaction 1");
        transactionsList.add("Transaction 2");
        transactionsList.add("Transaction 3");
        transactionsList.add("Transaction 4");

        System.out.println(Thread.currentThread().getName()+" :: Transactions :: "+transactionsList);

        Iterator<String> listIterator=transactionsList.iterator();
        Runnable runnable=()->{
            transactionsList.add("Transactions 5");
            //transactionsList.remove("Transactions 3");
            transactionsList.remove(2);
            System.out.println(Thread.currentThread().getName()+" :: Transactions :: "+ transactionsList);
        };
        Thread t1=new Thread(runnable,"Iterating Thread");
        t1.start();
        Thread.sleep(1000);

        while(listIterator.hasNext())
            System.out.println(Thread.currentThread().getName()+"::"+listIterator.next());

    }
}
