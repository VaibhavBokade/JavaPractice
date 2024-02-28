// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value how many time you want to check");
        int a= sc.nextInt();
        int count = 0;

        for(int i=0; i<= a; i++) {
            System.out.println("Enter the value which is to be check");
            long l = sc.nextLong();
            System.out.println(l+ " is given number ");
            if(l >= -127 && l <= 128) {
                System.out.println("byte value is printed successfully");
                count++;
            }
            if(l >= -32768 && l <= 32767) {
                System.out.println("short value is printed successfully");
                count++;
            }
            if(l >= -2147483648 && l<= 2147483647) {
                System.out.println("int value is printed successfully");
                count++;
            }

            if(l >= Long.MIN_VALUE && l <= Long.MAX_VALUE) {
                System.out.println("long value is printed successfully");
                count++;
            }
            else {
                System.out.println("cannot fitted anywhere");
            }
            for (int j = 0; count <= 4; i++) {
                if (count == 1) ;
                System.out.print("byte < ");
                if (count == 2) ;
                System.out.print("short < ");
                if (count == 3) ;
                System.out.print("int < ");
                if (count == 4) ;
                System.out.print("long");
                break;
            }
       }
        }
    }
