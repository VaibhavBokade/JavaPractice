package org.example.problem20;

public class SecondLargestElementOfArray {

    public static void main(String[] args) {
        int []arr = {3,2,4,6,5,9,8,7,11,10};
        int secondLargestElement = secondLargestElement(arr);
        System.out.println("Second largest element of an array is "+secondLargestElement);
    }

    public static int secondLargestElement(int [] arr) {
        int max1, max2 =0;
        if (arr[0] > arr[1]) {
            max1 = arr[0];
            max2 = arr[1];
        } else {
            max1 =arr[1];
            max2 = arr[0];
        }
        for (int i=2; i< arr.length; i++) {
            if (arr[i] > max1) {
                max2 = max1;
                max1 = arr[i];
            } else if (arr[i] > max2) {
                max2 = arr[i];
            }
        }
        return max2;
    }
}
