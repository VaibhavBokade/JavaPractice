package thirdQuestion;

public class Flight extends TravelBookingSystem{
    private String flightNumber;

    public Flight(String flightNumber, String source, String destination, String arrivalTime, String departureTime) {
        super(source, destination, arrivalTime, departureTime);
        this.flightNumber = flightNumber;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    @Override
    public String toString() {
        return "Flight Number: " + flightNumber + "\n" + super.toString();
    }
}