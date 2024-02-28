package thirdQuestion;

public class Bus extends TravelBookingSystem{
    private String busNumber;

    public Bus(String source, String destination, String arrivalTime, String departureTime) {
        super(source, destination, arrivalTime, departureTime);
        this.busNumber = busNumber;
    }

    public String getBusNumber() {
        return busNumber;
    }

    public void setBusNumber(String busNumber) {
        this.busNumber = busNumber;
    }

}
