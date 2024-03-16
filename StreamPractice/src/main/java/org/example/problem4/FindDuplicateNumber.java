package org.example.problem4;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicateNumber {
    public static void main(String[] args) {
        List<Integer> numbers= Arrays.asList(10,15,8,49,25,98,98,32,15);
        Set<Integer> set = new HashSet<>();
        numbers.stream()
                .filter(n-> !set.add(n))
                .forEach(System.out::println);
    }
}
