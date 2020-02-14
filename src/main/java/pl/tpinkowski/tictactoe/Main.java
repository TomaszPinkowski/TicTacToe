package pl.tpinkowski.tictactoe;

import pl.tpinkowski.tictactoe.model.Game;

import static pl.tpinkowski.tictactoe.Services.*;

public class Main {
    public static void main(String[] args) {


        Game game = new Game();

        playerManager.initializePlayers(game);
         while (!game.getGameState().finished) {
             gameService.nextMove(game);
         }
        System.out.println(resultService.getResultMessage(game));
    }
}
