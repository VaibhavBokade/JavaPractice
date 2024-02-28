// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of values you want to check:");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("Enter the value to be checked:");
            String input = sc.nextLine();

            int count = 0;

                BigInteger bigInt = new BigInteger(input);
                System.out.println(input + " is the given number:");

                if (bigInt.compareTo(BigInteger.valueOf(Byte.MAX_VALUE)) <= 0 &&
                        bigInt.compareTo(BigInteger.valueOf(Byte.MIN_VALUE)) >= 0) {
                    System.out.print("byte < ");
                    count++;
                }
                if (bigInt.compareTo(BigInteger.valueOf(Short.MAX_VALUE)) <= 0 &&
                        bigInt.compareTo(BigInteger.valueOf(Short.MIN_VALUE)) >= 0) {
                    System.out.print("short < ");
                    count++;
                }
                if (bigInt.compareTo(BigInteger.valueOf(Integer.MAX_VALUE)) <= 0 &&
                        bigInt.compareTo(BigInteger.valueOf(Integer.MIN_VALUE)) >= 0) {
                    System.out.print("int < ");
                    count++;
                }
                if (bigInt.compareTo(BigInteger.valueOf(Long.MAX_VALUE)) <= 0 &&
                        bigInt.compareTo(BigInteger.valueOf(Long.MIN_VALUE)) >= 0) {
                    System.out.print("long");
                    count++;
                }

                if (count == 0) {
                    System.out.print("cannot fitted anywhere");
                }
                System.out.println();

            }
        }
        }

