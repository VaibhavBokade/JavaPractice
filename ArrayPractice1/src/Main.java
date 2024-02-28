import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Main m = new Main();
        int[] arrInt = {10, 20, 30, 40, 50, 60};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the index where value to be added and its value");
        int index = sc.nextInt();
        int value = sc.nextInt();
        m.addElements(arrInt, index, value);


    }

    public void addElements(int[] arrInt, int index, int value) {
     /*   if (arrInt.length % 2 == 1) {
            int middleElementIndex = arrInt.length / 2;
            System.out.println("Middle element of array of add numbers "+ arrInt[middleElementIndex]);
        }
        else {
            int middleElement1 = (arrInt.length / 2) -1;
            int middleElement2 = arrInt.length / 2 ;
            System.out.println("Middle elements of array for even numbers "+ arrInt[middleElement1] +" "+ arrInt[middleElement2]);
        }

      */
        int[] arr = new int[arrInt.length + 1];
        int count = 0;
        for (int i = 0; i < arr.length; i++) {

            if (i == index) {
                arr[i] = value;
                i++;
            }

            arr[i] = arrInt[count];
            count++;

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
    }

}


