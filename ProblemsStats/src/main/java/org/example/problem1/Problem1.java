package org.example.problem1;

/*
 * Implementing a restaurant menu system. The system should allow customers to view the menu,
 *  add items to their order, view their order summary, and calculate the total bill.
 * Additionally, restaurant staff should be able to update the menu by adding, removing, or modifying items.*/
public class Problem1 {
    public static void main(String[] args) {
        MenuItem salad = new MenuItem("Gajar Salad", 20, Category.STARTER);
        MenuItem lunch = new MenuItem("Bhaji-Poli", 100, Category.MAIN_COURSE);
        MenuItem cake = new MenuItem("Chocolate Cake", 50, Category.DESSERT);
        MenuItem soda = new MenuItem("Soda", 10, Category.BEVERAGE);

        // Create a menu and add items
        Menu menu = new Menu();
        menu.addItem(salad);
        menu.addItem(lunch);
        menu.addItem(cake);
        menu.addItem(soda);

        // Create a customer order
        Order order = new Order();
        order.addItem(salad);
        order.addItem(lunch);
        order.addItem(cake);

        System.out.println("Order Summary:");
        for (MenuItem item : order.getItems()) {
            System.out.println(item.getName() + " - Rs." + item.getPrice());
        }
        System.out.println("Total: Rs." + order.calculateTotal());
    }
}
