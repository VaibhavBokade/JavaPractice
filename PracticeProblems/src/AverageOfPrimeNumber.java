import java.util.Scanner;

public class AverageOfPrimeNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num = sc.nextInt();
        int sum=0;
        int count =0;
        for (int i=2; i<=num; i++) {
            if (isPrime(i)){
                count++;
                sum += i;
            }
        }
        if (count ==0) {
            System.out.println("No prime number found ");
        }else {
            double avg =(double) sum / count;
            System.out.println("Average is :=" + avg);
        }
    }

    public static boolean isPrime(int num) {
        if (num<= 1) {
            return false;
        }
        for (int i=2; i<num; i++) {
            if (num % i ==0) {
                return false;
            }
        }
        return true;
    }

}
