public class AlgoImpl {
    public static  void display(int [] arr) {
        for(int i=0; i< arr.length; i++) {
            System.out.println(arr[i]+ " ");
        }
    }

    public static int isAvailiable(int [] arr, int value) {
        int left =0;
        int right = arr.length-1;
         while (left<= right) {
             int mid = left + (right - left) / 2;
             if(arr[mid] == value) {
                 System.out.println("Value found");
                 return 1;
             }
             if(arr[mid] < value) {
                 left = mid + 1;
             }else{
                 right = mid - 1;
             }
         }
         System.out.println("Value not found");
         return -1;

    }
}
