package pl.tpinkowski.tictactoe.model;

public class Player {
    private String name;
    private PlayerSide playerSide;

    public String getName() {
        return name;
    }

    public PlayerSide getPlayerSide() {
        return playerSide;
    }

    public Player(String playerName, PlayerSide playerSide) {
        this.name = playerName;
        this.playerSide = playerSide;
    }
}
