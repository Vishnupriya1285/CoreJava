package com.java.exceptionhandling;

public class NullPointerExceptionExample {
    public static void main(String args[]){
        Student s1=new Student();
        Student s2=new Student();
        s1.insertRecord(100,"Amy",6);
        s2.insertRecord(222,"",5);
        s1.displayInformation();

        System.out.println("-----------------------");

        s2.displayInformation();
    }
}
class Student {
    int rollNum;
    String name;
    double age;

    public void insertRecord(int r, String n, double a) {
        rollNum = r; name = n; age = a;
        try {
            if (n=="") throw new NullPointerException("name should not be null");
        } catch (NullPointerException e1){
            System.out.println("There is NullPointerException here. "+e1.getMessage());
            if (r <= 0) System.out.println("your age printed cant be 0= " + r);
        } catch (IllegalArgumentException e) {
            e.getMessage();
        }
        if (!(a >=0 && a<=18)) throw new IllegalArgumentException("Student age should be 0 to 18") ;
    }

    public void displayInformation(){

        System.out.println("Student Details entered :" +
                "Rollnum :" + rollNum +
                " , Name: " + name +
                ",age:" + age);
    }
}
