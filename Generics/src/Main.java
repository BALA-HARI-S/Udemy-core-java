
interface Player{};
record BaseballPlayer(String name, String position) implements Player{}
record FootballPlayer(String name, String position) implements Player{}

public class Main {
    public static void main(String[] args) {

        BaseballTeam phillies1 = new BaseballTeam("Phillies");
        BaseballTeam astros1 = new BaseballTeam("Astros");
        scoreResult(phillies1, 3, astros1, 5);
        var harper = new BaseballPlayer("harper","Fielder");
        var marsh = new BaseballPlayer("marsh","Fielder");

        phillies1.addTeamMember(harper);
        phillies1.addTeamMember(marsh);
        phillies1.listTeamMembers();

        Team<FootballPlayer> phillies2 = new Team<>("phillies2");
        var hari = new FootballPlayer("hari", "Center");
        phillies2.addTeamMember(hari);
        phillies2.listTeamMembers();

//      String can be able to use as a TYPE for TEAM
//      Use " Upper Bound " for protection

//        var astros = new Team<String>("astros");
//        Type parameter 'java.lang.String' is not within its bound; should implement 'Player'
//        astros.addTeamMember("karthi");
//        astros.listTeamMembers();


    }
    public static void scoreResult(BaseballTeam team1, int t1_score,
                                   BaseballTeam team2, int t2_score){
        String message = team1.setScore(t1_score, t2_score);
        System.out.printf("%s %s %s", team1, message, team2);
    }

    public static void scoreResult(Team team1, int t1_score,
                                   Team team2, int t2_score){
        String message = team1.setScore(t1_score, t2_score);
        System.out.printf("%s %s %s", team1, message, team2);
    }
}