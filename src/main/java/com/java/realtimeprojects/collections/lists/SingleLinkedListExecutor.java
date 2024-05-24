package com.java.realtimeprojects.collections.lists;

import static com.java.realtimeprojects.collections.lists.UnsortedLinkedList.unsortedLinkedList;

class Node<T>
{
    T data;
    Node<T> next;
    public Node(T data)
    {
        this.data=data;
        this.next=null;
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                ", next=" + next +
                ", data=" + data +
                '}';
    }
}
class SingleLinkedList<T>
{
    private Node<T> head;
    public SingleLinkedList()
    {
        this.head=null;
    }

    public Node<T> getHead() {
        return this.head;
    }

    //Insert data from the beginning
    public void insertDataFromBeginning(T data)
    {
        Node<T> newNode=new Node<>(data);
        newNode.next=this.head;
        this.head=newNode;
    }

    //Insert data at the end
    public void insertDataAtTheEnd(T data)
    {
        Node<T> newNode=new Node<>(data);
        if(this.head == null) {
            this.head = newNode;
            return;
        }
        Node<T> temp=this.head;
        while(temp.next!=null)
             temp=temp.next;
        temp.next=newNode;
    }
    public void displayList()
    {
        if(this.head==null) {
            System.out.println("The list is empty!!");
            return;
        }
        Node<T> temp=this.head;
        while(temp!=null) {
            System.out.print(temp.data+"=>");
            temp = temp.next;
        }
        System.out.print("null");
        System.out.println();
    }

    //Delete node at the end
    public void deleteAtEnd()
    {
        if(this.head==null)
            System.out.println("The list is empty!!");
        Node<T> temp=this.head;
        Node<T> prevToLast=null;
        while(temp.next!=null)
        {
            prevToLast=temp;
            temp=temp.next;

        }
        prevToLast.next= null;

    }
    //Delete node from beginning
    public void deleteFromBeginnning()
    {
        if(this.head==null)
            System.out.println("The list is empty!!");
        this.head=head.next;

    }

    //Sorting the given Linked List
    public void sort(Node<Integer> head)
    {
        if(this.head==null)
            System.out.println("The linked list is empty!!");
        Node<Integer> temp=head;

        while(temp!=null)
        {
            Node<Integer> nextTemp=temp.next;
            while(nextTemp!=null)
            {
                if(temp.data>nextTemp.data)
                {
                    int tempData=temp.data;
                    temp.data=nextTemp.data;
                    nextTemp.data=tempData;
                }
                nextTemp=nextTemp.next;
            }
            temp=temp.next;
        }
    }


        @Override
    public String toString() {
        return "SingleLinkedList{" +
                "head=" + head +
                '}';
    }
}

public class SingleLinkedListExecutor {
    public static void main(String[] args) {

        SingleLinkedList<Integer> integerSingleLinkedList=new SingleLinkedList<>();
//        integerSingleLinkedList.insertDataFromBeginning(10);
//        integerSingleLinkedList.insertDataFromBeginning(20);
//        integerSingleLinkedList.insertDataAtTheEnd(30);
//        integerSingleLinkedList.insertDataAtTheEnd(40);
//        integerSingleLinkedList.insertDataAtTheEnd(50);
//
//        integerSingleLinkedList.displayList();
//
//        integerSingleLinkedList.deleteFromBeginnning();
//        integerSingleLinkedList.displayList();
//
//        integerSingleLinkedList.deleteAtEnd();
//        integerSingleLinkedList.displayList();
//        System.out.println();
        System.out.println("-------------------------------------------------------------------------------");

        integerSingleLinkedList=unsortedLinkedList();
        System.out.println("Before sorting :::");
        integerSingleLinkedList.displayList();
        Node<Integer> headOfUnsortedList=integerSingleLinkedList.getHead();

        integerSingleLinkedList.sort(headOfUnsortedList);
        integerSingleLinkedList.displayList();


        //integerSingleLinkedList.sortLinkedList(headOfUnsortedList);
        System.out.println("After sorting :::");
        integerSingleLinkedList.displayList();

        System.out.println(integerSingleLinkedList);
    }
}
class UnsortedLinkedList
{
    static SingleLinkedList<Integer> unsortedLinkedList() {
        SingleLinkedList<Integer> unsortedLinkedList = new SingleLinkedList<>();

        unsortedLinkedList.insertDataFromBeginning(40);
        unsortedLinkedList.insertDataFromBeginning(55);
        unsortedLinkedList.insertDataFromBeginning(600);
        unsortedLinkedList.insertDataFromBeginning(90);
        unsortedLinkedList.insertDataAtTheEnd(10);
        unsortedLinkedList.insertDataAtTheEnd(-500);
        unsortedLinkedList.insertDataAtTheEnd(70);

        return unsortedLinkedList;
    }

}

