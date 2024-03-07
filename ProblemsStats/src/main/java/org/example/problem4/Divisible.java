package org.example.problem4;

public class Divisible {

    public static int lastDigitNumber(int []arr) {
        StringBuilder sb = new StringBuilder();
        for(int i=0;i< arr.length;i++) {
            int num = arr[i] % 10;
            sb.append(num);
        }
        return Integer.parseInt(sb.toString());
    }

    public static String checkNumber(int [] arr) {
        int number = lastDigitNumber(arr);
        if(number % 10 == 0) {
            return "Yes";
        }else {
            return "No";
        }

    }
}
