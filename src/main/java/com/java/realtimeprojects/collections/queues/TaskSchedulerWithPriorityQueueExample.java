package com.java.realtimeprojects.collections.queues;

import java.util.PriorityQueue;
import java.util.Queue;

enum TaskPriority
        {
            CRITICAL,HIGH,MEDIUM,LOW
        }

class Task implements Runnable,Comparable<Task>
{
    private String taskName;
    private TaskPriority taskPriority;

    public Task(String taskName, TaskPriority taskPriority) {
        this.taskName = taskName;
        this.taskPriority = taskPriority;
    }
    public String getTaskName() {
        return taskName;
    }
    public TaskPriority getTaskPriority() {
        return taskPriority;
    }
    @Override
    public void run() {
        System.out.println("Thread ::"+Thread.currentThread().getName()+" is processing the "+this.getTaskName());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String toString() {
        return "Task{" +
                "taskName='" + taskName + '\'' +
                ", taskPriority=" + taskPriority +
                '}';
    }

    @Override
    public int compareTo(Task t) {
        return this.getTaskPriority().compareTo(t.getTaskPriority());
    }
}
public class TaskSchedulerWithPriorityQueueExample {
    public static void main(String[] args) {
        Queue<Task> taskQueue=new PriorityQueue<>();
        taskQueue.offer(new Task("LOW Priority Thread 001",TaskPriority.LOW));
        taskQueue.offer(new Task("LOW Priority Thread 002",TaskPriority.LOW));
        taskQueue.offer(new Task("MEDIUM Priority Thread 101",TaskPriority.MEDIUM));
        taskQueue.offer(new Task("MEDIUM Priority Thread 102",TaskPriority.MEDIUM));
        taskQueue.offer(new Task("HIGH Priority Thread 03",TaskPriority.HIGH));
        taskQueue.offer(new Task("LOW Priority Thread 004",TaskPriority.LOW));
        taskQueue.offer(new Task("MEDIUM Priority Thread 103",TaskPriority.MEDIUM));
        taskQueue.offer(new Task("LOW Priority Thread 005",TaskPriority.LOW));
        taskQueue.offer(new Task("CRITICAL Priority Thread 6",TaskPriority.CRITICAL));
        taskQueue.offer(new Task("MEDIUM Priority Thread 104",TaskPriority.MEDIUM));
        taskQueue.offer(new Task("LOW Priority Thread 007",TaskPriority.LOW));
        taskQueue.offer(new Task("HIGH Priority Thread 08",TaskPriority.HIGH));
        taskQueue.offer(new Task("MEDIUM Priority Thread 105",TaskPriority.MEDIUM));
        taskQueue.offer(new Task("CRITICAL Priority Thread 9",TaskPriority.CRITICAL));
        taskQueue.offer(new Task("HIGH Priority Thread 010",TaskPriority.HIGH));

        System.out.println(taskQueue);
        while(!taskQueue.isEmpty())
        {
            Task task=taskQueue.poll();
            System.out.println("Processing ::"+task.getTaskName());
            Thread thread=new Thread(task);
            thread.start();
        }
    }
}
