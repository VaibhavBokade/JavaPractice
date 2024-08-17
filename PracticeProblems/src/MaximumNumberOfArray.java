import java.util.Arrays;
import java.util.Collections;
import java.util.OptionalInt;

public class MaximumNumberOfArray {
    public static void main(String[] args) {
        int [] arr= {1,4,7,2,9,6,8,10,13};
        Integer [] arr1= {1,4,7,2,9,6,8,10,13};
        int maxElement = maxElement(arr);
        System.out.println(maxElement);

        OptionalInt max1 = Arrays.stream(arr).max();
        Integer max = Collections.max(Arrays.asList(arr1));
        System.out.println(max);
        System.out.println(max1);

    }

    public static int maxElement(int [] arr) {
        int max=arr[0];
        for (int i=1; i<arr.length; i++) {
            if (max < arr[i]) {
                max= arr[i];
            }
        }
        return max;
    }
}
