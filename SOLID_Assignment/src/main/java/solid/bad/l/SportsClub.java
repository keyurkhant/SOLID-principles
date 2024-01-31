package solid.bad.l;

public class SportsClub {
    private String id;
    private String clubName;
    private String location;
    private int totalPlayers;

    public SportsClub(String id, String clubName, String location, int totalPlayers) {
        this.id = id;
        this.clubName = clubName;
        this.location = location;
        this.totalPlayers = totalPlayers;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getClubName() {
        return clubName;
    }

    public void setClubName(String clubName) {
        this.clubName = clubName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getTotalPlayers() {
        return totalPlayers;
    }

    public void setTotalPlayers(int totalPlayers) {
        this.totalPlayers = totalPlayers;
    }

    public void addPlayer(Player player) {
        totalPlayers++;
    }

    public void removePlayer(Player player) {
        totalPlayers--;
    }
}
