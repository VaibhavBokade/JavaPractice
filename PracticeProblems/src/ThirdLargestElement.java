public class ThirdLargestElement {
    public static void main(String[] args) {
        int [] arr= {50,40,90,60,70,20,30,10,20};
        int thirdHighestEle = thirdHighestEle(arr);
        System.out.println(thirdHighestEle);

    }

    public static int thirdHighestEle(int[] arr) {
        // Bubble sort in descending order
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // Return the third largest element
        if (arr.length >= 3) {
            return arr[2];  // Since the array is sorted in descending order
        } else {
            return -1; // If there are less than 3 elements, return -1
        }
    }
}
