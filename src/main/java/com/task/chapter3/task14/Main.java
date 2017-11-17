package com.task.chapter3.task14;

import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args){
        Employee employee1 = new Employee("name1" , 1);
        Employee employee2 = new Employee("name2" , 2);
        Employee employee21 = new Employee("kname2" , 2);
        Employee employee3 = new Employee("name3" , 3);
        Employee employee4 = new Employee("name4" , 4);

        Employee[] employees = {employee1,employee3,employee2,employee4,employee21};

        Comparator<Employee> comp2 = Comparator.comparing(Employee::getSalary).thenComparing(Comparator.comparing(Employee::getName));


        Arrays.sort(employees,comp2);
        System.out.println("Sort 1:");
        Arrays.stream(employees).forEach(System.out::println);


        System.out.println("Sort 2:");
        //long comparator
        Comparator<Employee> comparatorSalary = Comparator.comparing(Employee::getSalary);
        Comparator<Employee> comparatorName = Comparator.comparing(Employee::getName);
        Comparator<Employee> comp = comparatorName.thenComparing(comparatorSalary);
        Arrays.sort(employees,comp);
        Arrays.stream(employees).forEach(System.out::println);

    }

}
