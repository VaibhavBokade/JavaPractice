import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int [] arr= new int[10];
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the array elements");
        for(int i=0; i< arr.length; i++) {
            arr[i] = sc.nextInt();
        }
       ImplClass.isSort(arr);
        ImplClass.display(arr);
        ImplClass.display(arr);
    }
}