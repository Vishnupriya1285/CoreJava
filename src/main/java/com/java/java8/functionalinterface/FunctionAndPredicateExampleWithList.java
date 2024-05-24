package com.java.java8.functionalinterface;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FunctionAndPredicateExampleWithList {
    public static void main(String[] args) {
        List<Student> stuList=getStudentListFromDb();

        //Get all the Students DOB who has grades A or A+

        //Predicate and Function use case
        Stream<Student> stuStream=stuList.stream();

        Predicate<Student> stuGradePredicate=(student) -> student.getStuGrade().equalsIgnoreCase("A")||student.getStuGrade().equalsIgnoreCase("A+");
        Stream<Student> filteredStuStreamByGrade=stuStream.filter(stuGradePredicate);

        //List<Student> filteredStuListByGrade=filteredStuStreamByGrade.toList();
        //System.out.println(filteredStuListByGrade);

        List<Student> filteredStuListByGrade1=filteredStuStreamByGrade.collect(Collectors.toList());
        System.out.println(filteredStuListByGrade1);

        //Using Function
        Function<Student,LocalDate> mapStudentToLocalDateFunction=(student) -> {
            return student.getStuDOB();
        };
        Stream<LocalDate> localDateStream=filteredStuListByGrade1.stream().map(mapStudentToLocalDateFunction);
        List<LocalDate> localDateList=localDateStream.collect(Collectors.toList());

        System.out.println(localDateList);

    }
    public static List<Student> getStudentListFromDb() {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(101, "aaa", "A", LocalDate.of(2005, 3, 06)));
        studentList.add(new Student(102, "bbb", "A+", LocalDate.of(2006, 10, 07)));
        studentList.add(new Student(103, "vvv", "B", LocalDate.of(2007, 4, 11)));
        studentList.add(new Student(104, "www", "A+", LocalDate.of(2008, 11, 30)));
        studentList.add(new Student(105, "qqq", "A", LocalDate.of(2009, 5, 13)));
        studentList.add(new Student(106, "aoo", "B+",LocalDate.of(2001, 6, 21)));
        studentList.add(new Student(107, "ppp", "C", LocalDate.of(2004, 8, 19)));
        studentList.add(new Student(108, "ggg", "B", LocalDate.of(2003, 10, 07)));
        return studentList;
    }
}
class Student
{
    private int StuId;
    private String stuName;
    private String stuGrade;
    private LocalDate stuDOB;
    public Student(int stuId, String stuName, String stuGrade, LocalDate stuDOB) {
        StuId = stuId;
        this.stuName = stuName;
        this.stuGrade = stuGrade;
        this.stuDOB = stuDOB;
    }
    public int getStuId() {
        return StuId;
    }
    public String getStuName() {
        return stuName;
    }
    public String getStuGrade() {
        return stuGrade;
    }
    public LocalDate getStuDOB() {
        return stuDOB;
    }
    @Override
    public String toString() {
        return "Student{" +
                "StuId=" + StuId +
                ", stuName='" + stuName + '\'' +
                ", stuGrade='" + stuGrade + '\'' +
                ", stuDOB=" + stuDOB +
                '}';
    }
}