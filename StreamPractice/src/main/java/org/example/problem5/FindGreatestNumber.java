package org.example.problem5;

import java.util.Arrays;
import java.util.List;

public class FindGreatestNumber {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10,15,8,49,25,98,98,32,15);
        int maxNum = numbers.stream()
                .max(Integer::compareTo)
                .get();
        System.out.println(maxNum);
    }
}
