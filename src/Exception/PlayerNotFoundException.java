package Exception;

public class PlayerNotFoundException extends Exception {
    private String playerName;

    public PlayerNotFoundException(String playerName) {
        this.playerName = playerName;
    }
    public String getPlayerName() {
        return playerName;
    }
}
