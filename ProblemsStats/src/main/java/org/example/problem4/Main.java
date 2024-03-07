package org.example.problem4;

import java.util.Scanner;
/*
You are provided an array of size
 that contains non-negative integers.
 Your task is to determine whether the number that is formed by
 selecting the last digit of all the N numbers is divisible by.
Note: View the sample explanation section for more clarification.
Input format
First line: A single integer
denoting the size of array
Second line:
space-separated integers.
Output format

If the number is divisible by
, then print
. Otherwise, print
.
 */

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size= sc.nextInt();
        int [] arr= new int[size];
        for(int i=0;i < size;i++) {
            arr[i] = sc.nextInt();
        }
        String checked = Divisible.checkNumber(arr);
        System.out.println(checked);
    }
}
