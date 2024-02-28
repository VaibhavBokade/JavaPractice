package firstQuestion;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Bank {
    public static void main(String[] args) {
        System.out.println("***Welcome in our Bank***");
        Scanner sc = new Scanner(System.in);
        int choice=0;
        do {
            System.out.println("1. Calculate the home loan payable amount"+
                    "\n2. Calculate the car loan payable amount"+
                    "\n0. Exit");

            System.out.println("Enter your choice");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Calculate the home loan payable amount"+
                            "\n Enter interest rate for home loan");
                    HomeLoan h = new HomeLoan(sc.nextDouble());
                    System.out.println("Enter your principle amount");
                    double amount = sc.nextDouble();
                    System.out.println("Enter Number of years");
                    int years = sc.nextInt();
                    double finalAmount = h.calculatePayableAmount(amount,years);
                    System.out.println("Your total home loan payable amount is "+ finalAmount);

                    break;

                case 2:
                    System.out.println("Calculate the Car loan payable amount"+
                            "\n Enter interest rate for Car loan");
                    CarLoan c = new CarLoan(sc.nextDouble());
                    System.out.println("Enter your principle amount");
                    double carLoanamount = sc.nextDouble();
                    System.out.println("Enter Number of years");
                    int noOfyears = sc.nextInt();
                    double carLoanReturnAmount = c.calculatePayableAmount(carLoanamount,noOfyears);
                    System.out.println("Your total home loan payable amount is "+ carLoanReturnAmount);
                    break;

                default:
                    System.out.println("Invalid choice");

            }

        }while (choice!= 0);

    }
}