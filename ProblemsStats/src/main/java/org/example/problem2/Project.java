package org.example.problem2;

import java.util.ArrayList;
import java.util.List;

public class Project {

    private int id;
    private String projectName;
    private List<Employee> employeesList;

    public Project(int id, String projectName) {
        this.id = id;
        this.projectName = projectName;
        this.employeesList =new ArrayList<Employee>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public List<Employee> getEmployeesList() {
        return employeesList;
    }

    public void setEmployeesList(List<Employee> employeesList) {
        this.employeesList = employeesList;
    }

    public void addEmployee(Employee employee) {
        employeesList.add(employee);
    }

    @Override
    public String toString() {
        return "Project{" +
                "id=" + id +
                ", projectName='" + projectName + '\'' +
                ", employeesList=" + employeesList +
                '}';
    }
}
