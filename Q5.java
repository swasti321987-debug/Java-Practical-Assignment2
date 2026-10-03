import java.util.*;

class Person {
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Doctor extends Person {
    protected String specialization;

    public Doctor(String name, int age, String specialization) {
        super(name, age);
        this.specialization = specialization;
    }
}

class Surgeon extends Doctor {
    private String surgeryType;

    public Surgeon(String name, int age,
                   String specialization, String surgeryType) {

        super(name, age, specialization);
        this.surgeryType = surgeryType;
    }

    @Override
    public String toString() {

        return "Name: " + name +
               "\nAge: " + age +
               "\nSpecialization: " + specialization +
               "\nSurgery Type: " + surgeryType;
    }
}

public class Q5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] data = sc.nextLine().split(",");

        Surgeon surgeon = new Surgeon(
                data[0].trim(),
                Integer.parseInt(data[1].trim()),
                data[2].trim(),
                data[3].trim()
        );

        System.out.println(surgeon);

        sc.close();
    }
}
