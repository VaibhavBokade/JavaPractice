package LiskedListAssignmnet;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        LinkedListImpl list = new LinkedListImpl();

        list.addData(10);
        list.addData(20);
        list.addData(30);
        list.addData(40);
        list.addData(50);
        list.addData(60);


        list.displayData();
       System.out.println(" ");

       //list.removeAtPosition(5);
        list.removeAtPosition(-1);
       // System.out.println("--------------------------------------------");


    }


}