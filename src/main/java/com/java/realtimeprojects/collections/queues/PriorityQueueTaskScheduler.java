package com.java.realtimeprojects.collections.queues;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

//Lavanya Saravanan
public class PriorityQueueTaskScheduler {
    public static void main(String[] args) throws InterruptedException {

        Comparator<Task1> comp = new Comparator<Task1>() {
            @Override
            public int compare(Task1 o1, Task1 o2) {
                return o1.getTaskPriority().compareTo(o2.getTaskPriority());
            }
        };

       Queue<Task1> pq = new PriorityQueue(comp);

        //Queue<Task1> pq = new PriorityQueue();

       pq.add(new Task1("task1",TaskPriority1.LOW));
        pq.add(new Task1("task2",TaskPriority1.MEDIUM));
        pq.add(new Task1("task3",TaskPriority1.HIGH));
        pq.add(new Task1("task4",TaskPriority1.LOW));
        pq.add(new Task1("task5",TaskPriority1.MEDIUM));
        pq.add(new Task1("task6",TaskPriority1.HIGH));
        pq.add(new Task1("task7",TaskPriority1.CRITICAL));
        pq.add(new Task1("task8",TaskPriority1.HIGH));
        pq.add(new Task1("task9",TaskPriority1.LOW));
        pq.add(new Task1("task10",TaskPriority1.HIGH));
        pq.add(new Task1("task11",TaskPriority1.MEDIUM));
        pq.add(new Task1("task12",TaskPriority1.CRITICAL));

        System.out.println(pq);

        //Thread.sleep(3000);

        while(!pq.isEmpty()){
            Thread t = new Thread(pq.poll());
            t.start();
            Thread.sleep(1000);

        }


    }
}

//Named Constant
enum TaskPriority1{
    CRITICAL ,HIGH , MEDIUM,LOW
}

class Task1 implements Runnable,Comparable<Task1>{
    String taskName ;

    TaskPriority1 taskPriority;

    public Task1(String taskName, TaskPriority1 taskPriority) {
        this.taskName = taskName;
        this.taskPriority = taskPriority;
    }

    public String getTaskName() {
        return taskName;
    }

    public TaskPriority1 getTaskPriority() {
        return taskPriority;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+";;;is processing task ;;; "+this.taskName+this.taskPriority);
    }
    @Override
    public int compareTo(Task1 o){
        return this.getTaskPriority().compareTo(o.getTaskPriority());
    }
    @Override
    public String toString() {
        return "Task1{" +
                "taskName='" + taskName + '\'' +
                ", taskPriority=" + taskPriority +
                '}'+"\n";
    }
}
