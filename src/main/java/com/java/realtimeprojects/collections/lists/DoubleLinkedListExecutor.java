package com.java.realtimeprojects.collections.lists;

class NodeDouble<T>
{
    T data;
    NodeDouble<T> prev;
    NodeDouble<T> next;
    public NodeDouble(T data)
    {
        this.data=data;
        this.prev=null;
        this.next=null;
    }

    @Override
    public String toString() {
        return "NodeDouble{" +
                "data=" + data +
                ", prev=" + prev!=null ? prev.data.toString() : "" +
                ", next=" + next!=null ? next.data.toString() : "" +
                '}';
    }

}

class DoubleLinkedList<T> {
    private NodeDouble<T> head;

    public DoubleLinkedList() {
        this.head = null;
    }

    //Inserting data from beginning
    public void insertDataFromBeginning(T data)
    {
        NodeDouble<T> newNode=new NodeDouble<>(data);

        if(this.head!=null)
            this.head.prev=newNode;
        newNode.next=this.head;
        this.head=newNode;
    }

    //Inserting data at the end
    public void insertDataAtTheEnd(T data)
    {
        NodeDouble<T> newNode=new NodeDouble<>(data);
        if(this.head==null)
        {
            this.head=newNode;
            return;
        }
        NodeDouble<T> temp=this.head;
        while(temp.next!=null)
           temp=temp.next;
        temp.next=newNode;
        newNode.prev=temp;
    }

    //Display the List
    public String displayList()
    {
        if(this.head==null) {
            System.out.println("The list is empty!!");
            return "null";
        }
        String dlContent = "";
        NodeDouble<T> temp=this.head;
        while(temp!=null) {
            dlContent += temp.data+"<=>";
            System.out.print(temp.data+"<=>");
            temp = temp.next;
        }
        dlContent += null;
        System.out.print("null");
        System.out.println();
        return dlContent;
    }

    @Override
    public String toString() {
        return "DoubleLinkedList{" +
                "head=" + this.displayList() +
                '}';
    }

    //Delete the node from beginning
    public void deleteFromBeginning() {
        if(this.head==null) {
            System.out.println("The list is empty!!");
            return;
        }
        this.head=head.next;
        this.head.prev=null;
    }

    //Delete the node at the end of the list
    public void deleteAtEnd() {
        if(this.head==null) {
            System.out.println("The list is empty!!");
            return;
        }
        NodeDouble<T> temp=this.head;
        while(temp.next!=null)
            temp=temp.next;
        temp=temp.prev;
        temp.next=null;

    }
}
public class DoubleLinkedListExecutor {
    public static void main(String[] args) {

        DoubleLinkedList<Integer> integerDoubleLinkedList=new DoubleLinkedList<>();
        integerDoubleLinkedList.insertDataFromBeginning(100);
        integerDoubleLinkedList.insertDataFromBeginning(200);
        integerDoubleLinkedList.insertDataFromBeginning(600);
        integerDoubleLinkedList.insertDataAtTheEnd(300);
        integerDoubleLinkedList.insertDataAtTheEnd(400);
        integerDoubleLinkedList.insertDataAtTheEnd(500);

        integerDoubleLinkedList.displayList();

        integerDoubleLinkedList.deleteFromBeginning();
        integerDoubleLinkedList.displayList();

        integerDoubleLinkedList.deleteAtEnd();
        integerDoubleLinkedList.displayList();
        System.out.println();

        System.out.println(integerDoubleLinkedList);
    }
}