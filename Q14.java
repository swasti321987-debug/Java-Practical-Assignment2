import java.util.*;

class Account {
    private String accNo;
    private String holderName;
    private double balance;

    public Account(String accNo, String holderName) {
        this.accNo = accNo;
        this.holderName = holderName;
        this.balance = 0;
    }

    public void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Deposited: " + amount);
    }

    public void withdraw(double amount) {

        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    public double getBalance() {
        return balance;
    }
}

public class Q14 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        Account account = new Account("A101", "Ravi");

        for (int i = 0; i < n; i++) {

            String[] data = sc.nextLine().split(" ");

            String operation = data[0];

            if (operation.equalsIgnoreCase("deposit")) {

                double amount = Double.parseDouble(data[1]);

                account.deposit(amount);

            } else if (operation.equalsIgnoreCase("withdraw")) {

                double amount = Double.parseDouble(data[1]);

                account.withdraw(amount);

            } else if (operation.equalsIgnoreCase("getBalance")) {

                System.out.println("Balance: " +
                        account.getBalance());
            }
        }

        sc.close();
    }
}
