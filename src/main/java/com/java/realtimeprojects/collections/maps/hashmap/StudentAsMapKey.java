package com.java.realtimeprojects.collections.maps.hashmap;

import java.util.*;

public class StudentAsMapKey {
    private  static Map<AcademicStudent, Map<String, Map<String, Integer>>> studentDatabase = new HashMap();

    public static void main(String[] args) {
        List<AcademicStudent> studentList=getStudentList();

        for(AcademicStudent stu:studentList)
        {
            stu.setAcademicHistory(prepareAcademicHistoryMap());
            studentDatabase.put(stu,prepareAcademicHistoryMap());
        }
        System.out.println(studentList);
        System.out.println(studentDatabase);
    }

    private static List<AcademicStudent> getStudentList() {
        List<AcademicStudent> studentList=new ArrayList<>();
        studentList.add(new AcademicStudent(1,"aaa","bbb"));
        studentList.add(new AcademicStudent(2,"ddd","bbb"));
        studentList.add(new AcademicStudent(3,"eee","bbb"));
        studentList.add(new AcademicStudent(4,"aaa","bbb"));
        studentList.add(new AcademicStudent(5,"aaa","mmm"));

        return studentList;
    }
    public static Map<String,Map<String,Integer>> prepareAcademicHistoryMap()
    {
        Map<String,Map<String,Integer>> academicHistoryMap=new HashMap<>();
        academicHistoryMap.put("2000",getAcademicValues());
        academicHistoryMap.put("2001",getAcademicValues());
        academicHistoryMap.put("2002",getAcademicValues());
        academicHistoryMap.put("2006",getAcademicValues());

        return academicHistoryMap;
    }

    private static Map<String, Integer> getAcademicValues() {
        Map<String,Integer> scoreHistoryMap=new HashMap<>();
        scoreHistoryMap.put("English",95);
        scoreHistoryMap.put("Mathematics",100);
        scoreHistoryMap.put("Sanskrit",99);
        scoreHistoryMap.put("Science",90);
        scoreHistoryMap.put("Computers",92);
        scoreHistoryMap.put("Social Studies",88);

        return scoreHistoryMap;
    }
}


class AcademicStudent
{
    private int studentId;
    private String firstName;
    private String lastName;
    Map<String,Map<String,Integer>> academicHistory=new HashMap<>();

    public AcademicStudent(int studentId, String firstName, String lastName) {
        this.studentId = studentId;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Map<String, Map<String, Integer>> getAcademicHistory() {
        return academicHistory;
    }

    public void setAcademicHistory(Map<String, Map<String, Integer>> academicHistory) {
        this.academicHistory = academicHistory;
    }

    @Override
    public String toString() {
        return "AcademicStudent{" +
                "studentId=" + studentId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", academicHistory=" + academicHistory +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AcademicStudent that)) return false;
        return getStudentId() == that.getStudentId() && Objects.equals(getFirstName(), that.getFirstName()) && Objects.equals(getLastName(), that.getLastName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getStudentId(), getFirstName(), getLastName());
    }
}