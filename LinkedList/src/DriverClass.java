import java.util.LinkedList;
import java.util.Scanner;

public class DriverClass {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Student> list = new LinkedList<>();
        int choice = 0;

        do{
            System.out.println("****Student database****" +
                    "\n1. Add Student"+
                    "\n2. Print all student data"+
                    "\n3. Print Student with idNo"+
                    "\n4. Display student Total marks"+
                    "\n0 Exit");

            System.out.println("Enter the choice :");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter the First Name, Last Name, ID No, marks obtained");
                    sc.nextLine(); // Add this line to consume the newline character
                    list.add(new Student(sc.nextLine(), sc.nextLine(), sc.nextInt(), sc.nextInt()));
                    break;


                case 2:
                    System.out.println("2. Print all Student info");
                    for(Student s : list) {
                        System.out.println(s);
                    }
                    break;

                case 3:
                    System.out.println("3. Print Student with idNo"+
                            "\n Enter idNo = ");
                    int no = sc.nextInt();
                    for(Student s: list) {
                        if(no == s.getIdNo()) {
                            System.out.println(s);
                        }
                    }
                    break;

                case 4:
                    System.out.println("4. Display student Total marks"+
                            "Enter Student First name");
                    sc.nextLine();
                    String name = sc.nextLine();
                    for(Student s: list) {
                        if(name.equals(s.getFirstName())) {
                            System.out.println(s.getMarks());
                        }
                    }
                    break;
            }

        }while (choice != 0);
    }
}
