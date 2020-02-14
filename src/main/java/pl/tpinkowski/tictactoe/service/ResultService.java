package pl.tpinkowski.tictactoe.service;

import pl.tpinkowski.tictactoe.model.Game;

public class ResultService {
    public String getResultMessage(Game game) {
        switch (game.getGameState()) {
            case PLAYER1_WON: return String.format("%s won!!!", game.getPlayer1().getName());
            case PLAYER2_WON: return String.format("%s won!!!", game.getPlayer2().getName());
            case DRAW: return "Draw!!!";
            default: return "Unknown result";
        }
    }
}
