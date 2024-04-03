package org.example.problem11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindPairOfElement {
    public static void main(String[] args) {
        int[] arr = {8, 4, 3, 7, 2};
        List<List<Integer>> pair = findPair(arr, 6);
        System.out.println(pair);
    }

    public static List<List<Integer>> findPair(int[] nums, int sum) {
        List<List<Integer>> pairs = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int result = sum - nums[i];
            if (map.containsKey(result)) {
                List<Integer> numPair = new ArrayList<>();
                numPair.add(result);
                numPair.add(nums[i]);
                pairs.add(numPair);
            }
            map.put(nums[i], i);
        }
        return pairs;
    }
}


