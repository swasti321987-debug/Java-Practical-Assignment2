import java.util.*;

class Team {
    protected String name;
    protected int matchesPlayed;
    protected int wins;
    protected int draws;

    public Team(String name, int matchesPlayed, int wins, int draws) {
        this.name = name;
        this.matchesPlayed = matchesPlayed;
        this.wins = wins;
        this.draws = draws;
    }

    public int calculatePoints() {
        return 0;
    }
}

class CricketTeam extends Team {

    public CricketTeam(String name, int matchesPlayed,
                       int wins, int draws) {

        super(name, matchesPlayed, wins, draws);
    }

    @Override
    public int calculatePoints() {
        return (wins * 2) + draws;
    }

    @Override
    public String toString() {
        return "Team: " + name +
               " (Cricket) Points: " + calculatePoints();
    }
}

class FootballTeam extends Team {

    public FootballTeam(String name, int matchesPlayed,
                        int wins, int draws) {

        super(name, matchesPlayed, wins, draws);
    }

    @Override
    public int calculatePoints() {
        return (wins * 3) + draws;
    }

    @Override
    public String toString() {
        return "Team: " + name +
               " (Football) Points: " + calculatePoints();
    }
}

public class Q7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 2; i++) {

            String[] data = sc.nextLine().split(",");

            String type = data[0].trim();
            String name = data[1].trim();
            int matches = Integer.parseInt(data[2].trim());
            int wins = Integer.parseInt(data[3].trim());
            int draws = Integer.parseInt(data[4].trim());

            Team team;

            if (type.equalsIgnoreCase("Cricket")) {
                team = new CricketTeam(name, matches, wins, draws);
            } else {
                team = new FootballTeam(name, matches, wins, draws);
            }

            System.out.println(team);
        }

        sc.close();
    }
}
