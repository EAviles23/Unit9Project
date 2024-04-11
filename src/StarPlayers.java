public class StarPlayers extends SoccerTeam {
    private String playerName;

    public StarPlayers (String club, String league, String playerName){
        super(club,league);
        this.playerName = playerName;
    }
    public String getPlayerName() {
        return playerName;
    }
}
