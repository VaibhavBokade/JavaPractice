public class AlgoImpl {
    public static void display(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void arraySort(int[] arr) {
        int length = arr.length;
        for (int i = 0; i < length; i++) {
            int temp = arr[i];
            int j = i-1;
            while(j >= 0 && arr[j] > temp) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] =temp;
        }
    }
}
