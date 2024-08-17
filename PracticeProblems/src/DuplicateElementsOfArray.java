import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DuplicateElementsOfArray {
    public static void main(String[] args) {
        int[] arr = {1, 4, 2, 5, 1, 7, 4, 2, 1, 6};


        Arrays.stream(arr).distinct().forEach(System.out::println);
        int[] duplicateEle = duplicateEle(arr);
        for (int i = 0; i < duplicateEle.length; i++) {
            System.out.print(duplicateEle[i] + " ");
        }
         System.out.println();
        int ints = removeDuplicateEle(arr);
        for (int i=0; i< arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int secondSmallestNo = largestSecondSmallestNo(arr);
        System.out.println("Second smallest number is =" + secondSmallestNo);
        System.out.println();
        largestSmallestNo(arr);

        removeDuplicates(arr);
    }

    public static int[] duplicateEle(int[] arr) {
        int[] val = new int[arr.length];
        int idx = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    val[idx] = arr[i];
                    idx++;
                }
            }
        }
        return val;
    }

    public static int removeDuplicateEle(int[] arr) {
        int idx = 0;
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[idx] != arr[i]) {
                idx++;
                arr[idx] = arr[i];
            }
        }
        return idx+1;
    }

    public static int largestSecondSmallestNo(int[] arr) {
        int secSmallestNo = 0, largestNo = 0;
        if (arr[0] > arr[1]) {
            secSmallestNo = arr[1];
            largestNo = arr[0];
        }
        for (int i = 2; i < arr.length; i++) {
            if (arr[i] > largestNo) {
                secSmallestNo = largestNo;
                largestNo = arr[i];
            } else if (arr[i] > secSmallestNo) {
                secSmallestNo = arr[i];
            }
        }

        return secSmallestNo;
    }

    public static void largestSmallestNo(int[] arr) {
        int largestNo = arr[0];
        int smallestNo = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (largestNo < arr[i]) {
                largestNo = arr[i];
            } else if (smallestNo > arr[i]) {
                smallestNo = arr[i];
            }
        }
        System.out.println("LargestNo =" + largestNo + " Smallest no =" + smallestNo);
    }

    public static void removeDuplicates(int [] arr) {
        Set<Integer> set = new HashSet<>();
        for (int i: arr) {
            set.add(i);
        }

        for (int n: set) {
            System.out.print(n+" ");
        }

    }
}
