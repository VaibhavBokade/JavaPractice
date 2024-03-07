package org.example.problem5;

import java.util.Scanner;

public class FindNums {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int l = sc.nextInt();
        int r = sc.nextInt();
        int k = sc.nextInt();
        int count = count(l, r, k);
        System.out.println(count);

    }

    public static int count(int l,int r, int k) {
        int size= (r-l)-1;
        int [] arr= new int[size];
        int count=0;
        for(int i=0; i<size;i++) {
            for(int j=l+1;j<r;j++){
                arr[i]= j;
                i++;
            }
            break;
        }
        for(int i=0;i<size;i++) {
            if(arr[i] % k ==0) {
                count++;
            }
        }
        return count;
    }
}
