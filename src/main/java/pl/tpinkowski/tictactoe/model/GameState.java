package pl.tpinkowski.tictactoe.model;

public enum GameState {
    BEFORE_START(false),
    PLAYER1_MOVE(false),
    PLAYER2_MOVE(false),
    PLAYER1_WON(true),
    PLAYER2_WON(true),
    DRAW(true);

    public boolean finished;

    GameState(boolean finished) {
        this.finished = finished;
    }
}
