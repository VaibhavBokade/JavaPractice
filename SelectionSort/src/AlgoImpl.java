public class AlgoImpl {
    public static  void display(int [] arr) {
        for(int i=0; i< arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
    }

    public static void arraySort(int [] arr) {
        int length = arr.length;
        for(int i=0; i< length-1; i++) {
            int min_int = i;
            for(int j=i+1; j< length; j++){
                if(arr[j] < arr[min_int]) {
                    min_int = j;
                }
            }
            int temp = arr[min_int];
            arr[min_int] = arr[i];
            arr[i] = temp;
        }
    }
}
