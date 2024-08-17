public class SecondLargestAndSecondSmallestNumber {
    public static void main(String[] args) {
        int []arr = {5,8,7,6,2,3,1};
        largestAndSmallestNumber(arr);
    }
    public static void largestAndSmallestNumber(int [] arr) {
        int max =0;
        int secMax = 0;
        int small =0;
        int secSmall=0;
        if (arr[0] < arr[1]) {
            max=arr[1];
            secMax = arr[0];
            small = arr[0];
            secSmall= arr[1];
        }else {
            max =arr[0];
            secMax=arr[1];
            small = arr[1];
            secSmall= arr[0];
        }
        for (int i=2; i< arr.length; i++){
            if (max < arr[i]) {
                secMax =max;
                max = arr[i];
            } else if (secMax < arr[i]) {
                secMax =arr[i];
            }
            if (small > arr[i]) {
                secSmall= small;
                small= arr[i];
            } else if (secSmall > arr[i]) {
                secSmall=arr[i];
            }
        }
        System.out.println("Second Largest number :"+ secMax+ " Second Smallest number :"+ secSmall);

    }
}
