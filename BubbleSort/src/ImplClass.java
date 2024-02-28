public class ImplClass {
    public static void isSort(int [] arr) {
        int length = arr.length;
        for(int i=0; i < length-1; i++) {
            for(int j=0; j < length-i-1; j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static  void display(int [] arr) {
        for(int i=0; i< arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
    }
}
