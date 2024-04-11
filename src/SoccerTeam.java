public class SoccerTeam {
    private String club;
    private String league;

    public SoccerTeam(String club, String league) {
        this.club = club;
        this.league = league;

    }

    public String getClub() {
        return club;
    }

    public String getLeague() {
        return league;
    }

    public void displayInfo() {
        System.out.println("Club: " + club);
        System.out.println("League: " + league);
    }
}