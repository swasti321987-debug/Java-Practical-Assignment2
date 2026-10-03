import java.util.*;

class Room {
    private String roomNumber;
    private String block;
    private String type;

    public Room(String roomNumber, String block, String type) {
        this.roomNumber = roomNumber;
        this.block = block;
        this.type = type;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public String getBlock() {
        return block;
    }

    public String getType() {
        return type;
    }
}

class Student {
    private String name;
    private String roll;
    private String course;
    private Room room;

    public Student(String name, String roll, String course) {
        this.name = name;
        this.roll = roll;
        this.course = course;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    @Override
    public String toString() {

        return "Student: " + name +
               " (" + roll + ") " + course +
               "\nRoom: " + room.getRoomNumber() +
               " " + room.getBlock() +
               " " + room.getType();
    }
}

public class Q11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] studentData = sc.nextLine().split(",");

        Student student = new Student(
                studentData[0].trim(),
                studentData[1].trim(),
                studentData[2].trim()
        );

        String[] roomData = sc.nextLine().split(",");

        Room room = new Room(
                roomData[0].trim(),
                roomData[1].trim(),
                roomData[2].trim()
        );

        student.setRoom(room);

        System.out.println(student);

        sc.close();
    }
}