package org.example.problem12;

import java.util.Arrays;
import java.util.List;

public class LongestSubarray {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(4, 6, 5, 3, 3, 1);
        int pickingNumbers = pickingNumbers(list);
        System.out.println("Maximum Length: " + pickingNumbers);
    }

    public static int pickingNumbers(List<Integer> a) {
        int[] freq = new int[101];
        for (int num : a) {
            freq[num]++;
        }
        int maxLength = 0;
        for (int i = 1; i < freq.length; i++) {
            int length = freq[i] + freq[i - 1];
            maxLength = Math.max(maxLength, length);
        }
        return maxLength;
    }
}
