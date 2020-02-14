package pl.tpinkowski.tictactoe.model;

public class Field {
    FieldState state;

    public Field() {
        state = FieldState.EMPTY;
    }

    public void print() {
        switch (state) {
            case CROSS:
                System.out.print("X");
                break;
            case NOUGHT:
                System.out.print("O");
                break;
            case EMPTY:
                System.out.print(".");
        }
    }
}
