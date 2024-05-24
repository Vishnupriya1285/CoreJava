package com.java.realtimeprojects.collections.maps.hashmap;

import java.util.*;

public class StudentDatabaseUsingHashMap {
    public static void main(String[] args) {
        Map<Integer,Student> studentDatabase=new HashMap<>();
        studentDatabase.put(101,new Student(101,"John",18,"A"));
        studentDatabase.put(102,new Student(102,"Robert",19,"B"));
        studentDatabase.put(103,new Student(103,"James",17,"A++"));
        studentDatabase.put(104,new Student(104,"Justin",18,"C"));
        studentDatabase.put(105,new Student(105,"Rose",19,"A"));
        studentDatabase.put(106,new Student(106,"Smith",18,"D"));

        System.out.println(studentDatabase);
        for(Student s:studentDatabase.values())
            System.out.println(s);


        //Iterating Map key and Values using entrySet and iterator
        Set<Map.Entry<Integer, Student>> studentEntries = studentDatabase.entrySet();
        for(Map.Entry<Integer, Student> studentEntry : studentEntries) {
            System.out.println(studentEntry.getKey() +" :: "+ studentEntry.getValue());
        }

        Set<Integer> keySet = studentDatabase.keySet();
        System.out.println("Key Set:: "+keySet);
        Collection<Student> values = studentDatabase.values();
        System.out.println("Values ::"+values);

        // Mapping List Of Students By Class
        Map<String, List<Student>> studentsByClass = new HashMap<>();

        Student alice = new Student(101,"Alice", 18, "A");
        Student bob = new Student(102,"BOB", 17, "A+");
        Student bikash = new Student(103,"bikash", 16, "A++");

        List<Student> sectionA = new ArrayList<>();
        sectionA.add(alice);
        sectionA.add(bob);
        sectionA.add(bikash);

        System.out.println(sectionA);

        studentsByClass.put("SectionA", sectionA);

        System.out.println(studentsByClass);

    }
}

class Student
{
    private int studentId;
    private String studentName;
    private int age;
    private String grade;

    public Student(int studentId, String studentName,int age, String grade) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.age=age;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", age=" + age +
                ", grade='" + grade + '\'' +
                '}';
    }
}