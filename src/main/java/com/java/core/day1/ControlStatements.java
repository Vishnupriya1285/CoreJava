package com.java.core.day1;

public class ControlStatements {
    private static void breakWithNestedFor()
    {
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<10;j++)
            {
                if(j==5)
                    break;
                System.out.println(j);
            }
            System.out.println("*********************");
        }
    }
    private static void continueWithWhile()
    {
        System.out.println("In While loop");
        int count=1;
        while(count<=10)
        {
            if(count==5)
                break;
            System.out.println(count);
            count++;
        }
        System.out.println("Out of the loop");
    }
    private static void ifCondition()
    {
        int num1=20;
        int num2=10;
        if(num1%num2==0)
            System.out.printf("%d is divisible by %d",num1,num2);
        System.out.println();

    }
    public static void main(String[] args) {
        ifCondition();
        breakWithNestedFor();
        continueWithWhile();
    }
}
