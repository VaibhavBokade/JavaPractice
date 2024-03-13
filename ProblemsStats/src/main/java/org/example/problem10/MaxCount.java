package org.example.problem10;

import java.util.HashMap;
import java.util.Map;

public class MaxCount {
    public static void main(String[] args) {
        Map<Character, Integer> count = count("aaacbbbcccccc");
        char maxChar = 0;
        int maxCount = 0;
        for (Map.Entry<Character,Integer>entry: count.entrySet()){
            if(entry.getValue() >= maxCount) {
                maxChar = entry.getKey();
                maxCount = entry.getValue();
            }
        }
        System.out.println("Character with maximum occurrences: " + maxChar);
        System.out.println("Count: " + maxCount);
    }

    public static Map<Character,Integer> count(String str) {
        int maxCount=0;
        int count=0;
        Map<Character,Integer>map= new HashMap<>();
        for (int i=0;i<str.length();i++) {
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }
            if (count >= maxCount) {
                maxCount = count;
                map.put(str.charAt(i), maxCount);
            }
            count = 0;
        }
        return map;
    }
}
