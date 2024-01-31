package solid.good.l;

import java.util.ArrayList;
import java.util.List;

public class FootballClub extends SportsClub{
    private int totalGoalsScored;
    private List<FootballPlayer> players = new ArrayList<>();
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

    @Override
    public void addPlayer(Player player) {
        if (player instanceof FootballPlayer) {
            FootballPlayer footballPlayer = (FootballPlayer) player;
            players.add(footballPlayer);
            totalGoalsScored += footballPlayer.getGoalsScored();
            setTotalPlayers(getTotalPlayers() + 1);
        } else {
            throw new IllegalArgumentException("Invalid player type");
        }
    }

    @Override
    public void removePlayer(Player player) {
        if (player instanceof FootballPlayer) {
            FootballPlayer footballPlayer = (FootballPlayer) player;
            players.remove(footballPlayer);
            totalGoalsScored -= footballPlayer.getGoalsScored();
            setTotalPlayers(getTotalPlayers() - 1);
        } else {
            throw new IllegalArgumentException("Invalid player type");
        }
    }
}
