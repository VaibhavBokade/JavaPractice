public class FiboncciSeries {
    public static void main(String[] args) {
        series(50);
    }

    public static void series(int num) {
        int a=0;
        int b=1;
        int c= 0;
        System.out.println(a);
        System.out.println(b);
        for (int i=0; i<= num; i++){
            c=a+b;
            if (c<=num){
                System.out.println(c);
                a=b;
                b=c;
            }

        }
    }
}
