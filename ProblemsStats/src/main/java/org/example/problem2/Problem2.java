package org.example.problem2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Problem2 {
    public static void main(String[] args) {
        Project project1 = new Project(1,"projectA");
        Project project2 = new Project(2,"projectB");
        Project project3 = new Project(3,"projectC");
        Project project4= new Project(4,"projectD");
        Project project5 = new Project(5,"projectE");

        Employee employee1= new Employee(1,"Vaibhav","Bokade","Production");
        Employee employee2= new Employee(2, "Kuldeep","Kamble","Maintainance");
        Employee employee3= new Employee(3,"Omkar","Andhare","Sales");
        Employee employee4= new Employee(4,"Akshay","Kale","Production");
        Employee employee5= new Employee(5, "Rahul","Mohite","Maintainance");
        Employee employee6= new Employee(6,"Ankush","Bhitkar","Sales");


        project1.addEmployee(employee1);
        project2.addEmployee(employee4);
        project2.addEmployee(employee2);
        project3.addEmployee(employee6);
        project4.addEmployee(employee5);
        project5.addEmployee(employee3);

        for (Employee employee: project1.getEmployeesList()) {
            System.out.println(employee);
        }

        Map<Integer, List<Employee>> projectMap =  new HashMap<>();
        projectMap.put(project1.getId(),project1.getEmployeesList());
        projectMap.put(project2.getId(),project2.getEmployeesList());
        projectMap.put(project3.getId(),project3.getEmployeesList());
        projectMap.put(project4.getId(),project4.getEmployeesList());
        projectMap.put(project5.getId(),project5.getEmployeesList());

        for (Map.Entry<Integer,List<Employee>>entry :projectMap.entrySet()) {
            System.out.println("ProjectId :"+entry.getKey());
            System.out.println("Employees :-"+entry.getValue());
        }
    }
}
