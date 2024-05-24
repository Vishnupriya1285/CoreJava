package com.java.core.day1;

class SingletonClass {
    private int num1;
    private SingletonClass()
    {
        throw new UnsupportedOperationException();
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }
    public static void main(String[] args) {
        SingletonClass obj=new SingletonClass();
    }
}
public class SingletonClassRunner
{
//    public static void main(String[] args) {
//        //SingletonClass obj=new SingletonClass();
//    }
}
