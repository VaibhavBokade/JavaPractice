public class FindGivenElementSecondSmallest {
    public static void main(String[] args) {
        int [] arr ={9,2,6,4,11,5,1,12,10,3,7,8};
        int element = sendElement(arr, 12);
        System.out.println(element);

    }

    public static int sendElement(int [] arr, int num) {
        int secMax=arr[0];
        for (int i=1; i < arr.length; i++) {
            if (arr[i] < num) {
                if (secMax < arr[i]) {
                    secMax = arr[i];
                    return secMax;
                }
            }
        }
        return -1;
    }
}
