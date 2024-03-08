package org.example.problem7;

public class ProductOfArrayElement {

    public static void main(String[] args) {
        int [] arr={1,2,3,4,5};
        int product = product(arr);
        System.out.println(product);
    }

    public static int product(int []arr) {
        int num=1;
        for(int i=0;i< arr.length;i++) {
            num *= arr[i];
        }
        return num;
    }
}
