package secondQuestion;

public interface RestroInterface {
    public void addItem(String item, double price, int rating);
    public void removeItem(String item);
    public double calculateAverageRating();
}
