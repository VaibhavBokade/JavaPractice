package org.example.problem6;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatedChar {
    public static void main(String[] args) {
        String input = "Java articles are Awesome";
        Character firstNonRepeated = input.chars()
                .mapToObj(ch -> (char) ch)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream()
                .filter(entry -> entry.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse(null);

        // Print the result
        System.out.println("First non-repeated character: " + firstNonRepeated);

//        .collect(
//                Collectors.groupingBy(             // Step 1: Collect elements into a Map using groupingBy
//                        Function.identity(),          // Step 2: The key is the element itself (identity function)
//                        LinkedHashMap::new,           // Step 3: Use LinkedHashMap to preserve the order of elements
//                        Collectors.counting()         // Step 4: Count the occurrences of each element
//                )
//        )
    }

}
