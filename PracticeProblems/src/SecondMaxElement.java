public class SecondMaxElement {
    public static void main(String[] args) {
        int [] arr= {1,4,7,2,9,6,8,10,13};
        int secMax = secMax(arr);
        System.out.println(secMax);

    }
    public static int secMax(int[] arr) {
        int max= 0;
        int sexMax = 0;
        if (arr[0] >  arr[1]) {
            max = arr[0];
            sexMax = arr[1];
        }else {
            max= arr[1];
            sexMax= arr[0];
        }

        for (int i=2; i< arr.length; i++) {
            if (arr[i] > max) {
                sexMax= max;
                max= arr[i];
            }else if (arr[i] > sexMax) {
                sexMax = arr[i];
            }
        }
        return sexMax;
    }

}
