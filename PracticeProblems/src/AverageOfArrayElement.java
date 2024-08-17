import java.util.Arrays;

public class AverageOfArrayElement {
    public static void main(String[] args) {
        int [] arr = { };
        int average = average(arr);
        System.out.println("Average is "+average);
        //----------------------------Using stream----------------------------------------------
        double avg = Arrays.stream(arr)
                .average()
                .orElse(Double.NaN); // if array is empty returns not a number.

        System.out.println(avg);



    }

    public static int average(int [] arr) {
        int sum =0;
        int count= 0;
        for (int i=0; i < arr.length; i++) {
            sum += arr[i];
            count++;
        }
        int average = sum / count;
        return  average;
    }
}
