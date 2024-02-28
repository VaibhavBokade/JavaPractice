import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Employee> arrayList = new ArrayList<>();
        int choice=0;

        do {
            System.out.println("<<<< EMPLOYEE DATABASE>>>" +

                    "\n1.ADD PERMANENT EMPLOYEE"+
                    "\n2.PRINT ALL EMPLOYEES"+
                    "\n3.PRINT EMPID WITH INPUT" +
                    "\n4.FIND EMPLOYEE WITH TITLE"+
                    "\n5.DISPLAY EMPLOYEE SALARY" +
                    "\n0. EXIT"
            );
            System.out.println("Enter the choice:");
            choice = sc.nextInt();//Integer.parseInt(sc.nextLine());
            switch(choice){
                case 1:
                    System.out.println("Enter the name, empid, title, salary, city, experience");
                    arrayList.add(new PermanentEmployee (sc.nextLine(), sc.nextLine()
                            ,sc.nextLine(),Double.parseDouble(sc.nextLine()),sc.nextLine(),sc.nextLine()));

                    break;

                case 2:
                    System.out.println("2.PRINT ALL EMPLOYEES");

                    for(Employee emp: arrayList) {
                        System.out.println(emp);
                    }
                    break;
                case 3:
                    System.out.println("3.PRINT EMPID WITH INPUT"
                            + "\n Enter empid = ");
                    String s1 = sc.nextLine();
                    for(Employee emp: arrayList) {
                        if(s1.equals(emp.getEmpid())) {
                            System.out.println(emp);
                        }
                    }
                    break;

                case 4:
                    System.out.println("4.FIND EMPLOYEE WITH TITLE"
                            + " Enter the title");
                    for(Employee emp: arrayList) {
                        if(emp.getTitle().equals(sc.nextLine())) {
                            System.out.println(emp);
                        }
                    }
                    break;

                case 5:
                    System.out.println("5.DISPLAY SALARY");
                    for(Employee emp: arrayList) {
                        System.out.println(emp.calculateSalary());
                    }
                    break;

            }

        }while(choice!=0);

    }
}