import java.util.Arrays;
import java.util.stream.Stream;

public class MergeTwoArray {
    public static void main(String[] args) {
        int []arr ={1,3,5,7,9};
        int []brr= {2,4,6,8,10};
        int[] mergeArray = mergeArray(arr, brr, arr.length, brr.length);
        System.out.println(Arrays.toString(mergeArray));

        Stream<Integer> stream1 = Arrays.stream(arr).boxed();
        Stream<Integer> stream2 = Arrays.stream(brr).boxed();

        Stream<Integer> stream = Stream.concat(stream1, stream2).sorted();
        int[] array = stream.mapToInt(Integer::intValue).toArray();
        System.out.println(Arrays.toString(array));

    }
    public static int [] mergeArray(int [] arr, int [] brr, int m, int n) {
        int a=0,b=0,c =0;
        int [] result = new int[m+n];
        while (a < m && b < n) {
            if (arr[a] < brr[b]) {
                result[c] = arr[a];
                a++;
            } else {
                result[c] = brr[b];
                b++;
            }
            c++;
        }
        while (a < m) {
            result[c] = arr[a];
            a++;
            c++;
        }
        while (b<n){
            result[c] =brr[b];
            c++;
            b++;
        }
        return result;
    }
}
