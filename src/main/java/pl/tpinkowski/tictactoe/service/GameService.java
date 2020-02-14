package pl.tpinkowski.tictactoe.service;

import pl.tpinkowski.tictactoe.model.*;

import static pl.tpinkowski.tictactoe.Services.userContactInterface;
import static pl.tpinkowski.tictactoe.model.GameState.*;

public class GameService {
    public void nextMove(Game game) {
        switch (game.getGameState()) {
            case BEFORE_START:
            case PLAYER1_MOVE:
                nextMove(game, game.getPlayer1());
                break;
            case PLAYER2_MOVE:
                nextMove(game, game.getPlayer2());
                break;
        }
    }

    private void nextMove(Game game, Player player) {
        boolean somethingWasWrong = false;
        while (true) {
            game.getBoard().printBoard();
            if (somethingWasWrong) {
                System.out.println("You entered wrong coordinates, you should enter two numbers first is row, second column, eg 23, try again");
            }
            String nextMove = userContactInterface.ask("Enter your next move: ");
            try {
                Integer firstCoordinate = Integer.parseInt("" + nextMove.charAt(0)) - 1;
                Integer secondCoordinate = Integer.parseInt("" + nextMove.charAt(1)) - 1;
                game.getBoard().move(firstCoordinate,secondCoordinate, player.getPlayerSide());
                determineNewState(game);
                return;
            } catch (Exception ex) {
                somethingWasWrong = true;
            } catch (CannotMoveException e) {
                somethingWasWrong = true;
            }
        }

    }

    private void determineNewState(Game game) {
        FieldState wonSide = game.getBoard().checkWhoWon();
        if (wonSide != null) {
            if (game.getPlayer1().getPlayerSide().fieldStateToMark == wonSide) {
                game.setGameState(PLAYER1_WON);
            } else {
                game.setGameState(PLAYER2_WON);
            }
        } else {
            if (!game.getBoard().checkNextMovePossible()) {
                game.setGameState(GameState.DRAW);
            } else {
                if (game.getGameState() == PLAYER1_MOVE || game.getGameState() == BEFORE_START) {
                    game.setGameState(PLAYER2_MOVE);
                } else if (game.getGameState() == PLAYER2_MOVE) {
                    game.setGameState(PLAYER1_MOVE);
                }
            }
        }
    }
}
