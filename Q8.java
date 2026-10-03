import java.util.*;

abstract class Loan {
    protected double principal;
    protected double rate;
    protected double time;

    public Loan(double principal, double rate, double time) {
        this.principal = principal;
        this.rate = rate;
        this.time = time;
    }

    public abstract double calculateInterest();
}

class HomeLoan extends Loan {

    public HomeLoan(double principal, double time) {
        super(principal, 8, time);
    }

    @Override
    public double calculateInterest() {
        return (principal * rate * time) / 100;
    }

    @Override
    public String toString() {
        return "Home Loan Interest: " + calculateInterest();
    }
}

class CarLoan extends Loan {

    public CarLoan(double principal, double time) {
        super(principal, 10, time);
    }

    @Override
    public double calculateInterest() {
        return (principal * rate * time) / 100;
    }

    @Override
    public String toString() {
        return "Car Loan Interest: " + calculateInterest();
    }
}

public class Q8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 2; i++) {

            String[] data = sc.nextLine().split(",");

            String type = data[0].trim();
            double principal = Double.parseDouble(data[1].trim());
            double time = Double.parseDouble(data[2].trim());

            Loan loan;

            if (type.equalsIgnoreCase("Home")) {
                loan = new HomeLoan(principal, time);
            } else {
                loan = new CarLoan(principal, time);
            }

            System.out.println(loan);
        }

        sc.close();
    }
}
