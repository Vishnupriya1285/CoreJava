package com.java.exceptionhandling;

class StudentDetails1
{
    private int age,rollNo;
    private String name;
    public StudentDetails1(int age,String name,int rollNo) throws IllegalArgumentException
    {
        this.age = age;
        this.rollNo = rollNo;
        this.name=name;

        try{
            if(age<0 || age>18)
                throw new IllegalArgumentException("Please provide age between 1 to 18!");
            if(rollNo<=0)
                throw new IllegalArgumentException("Please provide valid roll Number!");
            if(name.equals(""))
                throw new NullPointerException("Please enter your name!");
        }catch(NullPointerException | IllegalArgumentException e)
        {
            System.out.println("Please provide valid student details!"+e.getMessage());
        }
    }

    @Override
    public String toString() {
        return "StudentDetails{" +
                "age=" + age +
                ", rollNo=" + rollNo +
                ", name='" + name + '\'' +
                '}';
    }
}

public class ConstructorThrowingException {
    public static void main(String[] args) {

        StudentDetails1 s1=new StudentDetails1(13,"David",100);
        System.out.println(s1.toString());
        System.out.println("------------------------------------------");

        StudentDetails1 s2=new StudentDetails1(15,"",101);
        System.out.println(s2.toString());
        System.out.println("------------------------------------------");

        StudentDetails1 s3=new StudentDetails1(18,"James",0);
        System.out.println(s3.toString());

        System.out.println("------------------------------------------");

        StudentDetails1 s4=new StudentDetails1(17,"priya",101);
        System.out.println(s4.toString());

        System.out.println("------------------------------------------");

        StudentDetails1 s5=new StudentDetails1(25,"Vishnu",101);
        System.out.println(s5.toString());
    }
}
