package com.java.exceptionhandling;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class CustomResourcesException {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your name: ");
            String name = sc.nextLine();
            System.out.println("Enter your roll number: ");
            int rollNumber = Integer.parseInt(sc.nextLine());
            System.out.println("Enter the marks separated with comas to calculate your percentile: ");
            String marks = sc.nextLine();
            List<Double> marksList = createList(marks);
            System.out.println("Your percentile is: " + calculatePercentile(marksList));
        }catch(IllegalArgumentException | ArithmeticException e)
        {
            System.out.println("Enter valid Details!");
        }
        catch(Exception e){
            //System.out.println("Enter valid details!" + e.getCause().getMessage());
            System.out.println(e.getMessage());
        }
    }
    private static List<Double> createList(String marks) {
        List<Double> marksList=new ArrayList<>();
        try
        {
            for(String m:marks.split(","))
               marksList.add(Double.parseDouble(m));
        }catch(NumberFormatException e){
            throw new IllegalArgumentException("Enter valid marks!");
        }
        return marksList;
    }
    private static double calculatePercentile(List<Double> marksList) throws FailedExamExcepion {
        int count=0;
        double totalMarks=0.0;
        double percentile=0.0;
        for(double marks:marksList)
        {
            if(marks<35.0)
                throw new FailedExamExcepion("You are failed! You have to write the exam again!");
            totalMarks+=marks;
            count++;
        }
        count*=100;
        percentile=(totalMarks/count)*100;
        if(percentile<35.0)
            throw new FailedExamExcepion("You are failed! You have to write the exam again!");
        return percentile;
    }
}
class FailedExamExcepion extends RuntimeException
{
    FailedExamExcepion(String message)
    {
        super(message);
    }
}
