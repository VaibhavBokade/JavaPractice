package thirdQuestion;

import java.util.ArrayList;

public class TravelBookingSystem {
     private String source;
     private String destination;
     private String arrivalTime;
     private String departureTime;

     public TravelBookingSystem(String source, String destination, String arrivalTime, String departureTime) {
          this.source = source;
          this.destination = destination;
          this.arrivalTime = arrivalTime;
          this.departureTime = departureTime;
     }

     public TravelBookingSystem() {

     }

     public String getSource() {
          return source;
     }

     public String getDestination() {
          return destination;
     }

     public String getArrivalTime() {
          return arrivalTime;
     }

     public String getDepartureTime() {
          return departureTime;
     }

     private ArrayList<TravelBookingSystem> bookings = new ArrayList<>();

     public void bookTravel(TravelBookingSystem travelMode) {
          bookings.add(travelMode);
          System.out.println("Booking successful!");
     }

     public void checkStatus() {
          if (bookings.isEmpty()) {
               System.out.println("No bookings yet.");
          } else {
               System.out.println("Booked Travel Details:");
               for (TravelBookingSystem mode : bookings) {
                    System.out.println(mode);
               }
          }
     }

     public void cancel() {
          if (bookings.isEmpty()) {
               System.out.println("No bookings to cancel.");
          } else {
               bookings.remove(bookings.size() - 1);
               System.out.println("Booking canceled successfully.");
          }
     }
}
