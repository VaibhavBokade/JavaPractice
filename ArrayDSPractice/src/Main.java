import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int [] nums = {10,20,30,40,50,60,70};
        //forword traverse
        for(int i=0; i< nums.length; i++) {
            System.out.print(" "+nums[i]);

        }

        System.out.println("");

        //reverse traverse
        for(int i=nums.length-1; i>= 0; i--) {
            System.out.print(" "+nums[i]);
        }

        System.out.println("");

        //store string values in string array and print
        String [] strArr= new String[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        for(int i=0; i< strArr.length; i++) {
            strArr[i] = sc.nextLine();
        }



        for(int i=0; i< strArr.length; i++ ) {
            System.out.println(strArr[i]);
        }

        System.out.println("---------------------------------");

        for(int i=strArr.length-1; i>= 0; i-- ) {
            System.out.println(strArr[i]);
        }
        // copy one arrray elements into another
        int [] a = {1,2,3,4,5};
        int [] b= new int[a.length];

        for(int i=0; i< a.length; i++) {
            b[i] = a[i];
            System.out.print(" "+b[i]);
        }
       
    }
}