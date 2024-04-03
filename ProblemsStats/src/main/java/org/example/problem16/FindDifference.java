package org.example.problem16;

public class FindDifference {
    public static void main(String[] args) {
        int[] numbers = {10, 11, 7, 12, 14};
        int difference = findOddEvenDifference(5, numbers);
        System.out.println("Difference between sum of odd and even numbers: " + difference);
    }

    public static int findOddEvenDifference(int n, int[] numbers) {
        int sumOfOdd = 0;
        int sumOfEven = 0;

        for (int i = 0; i < n; i++) {
            if (numbers[i] % 2 == 0) {
                sumOfEven += numbers[i];
            } else {
                sumOfOdd += numbers[i];
            }
        }

        return sumOfOdd - sumOfEven;
    }
}

