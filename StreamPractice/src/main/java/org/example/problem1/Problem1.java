package org.example.problem1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Problem1 {
    public static void main(String[] args) {
        List<Integer>numbers = Arrays.asList(2,4,3,4,5,7,6,8,9,12);
        Stream<Integer>numberStream = numbers.stream()
                .filter((Integer val)-> val>= 3)
                .peek((Integer val) -> System.out.println(val))
                .map((Integer val)->(val * 2))
                .peek((Integer val)-> System.out.println(val))
                .sorted()
                .peek((Integer val)-> System.out.println(val));

        List<Integer> filteredNumberStream =numberStream.collect(Collectors.toList());
    }
}
