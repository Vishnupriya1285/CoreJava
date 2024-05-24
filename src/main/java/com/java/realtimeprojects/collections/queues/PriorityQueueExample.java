package com.java.realtimeprojects.collections.queues;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        Queue<Integer> priorityQueue=new PriorityQueue<>(Comparator.reverseOrder());
        priorityQueue.offer(60);
        priorityQueue.offer(30);
        priorityQueue.offer(35);
        priorityQueue.offer(10);
        System.out.println(priorityQueue);
        int removedElement=priorityQueue.poll();
        System.out.println("The element removed from front of the Queue is::"+removedElement);
        System.out.println("The head of the queue is::"+priorityQueue.peek());

    }
}
