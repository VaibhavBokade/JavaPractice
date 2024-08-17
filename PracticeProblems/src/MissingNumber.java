import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        //write java method to find out missing number in an array of consecutive integer using java 8 stream
        int[] array = {1, 2, 3, 5, 6, 7, 8};
        int missingNumber = findNum(array);
        System.out.println("Missing number: " + missingNumber);
        //--------------------Using Stream------------------------
        int n = array.length+1;
        int expSum = n* (n+1) /2;
        int sum = Arrays.stream(array)
                .sum();
        int missNum = expSum-sum;
        System.out.println("Missing number: " + missNum);

    }

    public static int findNum(int [] arr) {
        int n = arr.length+1;
        int expectedSum = n* (n+1) /2;
        int actualSum =0;
        for (int i=0; i< arr.length; i++) {
            actualSum += arr[i];
        }
        int num = expectedSum - actualSum;
        return num;
    }
}
