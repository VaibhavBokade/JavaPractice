package secondQuestion;

import java.util.Arrays;

public class Restaurant implements RestroInterface{
    private String[] menuItems = new String[100];
    private double[] prices = new double[100];
    private int[] ratings = new int[100];
    private int itemCount= 0;

    public Restaurant() {

    }

    public Restaurant(String[] menuItems, double[] prices, int[] ratings, int itemCount) {
        this.menuItems = menuItems;
        this.prices = prices;
        this.ratings = ratings;
        this.itemCount = itemCount;
    }


    @Override
    public void addItem(String item, double price, int rating) {
        menuItems[itemCount] = item;
        prices[itemCount] = price;
        ratings[itemCount] = rating;
        itemCount++;
    }

    @Override
    public void removeItem(String item) {
        for(int i=0; i< itemCount; i++) {
            if(menuItems[i].equals(item)) {
                for(int j=i; j< itemCount-1; j++) {
                    menuItems[j] = menuItems[j+1];
                    prices[j] = prices[j+1];
                    ratings[j] = ratings[j+1];
                }
                itemCount--;
                break;
            }
        }
    }

    @Override
    public double calculateAverageRating() {
        if(itemCount == 0) {
            System.out.println("Your cart is empty");
            return 0;
        }
        int sum = 0;
        for(int i=0; i< itemCount; i++){
            sum += ratings[i];
        }
        return (double) sum / itemCount;

    }

    @Override
    public String toString() {
        String result = "Restaurant{menuItems=[";
        for (int i = 0; i < itemCount; i++) {
            result += menuItems[i];
            if (i != itemCount - 1) {
                result += ", ";
            }
        }
        result += "]}";
        return result;
    }


}
