package com.java.finalexamples;

import java.util.ArrayList;
import java.util.List;

class FinalClass
{
    private final int empID;
    private final String empName;
    private final List<String> resposibilities;

    FinalClass(int empID, String empName, List<String> resposibilities) {
        this.empID = empID;
        this.empName = empName;
        List<String> tempData=new ArrayList<>();
        for(String entry:resposibilities)
            tempData.add(entry);
        this.resposibilities = tempData;
    }

    public int getEmpID() {
        return empID;
    }

    public String getEmpName() {
        return empName;
    }

    public List<String> getResposibilities() {
        List<String> tempData=new ArrayList<>();
        for(String item:resposibilities)
        {
            tempData.add(item);
        }
        return tempData;
    }
}
public class FinalClassRunner {
    public static void main(String[] args) {
        List<String> responsibilities=new ArrayList<>();
        responsibilities.add("Design");
        responsibilities.add("Code");
        responsibilities.add("Test");
        responsibilities.add("Maintain");
        FinalClass finalClass=new FinalClass(100,"James",responsibilities);
        System.out.println(finalClass.getEmpID());
        System.out.println(finalClass.getEmpName());
        System.out.println(finalClass.getResposibilities());
        responsibilities.add(3,"Deploy");
        System.out.println(finalClass.getResposibilities());
    }
}
