package com.java.realtimeprojects.collections.queues;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Deque;

public class QueueExample {
    public static void main(String[] args) {
        Queue<Integer> intQueue=new LinkedList<>();
        intQueue.offer(10);
        intQueue.offer(20);
        intQueue.offer(30);
        intQueue.offer(40);
        intQueue.offer(50);
        intQueue.offer(40);
        intQueue.offer(40);
        intQueue.offer(60);
        intQueue.offer(null);
        intQueue.offer(null);

        System.out.println("The Queue of integers is:: "+intQueue);
        int delValue=intQueue.poll();
        System.out.println(delValue);
        System.out.println("The Queue of integers after poll() is:: "+intQueue);
        System.out.println("The head of the Queue is:: "+intQueue.peek());

       // while(intQueue.peek()!=null)
        while(!intQueue.isEmpty())
            System.out.println("The removed head of the Queue is:: "+intQueue.poll());
        System.out.println("New Queue after deletion is:: "+ intQueue);
        System.out.println("The size of the Queue is::"+intQueue.size());
        System.out.println(intQueue.isEmpty());

        //DeQueue methods
        Deque<Integer> intDeQueue=new LinkedList<>();
        intDeQueue.offer(10);
        intDeQueue.offer(20);
        intDeQueue.offer(30);
        intDeQueue.offer(40);
        intDeQueue.offer(50);
        intDeQueue.offer(40);
        intDeQueue.offer(40);
        System.out.println("The last element in the Queue is::"+intDeQueue.peekLast());
        System.out.println("Removed element from the tail of the Queue is::"+intDeQueue.pollLast());
        System.out.println("The last element in the Queue is::"+intDeQueue.peekFirst());
        System.out.println("Removed element from the tail of the Queue is::"+intDeQueue.pollFirst());
        System.out.println(intDeQueue);
        System.out.println(intDeQueue.offerFirst(-10));
        System.out.println(intDeQueue.offerLast(200));
        intDeQueue.addFirst(-20);
        intDeQueue.addLast(100);
        System.out.println(intDeQueue);
        System.out.println("The size of the Queue is::"+intDeQueue.size());
        System.out.println(intDeQueue.isEmpty());
    }
}
