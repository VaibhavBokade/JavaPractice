package deloite.problem;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Java8ExpDemo {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(1,500));
        employeeList.add(new Employee(2,1000));
        employeeList.add(new Employee(3,1500));
        employeeList.add(new Employee(4,2000));
        employeeList.add(new Employee(5,2500));
        employeeList.add(new Employee(6,3000));
        employeeList.add(new Employee(7,3500));

        //descending order salary
        List<Employee> employees = employeeList.stream().sorted((o1, o2) -> (int) (o2.getSalary() - o1.getSalary()))
                .collect(Collectors.toList());
        System.out.println(employees);
        System.out.println("---------------------------------------------");


        //find top 3 high salary

        List<Employee> list = employeeList.stream().sorted(((o1, o2) -> (int) (o2.getSalary() - o1.getSalary())))
                .limit( 3)
                .collect(Collectors.toList());

        list.forEach(System.out::println);

        System.out.println("---------------------------------------------");

        //salaries less than 3rd high salary

        employeeList.stream().sorted(((o1, o2) -> (int)(o2.getSalary()- o1.getSalary())))
                .skip(3)
                .forEach(System.out::println);

    }
}
