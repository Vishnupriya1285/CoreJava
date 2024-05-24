package com.java.java8.functionalinterface;

public class CalculatorAppWithLambdaAndFunctionalInterface {
    public static void main(String[] args) {
        CalculatorFunctionalInterface sum=(n1, n2)->n1+n2;
        CalculatorFunctionalInterface sub=(n1,n2)->n1-n2;
        CalculatorFunctionalInterface mul=(n1,n2)->n1*n2;

        System.out.println(sum.calculate(10,20));
        System.out.println(sub.calculate(12,15));
        System.out.println(mul.calculate(12,15));
        System.out.println(sub.calculate(30,12));

        //Another way passing as function parameter
        int sumResult=operate(sum,10,20);
        int subResult=operate(sub,13,20);
        int mulResult=operate(mul,15,15);

        System.out.println("The Sum is : "+sumResult);
        System.out.println("The Difference is : "+subResult);
        System.out.println("The Multiplication is : "+ mulResult);
    }
    public static int operate(CalculatorFunctionalInterface calc,int num1,int num2)
    {
        return calc.calculate(num1,num2);
    }
}
