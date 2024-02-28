import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number which is to be check");
        int number = sc.nextInt();
        boolean primeOrNot =CheckPrimeNumber.isPrime(number);
        System.out.println(primeOrNot);
    }
}