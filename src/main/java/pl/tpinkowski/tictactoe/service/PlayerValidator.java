package pl.tpinkowski.tictactoe.service;

import pl.tpinkowski.tictactoe.model.Player;

public class PlayerValidator {
    public boolean validatePlayers(Player player1, Player player2) {
        if (player1.getPlayerSide() == player2.getPlayerSide()) {
            System.out.println("Players must have different sides");
            return false;
        }
        if (player1.getName().equals(player2.getName())) {
            System.out.println("Players must have different names");
            return false;
        }
        return true;
    }
}
