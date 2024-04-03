package org.example.problem19;

import java.util.Arrays;

public class MergeTwoArrayInSortedCondition {
    public static void main(String[] args) {
        int[] arr1 = {2, 1, 6, 4, 8};
        int[] arr2 = {3, 5, 9, 12, 7, 10, 11};
        int[] merge = merge(arr1, arr2);
        System.out.println(Arrays.toString(merge));
    }

    public static void sortArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static int[] merge(int[] arr1, int[] arr2) {
        sortArray(arr1);
        sortArray(arr2);
        int[] result = new int[arr1.length + arr2.length];
        int i = 0, j = 0, k = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                result[k++] = arr1[i++];
            } else {
                result[k++] = arr2[j++];
            }
        }

        while (i < arr1.length) {
            result[k++] = arr1[i++];
        }

        while (j < arr2.length) {
            result[k++] = arr2[j++];
        }

        sortArray(result);

        return result;
    }
}
