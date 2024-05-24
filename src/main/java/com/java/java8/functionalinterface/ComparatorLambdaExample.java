package com.java.java8.functionalinterface;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ComparatorLambdaExample {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(1, "aaa", 90.0));
        employeeList.add(new Employee(6, "mmm", 190.0));
        employeeList.add(new Employee(5, "yyy", 290.0));
        employeeList.add(new Employee(7, "yyy", 290.0));
        employeeList.add(new Employee(8, "ccc", 70.0));
        employeeList.add(new Employee(2, "bbb", 10.0));
        employeeList.add(new Employee(3, "bbb", 10.0));
        employeeList.add(new Employee(4, "jjj", 20.0));

        //Before Java 8
        Comparator<Employee> com=new EmployeeSalaryCompare();
        employeeList.sort(com);
        System.out.println(employeeList);

        //Since Java 8
        // sorting names
        Comparator<Employee> comp1=(emp1,emp2)->emp1.getEmpName().compareTo(emp2.getEmpName());
        employeeList.sort(comp1);
        System.out.println(employeeList);
        //sorting empId
        Comparator<Employee> comp2=(emp1,emp2)->Integer.compare(emp1.getEmpId(),emp2.getEmpId());
        employeeList.sort(comp2);
        System.out.println(employeeList);
        //Sorting salary
        Comparator<Employee> comp3=(emp1,emp2)->Double.compare(emp1.getSalary(),emp2.getSalary());
        employeeList.sort(comp3);
        System.out.println(employeeList);
    }
}
class Employee
{
    private int empId;
    private String empName;
    private double salary;
    public Employee(int empId, String empName, double salary) {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
    }
    public int getEmpId() {
        return empId;
    }
    public String getEmpName() {
        return empName;
    }
    public double getSalary() {
        return salary;
    }
    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", salary=" + salary +
                '}';
    }
}
class EmployeeSalaryCompare implements Comparator<Employee>
{
    @Override
    public int compare(Employee o1, Employee o2) {
        return Double.compare(o1.getSalary(),o2.getSalary());
    }
}