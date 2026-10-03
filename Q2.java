import java.util.*;

abstract class Flight {
    private String flightNumber;
    private String airline;
    private double fare;

    public Flight(String flightNumber, String airline, double fare) {
        this.flightNumber = flightNumber;
        this.airline = airline;
        this.fare = fare;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getAirline() {
        return airline;
    }

    public double getFare() {
        return fare;
    }

    public abstract double calculateFare();

    @Override
    public String toString() {
        return "Flight No: " + flightNumber +
               " Airline: " + airline +
               " Fare: " + calculateFare();
    }
}

class DomesticFlight extends Flight {

    public DomesticFlight(String flightNumber, String airline, double fare) {
        super(flightNumber, airline, fare);
    }

    @Override
    public double calculateFare() {
        return getFare() + (getFare() * 0.10);
    }
}

class InternationalFlight extends Flight {

    public InternationalFlight(String flightNumber, String airline, double fare) {
        super(flightNumber, airline, fare);
    }

    @Override
    public double calculateFare() {
        return getFare() + (getFare() * 0.25);
    }
}

public class Q2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter flight type,number,airline,fare");

        for (int i = 0; i < 2; i++) {

            String[] data = sc.nextLine().split(",");

            String type = data[0].trim();
            String number = data[1].trim();
            String airline = data[2].trim();
            double fare = Double.parseDouble(data[3].trim());

            Flight flight;

            if (type.equalsIgnoreCase("Domestic")) {
                flight = new DomesticFlight(number, airline, fare);
            } else {
                flight = new InternationalFlight(number, airline, fare);
            }

            System.out.println(flight);
        }

        sc.close();
    }
}