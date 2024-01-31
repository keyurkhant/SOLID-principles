package solid.bad.l;

public class SportsManagementSystem {
    public static void main(String[] args) {
        SportsClub club = new FootballClub("1", "Mohan Began", "Kolkata", 23);
        Player player = new CricketPlayer("1", "MS Dhoni", 28);

        club.addPlayer(player);

        System.out.println(club.getTotalPlayers());
    }
}
