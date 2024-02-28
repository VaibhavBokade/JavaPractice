package thirdQuestion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DriverClass {
    public static void main(String[] args) {
        TravelBookingSystem bookingSystem = new TravelBookingSystem();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nTravel Booking System Menu");
            System.out.println("1. Book Travel");
            System.out.println("2. Check Status");
            System.out.println("3. Cancel");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character1


            switch (choice) {
                case 1:
                    System.out.print("Enter source: ");
                    String source = scanner.nextLine();
                    System.out.print("Enter destination: ");
                    String destination = scanner.nextLine();
                    System.out.print("Enter arrival time: ");
                    String arrivalTime = scanner.nextLine();
                    System.out.print("Enter departure time: ");
                    String departureTime = scanner.nextLine();
                    System.out.print("Enter travel mode (Bus/Train/Flight): ");
                    String mode = scanner.nextLine();

                    if (mode.equalsIgnoreCase("Bus")) {
                        bookingSystem.bookTravel(new Bus(source, destination, arrivalTime, departureTime));
                    } else if (mode.equalsIgnoreCase("Train")) {
                        bookingSystem.bookTravel(new Train(source, destination, arrivalTime, departureTime));
                    } else if (mode.equalsIgnoreCase("Flight")) {
                        System.out.print("Enter flight number: ");
                        String flightNumber = scanner.nextLine();
                        bookingSystem.bookTravel(new Flight(flightNumber, source, destination, arrivalTime, departureTime));
                    } else {
                        System.out.println("Invalid travel mode.");
                    }
                    break;

                case 2:
                    bookingSystem.checkStatus();
                    break;

                case 3:
                    bookingSystem.cancel();
                    break;

                case 4:
                    System.out.println("Exiting Travel Booking System.");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }
}
