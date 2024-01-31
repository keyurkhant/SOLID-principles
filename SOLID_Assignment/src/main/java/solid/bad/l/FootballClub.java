package solid.bad.l;

public class FootballClub extends SportsClub{
    private int totalGoalsScored;

    public FootballClub(String id, String clubName, String location, int totalPlayers) {
        super(id, clubName, location, totalPlayers);
    }

    @Override
    public String getId() {
        return super.getId();
    }

    @Override
    public void setId(String id) {
        super.setId(id);
    }

    @Override
    public String getClubName() {
        return super.getClubName();
    }

    @Override
    public void setClubName(String clubName) {
        super.setClubName(clubName);
    }

    @Override
    public String getLocation() {
        return super.getLocation();
    }

    @Override
    public void setLocation(String location) {
        super.setLocation(location);
    }

    @Override
    public int getTotalPlayers() {
        return super.getTotalPlayers();
    }

    @Override
    public void setTotalPlayers(int totalPlayers) {
        super.setTotalPlayers(totalPlayers);
    }

    public void addPlayer(FootballPlayer player) {
        super.addPlayer(player);
        totalGoalsScored += player.getGoalsScored();
    }

    public void removePlayer(FootballPlayer player) {
        super.removePlayer(player);
        totalGoalsScored += player.getGoalsScored();
    }
}
