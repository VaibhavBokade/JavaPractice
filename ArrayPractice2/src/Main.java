import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int [] arrInt = {10,20,30,40,50,60};

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the index number which element to be delete");
        int indexNumber = sc.nextInt();
        arrInt[indexNumber] = 0;
        for(int i=0; i< arrInt.length; i++) {
           System.out.print(arrInt[i] +" ");
        }
    }
}