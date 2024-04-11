import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

    SoccerTeam team1 = new SoccerTeam("Barcelona", "LaLiga");
        StarPlayers starp2 = new StarPlayers(team1.getClub(), team1.getLeague(), "Lewandowski, Cubarsi, Araujo");
        PlayerAgeAndNationality players2 = new PlayerAgeAndNationality(team1.getClub(), team1.getLeague(), starp2.getPlayerName(), "Poland, Spain, Uruguay",
                "35, 17, 25");

    PlayerAgeAndNationality players1 = new PlayerAgeAndNationality("Paris Saint Germain", "Ligue 1", "Mbappe, Marquinhos, Dembele",
            "France, Brazil, France", "25, 29, 26");

        System.out.println("Enter Name: ");
        String name = scan.nextLine();
        System.out.println("Hello, " + name + " ! \nWould you like to learn more about Barcelona, or Paris Saint Germain? type 1 for Barcelona, or 2 for Paris Saint Germain:");
        int selection1 = scan.nextInt();
        if (selection1 == 1) {
            //BARCELONA
            System.out.println("Team Name: " + team1.getClub() + " \nTeam League: " + team1.getLeague() + "\nTop Players: " + starp2.getPlayerName() + "\nRespective Nationalities: "
                    + players2.getNationality() + "\nRespective Ages: " + players2.getAge());
        }
        else {
            //PSG
            System.out.println("Team Name: " + players1.getClub() + " \nTeam League: " + players1.getLeague() + "\nTop Players: " + players1.getPlayerName() + "\nRespective Nationalities: "
                    + players1.getNationality() + "\nRespective Ages: " + players1.getAge());
        }
        System.out.println("\nWould you like to learn about the other team, too? Type 1 if yes, or 2 if no:");
        int selection2 = scan.nextInt();
        //IF THEY CHOOSE BARCELONA FIRST, THEN PSG, DISPLAY PSG
        if (selection1 == 1 && selection2 == 1) {
            System.out.println("Team Name: " + players1.getClub() + " \nTeam League: " + players1.getLeague() + "\nTop Players: " + players1.getPlayerName() + "\nRespective Nationalities:"
                    + players1.getNationality() + "\nRespective Ages: " + players1.getAge());

            System.out.println("\nThanks for your time, " + name + " ! \nHave a good day!");
        }
        //IF THEY CHOOSE PSG FIRST, THEN BARCELONA, DISPLAY BARCELONA
        else if (selection1 == 2 && selection2 == 1) {
            System.out.println("Team Name: " + team1.getClub() + " \nTeam League: " + team1.getLeague() + "\nTop Players: " + starp2.getPlayerName() + "\nRespective Nationalities:"
                    + players2.getNationality() + "\nRespective Ages: " + players2.getAge());

            System.out.println("\nThanks for your time, " + name + " ! \nHave a good day!");
        }
        else if (selection2 == 2) {
            System.out.println("\nThanks for your time, " + name + " ! \nHave a good day!");
        }
    }

}