import java.util.Scanner;
public class PlayerAgeAndNationality extends StarPlayers {
    private String nationality;
    private String age;

    public PlayerAgeAndNationality (String club, String league, String playerName, String nationality, String age){
        super(club, league, playerName);
        this.nationality = nationality;
        this.age = age;
    }
    public String getNationality() {
        return nationality;
    }
    public String getAge() {
        return age;
    }
}
