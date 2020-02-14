package pl.tpinkowski.tictactoe.model;

public enum PlayerSide {
    CROSS(FieldState.CROSS),
    NOUGHT(FieldState.NOUGHT);

    public FieldState fieldStateToMark;

    PlayerSide(FieldState fieldState) {
        this.fieldStateToMark = fieldState;
    }
}
