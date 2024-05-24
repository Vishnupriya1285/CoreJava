package com.java.java8.functionalinterface;

public class RunnableWithLambdaExpressionExample {
    public static void main(String[] args) {
        //Before Java 8 implementing using another class to use interface
        Runnable runnable=new Task();
        Task task=new Task();
        Thread t1=new Thread(runnable);
        Thread t2=new Thread(task);
        t1.start();
        t2.start();

        //Before Java 8 using Anonymous Inner Class implementation method
        Runnable r1=new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+" From Anonymous Inner class");
            }
        };
        new Thread(r1).start();

        //1. Using Java 8 Lambda Expression
        Runnable r2=()->{
            System.out.println(Thread.currentThread().getName()+"From Java 8 Lambda Expression!");
        };
        new Thread(r2).start();

        //2. Using Java 8 Lambda Expression
        Runnable r3= ()-> System.out.println(Thread.currentThread().getName()+"From Java 8 Lambda Expression in 1 line!");
        new Thread(r3).start();
        new Thread(r1).start();
    }
}
class Task implements Runnable
{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+" Class implementing Runnable");
    }
}