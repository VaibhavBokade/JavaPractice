import java.util.Arrays;

public class SumOfEvenNumbers {
    public static void main(String[] args) {
        int [] arr= {1,4,7,2,9,6,8,10,13};
        int sum = sum(arr);
        System.out.println(sum);

        int sum1 = Arrays.stream(arr).filter(num -> num % 2 == 0).sum();
        System.out.println(sum1);

        int reduce = Arrays.stream(arr).filter(num -> num % 2 == 0).reduce(0, (a, b) -> a + b);
        System.out.println(reduce);

    }

    public static int sum(int [] arr) {
        int sum=0;
        for (int i=0; i<arr.length;i++) {
            if (arr[i] %2 == 0) {
                sum += arr[i];
            }
        }
        return sum;
    }


}
