package solid.good.l;
public class SportsManagementSystem {
    public static void main(String[] args) {
        SportsClub club = new FootballClub("1", "Mohan Began", "Kolkata", 23);
        Player player1 = new FootballPlayer("1", "Sunil Chhetri", 33);
        Player player2 = new CricketPlayer("2", "MS Dhoni", 28);

        club.addPlayer(player1);
        System.out.println(club.getTotalPlayers());
        club.addPlayer(player2);
        System.out.println(club.getTotalPlayers());
    }
}
