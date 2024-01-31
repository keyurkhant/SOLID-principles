package solid.bad.l;

public class CricketClub extends SportsClub{
    private int totalRunsScored;
    public CricketClub(String id, String clubName, String location, int totalPlayers) {
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

    public void addPlayer(CricketPlayer player) {
        super.addPlayer(player);
        totalRunsScored += player.getRunsScored();
    }

    public void removePlayer(CricketPlayer player) {
        super.removePlayer(player);
        totalRunsScored -= player.getRunsScored();
    }
}
