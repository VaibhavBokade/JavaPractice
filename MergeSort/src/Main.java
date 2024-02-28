// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int [] arr = {30,10,40,20,60,50,80,70,100,90};
        System.out.println("Unsorted array");
        AlgoImpl.display(arr);
        AlgoImpl.divide(arr, 0, arr.length-1);
        System.out.println( '\n'+"Sorted array");
        AlgoImpl.display(arr);

    }
}