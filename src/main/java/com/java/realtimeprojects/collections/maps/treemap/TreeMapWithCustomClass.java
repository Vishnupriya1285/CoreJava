package com.java.realtimeprojects.collections.maps.treemap;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapWithCustomClass {

    public static void main(String[] args) {
        StudentComparator studentComparator=new StudentComparator();

        Map<Student,String> studentMap=new TreeMap<>(studentComparator);

        studentMap.put(new Student(101, "Alice"), "C");
        studentMap.put(new Student(103, "Bharath"), "A");
        studentMap.put(new Student(102, "Bhuvan"), "B");
        studentMap.put(new Student(105, "Bhushan"), "A");

        for(Map.Entry<Student,String > entry:studentMap.entrySet()) {
            Student student=entry.getKey();
            System.out.println("Student Roll Number ::"+student.getStuID()
                    + ", Name :: " + student.getStuName()+", Grade :: "+entry.getValue());
        }
    }
}
class Student
{
    private int stuID;
    private String stuName;

    public Student(int stuID, String stuName) {
        this.stuID = stuID;
        this.stuName = stuName;
    }
    public int getStuID() {
        return stuID;
    }
    public String getStuName() {
        return stuName;
    }
}
class StudentComparator implements Comparator<Student>
{

    @Override
    public int compare(Student o1, Student o2) {
        return Integer.compare(o1.getStuID(),o2.getStuID());
    }
}