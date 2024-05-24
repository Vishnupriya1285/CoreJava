package org.example.interviewprep;

import java.util.HashMap;
import java.util.Map;

 final class ImmutableClass
{
    private final String studentName;
    private final int regId;
    private final Map<String,String> metaData;


    ImmutableClass(String studentName, int regId, Map<String, String> metaData) {
        this.studentName = studentName;
        this.regId = regId;
        Map<String,String> tempData=new HashMap<>();
        for(Map.Entry<String,String> entry : metaData.entrySet())
        {
            tempData.put(entry.getKey(),entry.getValue());
        }
        this.metaData = tempData;
    }

    public String getStudentName() {
        return studentName;
    }

    public int getRegId() {
        return regId;
    }

    public Map<String, String> getMetaData() {
        HashMap<String,String> tempData=new HashMap<>();
        for(Map.Entry<String,String> entry : this.metaData.entrySet())
        {
            tempData.put(entry.getKey(), entry.getValue());
        }
        return tempData;
    }
}

public class ImmutableClassRunner {
    public static void main(String[] args) {
        Map<String,String> marks=new HashMap<>();
        marks.put("Maths","100");
        marks.put("DBMS","70");
        marks.put("Java","85");
        ImmutableClass student1=new ImmutableClass("Vishnu",122,marks);
        System.out.println(student1.getStudentName());
        System.out.println(student1.getRegId());
        System.out.println(student1.getMetaData());
        marks.put("Java","80");
        System.out.println(student1.getMetaData());
    }
}