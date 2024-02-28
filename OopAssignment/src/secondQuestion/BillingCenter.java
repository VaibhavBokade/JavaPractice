package secondQuestion;

import java.util.Scanner;

public class BillingCenter {
    public static void main(String [] args) {
        System.out.println("****Welcome in our Restaurant****");
        Scanner sc = new Scanner(System.in);
        RestroInterface r = new Restaurant(); //upcasting
        int choice=0;
        do {
            System.out.println("1. Add items in your cart"+
                    "\n2. Display your cart" +
                    "\n3. Remove items from your cart"+
                    "\n4. Get Average rating of our Restaurant"+
                    "\n0. Exit");

            System.out.println("Enter your choice");
            choice = sc.nextInt();

            switch (choice) {
                case 1:

                    System.out.println("Add items in your cart");
                    sc.nextLine();
                    String itemName = sc.nextLine();
                    System.out.println("Add items price");
                    double price = sc.nextDouble();
                    System.out.println("Add ratings for your item");
                    int rating = sc.nextInt();
                    r.addItem(itemName,price,rating);
                    System.out.println("Items added successfully");
                    break;

                case 2:
                    System.out.println("Display cart items");

                        System.out.println(r.toString());


                    break;
                case 3:
                    System.out.println("Remove items from your cart" +
                            "\n Enter item name which is to be remove");
                    sc.nextLine();
                    String item= sc.nextLine();
                    r.removeItem(item);
                    System.out.println("Item removed successfully!!!");
                    break;
                case 4:
                    System.out.println("Get Average rating of our Restaurant");
                    System.out.println(r.calculateAverageRating());
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        }while(choice !=0);
    }
}
