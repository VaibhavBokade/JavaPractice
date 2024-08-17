public class MaxAndMin {
    public static void main(String[] args) {
        int [] arr= {1,4,7,2,9,6,8,10,13};
        findMaxMinEle(arr);
    }

    public static void findMaxMinEle(int[] arr) {
        int max, min =0;
        if (arr[0] < arr[1]) {
            max= arr[1];
            min= arr[0];
        }else {
            max= arr[0];
            min= arr[1];
        }
        for (int i=2; i< arr.length; i++) {
            if (max < arr[i]) {
                max =arr[i];
            }
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println("Max number :" +max + " Min number :"+ min);
    }
}
