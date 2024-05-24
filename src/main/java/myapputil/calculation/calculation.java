package myapputil.calculation;

import com.java.myapp.util.MathUtils;

public class calculation {
    public static void main(String[] args) {
        MathUtils calcObj=new MathUtils(3,5);
        System.out.println("The addition of the given numbers is::"+calcObj.add(2,3));
        System.out.println("The subtraction of the given numbers is::"+calcObj.subtraction(5,3));
        System.out.println("The division of the given numbers is::"+calcObj.division(6,0));
        System.out.println("The multiplication of the given numbers is::"+calcObj.multiplication(5,6));
    }
}
