package infosys.problems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class FindRepeatedWord {
    public static void main(String[] args) {
        String [] strs = {"apple", "banana", "apple", "orange", "apple"};
        Map<String, Integer> map = FindRepeatedWord.repeatedLetter(strs);
        for (Map.Entry<String, Integer> count : map.entrySet()) {
            System.out.println(count.getKey() +"::"+ count.getValue());
        }

        long count = Arrays.stream(strs).filter(word -> word.equals("apple")).count();
        System.out.println(count);
        Map<String, Long> longMap = Arrays.stream(strs).collect(Collectors.groupingBy(
                word -> word,
                Collectors.counting()
        ));
        for (Map.Entry<String, Integer> count1 : map.entrySet()) {
            System.out.println(count1.getKey() +"::"+ count1.getValue());
        }

        int [] arr ={1,2,3,4,5,6,7,8,9,10};
        int sum = Arrays.stream(arr).filter(num -> num % 2 == 0)
                .sum();
        System.out.println(sum);

    }

    public static Map<String, Integer> repeatedLetter(String [] arr) {
        Map<String, Integer> counter = new HashMap<>();
        for (int i=0; i< arr.length; i++) {
            if (counter.containsKey(arr[i])) {
                counter.put(arr[i], counter.get(arr[i])+1);
            }else {
                counter.put(arr[i], 1);
            }
        }
        return counter;
    }
}
