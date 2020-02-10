package pl.tpinkowski.tictactoe;

import pl.tpinkowski.tictactoe.model.Game;

public class Main {
    public static void main(String[] args) {
        PlayerManager playerManager = new PlayerManager();

        Game game = new Game();

        playerManager.initializePlayers(game);

    }
}
