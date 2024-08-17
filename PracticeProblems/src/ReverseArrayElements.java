import java.util.Arrays;
import java.util.Collections;
import java.util.stream.IntStream;

public class ReverseArrayElements {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8,9};
        int[] array = IntStream.range(0, arr.length)
                .map(i -> arr[arr.length - 1 - i])
                .toArray();

        System.out.println(Arrays.toString(array));

        Integer [] arr1 = {1,2,3,4,5,6,7,8,9};
        Integer[] array1 = Arrays.stream(arr1)
                .sorted(Collections.reverseOrder())
                .toArray(Integer[]::new);
        System.out.println(Arrays.toString(array1));
    }

}
