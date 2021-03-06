package pl.tpinkowski.tictactoe.model;

public class Game {
    private Player player1;
    private Player player2;

    private GameState gameState;
    private Board board = new Board();

    public Game() {
        gameState = GameState.BEFORE_START;
    }

    public Board getBoard() {
        return board;
    }

    public Player getPlayer1() {
        return player1;
    }

    public void setPlayer1(Player player1) {
        this.player1 = player1;
    }

    public Player getPlayer2() {
        return player2;
    }

    public void setPlayer2(Player player2) {
        this.player2 = player2;
    }

    public GameState getGameState() {
        return gameState;
    }

    public void setGameState(GameState gameState) {
        this.gameState = gameState;
    }
}
