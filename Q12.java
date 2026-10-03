import java.util.*;

class Vehicle {
    protected String regNo;
    protected String brand;
    protected double baseRate;

    public Vehicle(String regNo, String brand, double baseRate) {
        this.regNo = regNo;
        this.brand = brand;
        this.baseRate = baseRate;
    }

    public double calculateRent() {
        return baseRate;
    }
}

class Car extends Vehicle {

    public Car(String regNo, String brand, double baseRate) {
        super(regNo, brand, baseRate);
    }

    @Override
    public double calculateRent() {
        return baseRate * 1.5;
    }

    @Override
    public String toString() {
        return "Car " + regNo + " " + brand +
               " Rent: " + calculateRent();
    }
}

class Bike extends Vehicle {

    public Bike(String regNo, String brand, double baseRate) {
        super(regNo, brand, baseRate);
    }

    @Override
    public double calculateRent() {
        return baseRate * 1.2;
    }

    @Override
    public String toString() {
        return "Bike " + regNo + " " + brand +
               " Rent: " + calculateRent();
    }
}

public class Q12 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 2; i++) {

            String[] data = sc.nextLine().split(",");

            String type = data[0].trim();
            String regNo = data[1].trim();
            String brand = data[2].trim();
            double baseRate = Double.parseDouble(data[3].trim());

            Vehicle vehicle;

            if (type.equalsIgnoreCase("Car")) {
                vehicle = new Car(regNo, brand, baseRate);
            } else {
                vehicle = new Bike(regNo, brand, baseRate);
            }

            System.out.println(vehicle);
        }

        sc.close();
    }
}
