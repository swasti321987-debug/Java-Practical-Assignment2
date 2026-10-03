import java.util.*;

class Guest {
    private String name;
    private int age;
    private String idProof;

    public Guest(String name, int age, String idProof) {
        this.name = name;
        this.age = age;
        this.idProof = idProof;
    }

    @Override
    public String toString() {
        return name + "," + age + "," + idProof;
    }
}

class Reservation {
    private String reservationId;
    private String roomType;
    private List<Guest> guests;

    public Reservation(String reservationId, String roomType) {
        this.reservationId = reservationId;
        this.roomType = roomType;
        guests = new ArrayList<>();
    }

    public void addGuest(Guest guest) {
        guests.add(guest);
    }

    @Override
    public String toString() {

        StringBuilder result = new StringBuilder();

        result.append("Reservation ID: ")
              .append(reservationId)
              .append(" Room: ")
              .append(roomType)
              .append("\n");

        result.append("Guests:\n");

        for (Guest g : guests) {
            result.append(g).append("\n");
        }

        return result.toString();
    }
}

public class Q13 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] reservationData = sc.nextLine().split(",");

        Reservation reservation = new Reservation(
                reservationData[0].trim(),
                reservationData[1].trim()
        );

        int n = Integer.parseInt(reservationData[2].trim());

        for (int i = 0; i < n; i++) {

            String[] guestData = sc.nextLine().split(",");

            Guest guest = new Guest(
                    guestData[0].trim(),
                    Integer.parseInt(guestData[1].trim()),
                    guestData[2].trim()
            );

            reservation.addGuest(guest);
        }

        System.out.print(reservation);

        sc.close();
    }
}
