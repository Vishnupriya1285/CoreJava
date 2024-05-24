package com.java.finalexamples;

class FinalMethod
{
    final int num=10;
    final Computer computer;

    public FinalMethod(Computer computer) {
        this.computer = computer;
        computer.brand="apple";
    }

// In this case can't create default constructor bcos it gives error as "the final variable might not get iniatilized"
//    public FinalMethod() {
//
//    }

    public void nonFinalMethod()
    {
        System.out.println("This is not final");
    }
    public final void finalMethod()
    {
        System.out.println("This method is final");
    }
}
class ChildFinal extends FinalMethod
{
    int num1;
    public ChildFinal(Computer computer) {
        super(computer);
        this.num1=num;
        System.out.println(num1);
    }

    @Override
    public final void nonFinalMethod()
    {
        System.out.println("I'm final method now!");
    }
    //Can't override as it's a final method
//    public void finalMethod()
//    {
//
//    }

}
class Child1 extends ChildFinal
{
    public Child1(Computer computer) {
        super(computer);
        ChildFinal childFinal=new ChildFinal(new Computer("Dell inspiron","core i3"));
        childFinal.nonFinalMethod();
    }
 }
class Computer
{
    String config;
    String brand;
    public Computer(String config, String brand) {
        this.config = config;
        this.brand = brand;
    }
}
public class FinalMethodRunner {
    public static void main(String[] args) {
        FinalMethod finalMethod=new FinalMethod(new Computer("Lenovo","intel core i5"));
        finalMethod.nonFinalMethod();
        finalMethod.finalMethod();
        ChildFinal childFinal=new ChildFinal(new Computer("Dell","intel core i3"));
        childFinal.nonFinalMethod();
        childFinal.finalMethod();
    }
}
