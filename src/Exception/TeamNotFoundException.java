package Exception;

public class TeamNotFoundException extends Exception {
    private String teamName;

    public TeamNotFoundException(String teamName) {
         this.teamName = teamName;
     }
     public String getTeamName() {
        return teamName;
     }

}
