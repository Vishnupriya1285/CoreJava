package com.java.myapp.util;

public class MathUtils {
    private int num1,num2;

    public MathUtils(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int add(int num1, int num2)
    {
        return num1+num2;
    }
    public int subtraction(int num1,int num2)
    {
        return num1-num2;
    }
    public int multiplication(int num1,int num2)
    {
        return num1*num2;
    }
    public int division(int num1,int num2)
    {
        int result=0;
        try
        {
            result=num1/num2;
        }catch(ArithmeticException e){
            System.out.println("Can't divide by zero"+e.getMessage());
        }
        return result;
    }
}
