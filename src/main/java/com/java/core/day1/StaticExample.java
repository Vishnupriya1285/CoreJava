package com.java.core.day1;

class StaticDetails
{
    private static int num1;
    private int num2;

    public StaticDetails(int num2) {
        this.num2 = num2;
    }

    static
    {
        num1=120;
        System.out.println(num1);
        StaticExample.main(new String[]{"Vishnu,priya"});
    }
    public static void staticMethod()
    {
        System.out.println("In static method");
    }
    public void instanceMethod()
    {
        System.out.println("In instance method");
    }
}
public class StaticExample {
    public static void main(String[] args) {
        StaticDetails obj=new StaticDetails(10);
        obj.instanceMethod();
        StaticDetails.staticMethod();
        for(String s:args)
           System.out.println(s);
    }

}
