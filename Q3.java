import java.util.*;

class Employee {
    protected String name;
    protected String id;
    protected double basicSalary;

    public Employee() {
    }

    public Employee(String name, String id, double basicSalary) {
        this.name = name;
        this.id = id;
        this.basicSalary = basicSalary;
    }

    public double calculateSalary() {
        return basicSalary;
    }

    @Override
    public String toString() {
        return "Employee " + name + " (" + id + ") Salary: "
                + calculateSalary();
    }
}

class Manager extends Employee {
    private double bonus;

    public Manager(String name, String id, double basicSalary, double bonus) {
        super(name, id, basicSalary);
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        return basicSalary + bonus;
    }

    @Override
    public String toString() {
        return "Manager " + name + " (" + id + ") Salary: "
                + calculateSalary();
    }
}

public class Q3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter employee details");

        for (int i = 0; i < 2; i++) {

            String[] data = sc.nextLine().split(",");

            if (data[0].equalsIgnoreCase("Employee")) {

                Employee e = new Employee(
                        data[1].trim(),
                        data[2].trim(),
                        Double.parseDouble(data[3].trim())
                );

                System.out.println(e);

            } else if (data[0].equalsIgnoreCase("Manager")) {

                Manager m = new Manager(
                        data[1].trim(),
                        data[2].trim(),
                        Double.parseDouble(data[3].trim()),
                        Double.parseDouble(data[4].trim())
                );

                System.out.println(m);
            }
        }

        sc.close();
    }
}