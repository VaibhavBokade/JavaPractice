package org.example.problem21;

import java.util.Scanner;

public class SpecialNumber {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();
        for (int i=0; i<cases; i++) {
            int num= sc.nextInt();
            int specialNumber = findSpecialNumber(num);
            System.out.println(specialNumber);
        }
    }

    public static int findSum(int num) {
        int sum=0;
        while (num > 0) {
            sum += num%10;
            num /= 10;
        }
        return sum;
    }

    public static boolean checkSpecialNumber(int num) {
        int sum = findSum(num);
        if (sum % 4 == 0) {
            return true;
        }else {
            return false;
        }
    }

    public static int findSpecialNumber(int num) {
        while (!checkSpecialNumber(num)) {
            num++;
        }
        return num;
    }


}
