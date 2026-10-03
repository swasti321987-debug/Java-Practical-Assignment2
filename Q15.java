import java.util.*;

class Passport {
    private String passportNo;
    private String issueDate;
    private String expiryDate;

    // Parameterized constructor
    public Passport(String passportNo, String issueDate, String expiryDate) {
        this.passportNo = passportNo;
        this.issueDate = issueDate;
        this.expiryDate = expiryDate;
    }

    // Getters
    public String getPassportNo() {
        return passportNo;
    }

    public String getIssueDate() {
        return issueDate;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    // Setters
    public void setPassportNo(String passportNo) {
        this.passportNo = passportNo;
    }

    public void setIssueDate(String issueDate) {
        this.issueDate = issueDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    @Override
    public String toString() {
        return "Passport: " + passportNo +
               " Issue: " + issueDate +
               " Expiry: " + expiryDate;
    }
}

class Citizen {
    private String name;
    private String dob;
    private String address;
    private Passport passport;

    // Parameterized constructor
    public Citizen(String name, String dob, String address) {
        this.name = name;
        this.dob = dob;
        this.address = address;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getDob() {
        return dob;
    }

    public String getAddress() {
        return address;
    }

    public Passport getPassport() {
        return passport;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPassport(Passport passport) {
        this.passport = passport;
    }

    @Override
    public String toString() {

        return "Citizen: " + name +
               " DOB: " + dob +
               " Address: " + address +
               "\n" + passport;
    }
}

public class Q15 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Enter Citizen details
        System.out.print("Enter Citizen details (name,dob,address): ");
        String[] citizenData = sc.nextLine().split(",");

        Citizen citizen = new Citizen(
                citizenData[0].trim(),
                citizenData[1].trim(),
                citizenData[2].trim()
        );

        // Enter Passport details
        System.out.print("Enter Passport details (passportNo,issueDate,expiryDate): ");
        String[] passportData = sc.nextLine().split(",");

        Passport passport = new Passport(
                passportData[0].trim(),
                passportData[1].trim(),
                passportData[2].trim()
        );

        // Associate passport with citizen
        citizen.setPassport(passport);

        // Display output
        System.out.println("\n" + citizen);

        sc.close();
    }
}