package thirdQuestion;

public class Train extends TravelBookingSystem{
    private String trainNumber;


    public Train() {

    }

//    public Train(String source, String destination, String arrivalTime, String departureTime, String trainNumber) {
//        super(source, destination, arrivalTime, departureTime);
//        this.trainNumber = trainNumber;
//    }

    public Train(String source, String destination, String arrivalTime, String departureTime) {
    }

    public String getTrainNumber() {
        return trainNumber;
    }

    public void setTrainNumber(String trainNumber) {
        this.trainNumber = trainNumber;
    }
    public void bookTravel() {
        System.out.println("Travel booked successfully!");
    }

    public void checkStatus() {
        System.out.println("Your travel status is confirmed.");
    }

    public void cancel() {
        System.out.println("Your travel booking has been canceled.");
    }
}
