import java.util.*;

class Professor {
    private String name;
    private String employeeId;
    private String specialization;

    public Professor() {
    }

    public Professor(String name, String employeeId, String specialization) {
        this.name = name;
        this.employeeId = employeeId;
        this.specialization = specialization;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    @Override
    public String toString() {
        return "Name: " + name +
               ", ID: " + employeeId +
               ", Specialization: " + specialization;
    }
}

class Department {
    private String deptName;
    private String hodName;
    private List<Professor> professors;

    public Department() {
        professors = new ArrayList<>();
    }

    public Department(String deptName, String hodName) {
        this.deptName = deptName;
        this.hodName = hodName;
        this.professors = new ArrayList<>();
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getHodName() {
        return hodName;
    }

    public void setHodName(String hodName) {
        this.hodName = hodName;
    }

    public List<Professor> getProfessors() {
        return professors;
    }

    public void setProfessors(List<Professor> professors) {
        this.professors = professors;
    }

    public void addProfessor(Professor p) {
        professors.add(p);
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();

        result.append("Department: ").append(deptName).append("\n");
        result.append("HOD: ").append(hodName).append("\n");
        result.append("Professors:\n");

        for (Professor p : professors) {
            result.append(p).append("\n");
        }

        return result.toString();
    }
}

public class Q1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Department details
        System.out.print("Enter Department details (deptName,hodName): ");
        String[] dept = sc.nextLine().split(",", 2);

        Department department =
                new Department(dept[0].trim(), dept[1].trim());

        // Number of professors
        System.out.print("Enter number of professors: ");
        int n = Integer.parseInt(sc.nextLine());

        // Professor details
        for (int i = 0; i < n; i++) {

            System.out.print(
                "Enter professor details (name,employeeId,specialization): "
            );

            String[] data = sc.nextLine().split(",");

            Professor p = new Professor(
                    data[0].trim(),
                    data[1].trim(),
                    data[2].trim()
            );

            department.addProfessor(p);
        }

        // Display output
        System.out.println("\n" + department);

        sc.close();
    }
}