import java.util.ArrayList;
import java.util.List;

public class Team<T extends Player> { //Using upper bound
    private String teamName;
    private List<T> teamMembers = new ArrayList<>();
    private int totalWins = 0;
    private int totalLosses = 0;
    private int totalTies = 0;

    public Team(String teamName) {
        this.teamName = teamName;
    }

    public void addTeamMember(T player){
        if(!teamMembers.contains(player)){
            teamMembers.add(player);
        }
    }

    public void listTeamMembers(){
        System.out.println("Team name : " + teamName);
        System.out.println("Team Members : \n" + teamMembers);

    }

    public int ranking(){
        return (totalLosses * 2) + totalTies + 1;
    }

    public String setScore(int ourScore, int theirScore){
        String message = "lose to";
        if(ourScore > theirScore){
            totalWins++;
            message = "beat";
        } else if (ourScore == theirScore) {
            totalTies++;
            message = "teid";
        }else {
            totalLosses++;
        }
        return message;

    }

    @Override
    public String toString(){
        return teamName + "(Ranked " + ranking() + ")";
    }

}
