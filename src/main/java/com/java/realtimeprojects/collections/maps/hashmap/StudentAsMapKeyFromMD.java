package com.java.realtimeprojects.collections.maps.hashmap;

import java.util.*;

public class StudentAsMapKeyFromMD {
    //Map<Student, Map<String, Map<String, Integer>>> studentDatabase = new HashMap<>();
    private static Map<Student, Map<String, Map<String, Integer>>> studentDatabase = new HashMap<>();
    public static void main(String[] args) {

        // Student data
        // 2000
        // Computer science - 100
        // Math - 90
        StudentAsMapKeyFromMD studentAsMapKey = new StudentAsMapKeyFromMD();
        studentAsMapKey.addStudentDetails();

        // Iterating over the studentDatabase
        for(Map.Entry<Student, Map<String, Map<String, Integer>>> studentEntry: StudentAsMapKeyFromMD.studentDatabase.entrySet()){
            System.out.println(studentEntry.getKey());
            System.out.println(studentEntry.getValue());
        }
    }

    public List<Student> getStudentList(){
        List<Student> students = new ArrayList<>();
        students.add(new Student(2000, "Alice", "Wonderland"));
        students.add(new Student(2001, "Bob", "Builder"));
        students.add(new Student(2002, "Charlie", "Chaplin"));
        students.add(new Student(2003, "David", "Beckham"));
        students.add(new Student(2004, "Eva", "Gloria"));
        return students;
    }

    public void addStudentDetails(){
        List<Student> students = getStudentList();
        for(Student student: students){
            Map<String, Map<String, Integer>> academicDetails = new HashMap<>();
            Map<String, Integer> subjectMarks = new HashMap<>();
            subjectMarks.put("Computer Science", 100);
            subjectMarks.put("Math", 90);
            academicDetails.put("Semester1", subjectMarks);
            studentDatabase.put(student, academicDetails);
        }
    }

    static class Student {
        private int studentId;
        private String firstName;
        private String lastName;

        public Student(int studentId, String firstName, String lastName) {
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

        @Override
        public String toString() {
            return "Student{" +
                    "studentId=" + studentId +
                    ", firstName='" + firstName + '\'' +
                    ", lastName='" + lastName + '\'' +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Student student = (Student) o;
            return studentId == student.studentId && Objects.equals(firstName, student.firstName) && Objects.equals(lastName, student.lastName);
        }

        @Override
        public int hashCode() {
            return Objects.hash(studentId, firstName, lastName);
        }
    }
}