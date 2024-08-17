public class FindMiddleIndex {
    public static void main(String[] args) {
        int []arr= {2,1,3,9,4,2};
        int idx = findIdx(arr);
        System.out.println("Middle index is : "+idx);
    }

    public static int findIdx(int [] arr) {
        for (int i=1; i< arr.length; i++) {
            int sum1=0;
            int sum2 =0;
            for (int j=0; j<i; j++) {
                sum1 += arr[j];
            }
            for (int k=i+1; k< arr.length; k++) {
                sum2 += arr[k];
            }
            if (sum1 == sum2) {
                return i;
            }
        }
        return 0;
    }
}
