package com.java.core.day1;
class Animal
{

}
class Dog extends Animal
{

}
class Cat extends Animal
{

}
class Horse extends Animal
{

}

public class OperatorsExample {
    private static void logicalOperators()
    {
        String name1="Vishnu";
        String name2="vishnu";
        System.out.println(name1.equals(name2));

        boolean isTrue=true;
        boolean isFalse=false;

        System.out.println(isTrue && isFalse);
        System.out.println(isTrue || isFalse);
        System.out.println(!isTrue);
    }
    private static void relationalOperators()
    {
        int num1=20;
        int num2= 10;
        System.out.println(num1==num2);
        System.out.println(num1>=num2);
        System.out.println(num1!=num2);
        System.out.println(num1<=num2);

        if(num1%num2==0)
            System.out.println("Even number!");
        else
            System.out.println("Odd number!");
    }
    public static void main(String[] args) {
        instanceOfOperator();
        logicalOperators();
        relationalOperators();
        OperatorsExample obj1=new OperatorsExample();
        obj1.ternaryOperator();
        bitwiseOperator();
    }
    public void ternaryOperator()
    {
        int num1=12;
        int num2=3;
        String result=(num1%num2)==0 ? "Even":"Odd";
        System.out.println(result);
        int age=20;
        String passport="valid";
        String isEligible =(age>=18)?passport=="valid"?"can Enter":"Deport":"Deport";
        System.out.println(isEligible);

    }
    private static void instanceOfOperator()
    {
       // Dog animal =new Animal(); //can't create an object of parent class with child class reference

        Animal dog=new Dog();
        Animal cat=new Cat();
        Horse horse=new Horse();
        if(dog instanceof Animal)
            System.out.println("Dog is an instance of animal class");
        if(cat instanceof Cat)
            System.out.println("Cat is an instance of Cat class");
        if(horse instanceof Animal)
            System.out.println("Horse is an instance of Animal class");
        if(horse instanceof Horse)
            System.out.println("Instance of Horse class");

    }
    private static void bitwiseOperator()
    {
        int num1=20;
        int num2=30;
        //int result=num1&num2;
        System.out.println(num1&num2);
        System.out.println(num1|num2);
        System.out.println(num1^num2);
        System.out.println(~num1);
    }
}
