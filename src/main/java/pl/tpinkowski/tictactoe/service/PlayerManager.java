package pl.tpinkowski.tictactoe.service;

import pl.tpinkowski.tictactoe.Services;
import pl.tpinkowski.tictactoe.interaction.UserContactInterface;
import pl.tpinkowski.tictactoe.model.Game;
import pl.tpinkowski.tictactoe.model.Player;
import pl.tpinkowski.tictactoe.model.PlayerSide;
import pl.tpinkowski.tictactoe.service.PlayerValidator;

public class PlayerManager {
    UserContactInterface userContactInterface = Services.userContactInterface;
    PlayerValidator playerValidator = Services.pLayerValidator;

    public void initializePlayers(Game game) {
        while (true) {
            Player player1 = initializePlayer("first");
            Player player2 = initializePlayer("second");
            if (playerValidator.validatePlayers(player1, player2)) {
                game.setPlayer1(player1);
                game.setPlayer2(player2);
                return;
            } else {
                System.out.println("Try again!!!");
            }
        }
    }

    private Player initializePlayer(String description) {
        String playerName = userContactInterface.ask(String.format("Write name of %s player: ", description));
        PlayerSide playerSide = askPLayerSide(description);
        return new Player(playerName, playerSide);
    }

    private PlayerSide askPLayerSide(String description) {
        String chosenValue = userContactInterface.choose(new String[] {PlayerSide.CROSS.toString(), PlayerSide.NOUGHT.toString()},
                String.format("Choose player %s side", description));
        return PlayerSide.valueOf(chosenValue);
    }
}
