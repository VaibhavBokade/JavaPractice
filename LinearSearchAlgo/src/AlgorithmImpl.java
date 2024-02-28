public class AlgorithmImpl {

    public static  void display(int [] arr) {
        for(int i=0; i< arr.length; i++) {
            System.out.println(arr[i]+ " ");
        }
    }
    public static int isAvailiable(int [] arr, int value) {
        for(int i=0; i< arr.length;i++) {
            if(arr[i] == value) {
                System.out.println("Value exist");
                return 1;
            }
        }
        System.out.println("Value is not exist");
        return -1;
    }
}
