package org.example.problem10;

import java.util.HashMap;
import java.util.Map;

public class MaxOccurringCharacter {

    public static void main(String[] args) {
        String randomString = "exampleexampleexam";
        Map<Character, Integer> charCounts = new HashMap<>();

        for (char c : randomString.toCharArray()) {
            charCounts.put(c, charCounts.getOrDefault(c, 0) + 1);
        }
        char maxChar = 0;
        int maxCount = 0;
        for (Map.Entry<Character, Integer> entry : charCounts.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxChar = entry.getKey();
                maxCount = entry.getValue();
            }
        }
        System.out.println("Character with maximum occurrences: " + maxChar);
        System.out.println("Count: " + maxCount);
    }
}