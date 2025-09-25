import java.util.ArrayList;

// Task 1b: Entity class Team
class Team {
   
    // Task 1c: Private instance variable for team name
    private String teamName;

    // Task 1d: Private instance variable for rank (integer)
    private int teamRank;

    // Task 1e: Private list of players
    private ArrayList<String> playersInTeam = new ArrayList<>();

    // Task 1f: Constructor with teamName as parameter
    public Team(String teamName) {
        this.teamName = teamName;
    }

    // Task 1h: Method to set rank
    public void setRank(int teamRank) {
        this.teamRank = teamRank;
    }

    // Task 1l: Method to add a player to the list
    public void addPlayer(String playerName) {
        playersInTeam.add(playerName);
    }

    // Task 1j + 1m: toString returns team name, rank, and players (one per line)
    @Override
    public String toString() {
        String result = "Team: " + teamName + " Rank: " + teamRank;

        if (!playersInTeam.isEmpty()) {
            result += "\nPlayers:";
            for (String player : playersInTeam) {
                result += "\n " + player;
            }
        }

        return result;
    }
}
