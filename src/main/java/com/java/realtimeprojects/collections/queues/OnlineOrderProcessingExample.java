package com.java.realtimeprojects.collections.queues;

import java.util.Deque;
import java.util.LinkedList;

public class OnlineOrderProcessingExample {
    public static void main(String[] args) throws InterruptedException {
        Deque<String> orderNum=new LinkedList<>();
        orderNum.add("Order 001");
        orderNum.add("Order 002");
        orderNum.add("Order 003");
        orderNum.add("Order 004");
        orderNum.add("Order 005");
        orderNum.add("Order 006");

        while(!orderNum.isEmpty())
        {
            String order=orderNum.poll();
            System.out.println("The current order processing is..."+order);
            Thread.sleep(900);
        }

    }
}
