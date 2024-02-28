public class AlgoImpl {
    public static void display(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static int partition(int [] arr, int low, int high) {
        int pivot = arr[high];
        int i = low-1;

        for(int j= low; j < high; j++) {
            if(arr[j] < pivot) {
                i++;
                //swaping
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] =temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i]= pivot;
        arr[high] = temp;
        return i; //as it pivot index
    }

    public static void quickSort(int [] arr, int low, int high) {
        if(low < high) {
            int pidx = partition(arr, low, high);
            quickSort(arr, low, pidx-1);
            quickSort(arr,pidx+1, high);
        }
    }
}
