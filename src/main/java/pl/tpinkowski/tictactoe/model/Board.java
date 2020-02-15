package pl.tpinkowski.tictactoe.model;

public class Board {
    Field[][] fields;

    public Board() {
        fields = new Field[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                fields[i][j] = new Field();
            }
        }
    }

    public void printBoard() {
        for (int i = 0; i < 30; i++) {
            System.out.println();
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                fields[i][j].print();
            }
            System.out.println();
        }
    }

    public void move(Integer firstCoordinate, Integer secondCoordinate, PlayerSide playerSide) throws CannotMoveException {
        if (firstCoordinate < 0 || firstCoordinate > 3 || secondCoordinate < 0 || secondCoordinate > 3
                || fields[firstCoordinate][secondCoordinate].state != FieldState.EMPTY) {
            throw new CannotMoveException();
        }
        fields[firstCoordinate][secondCoordinate].state = playerSide.fieldStateToMark;
    }

    public FieldState checkWhoWon() {
        if (check(FieldState.NOUGHT)) {
            return FieldState.NOUGHT;
        }

        if (check(FieldState.CROSS)) {
            return FieldState.CROSS;
        }
        return null;
    }

    public boolean checkNextMovePossible() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (fields[i][j].state == FieldState.EMPTY) return true;
            }
        }
        return false;
    }

    private boolean check(FieldState state) {
        return checkRows(state) ||
                checkColumns(state) ||
                checkDiagonals(state);
    }

    private boolean checkDiagonals(FieldState state) {
        if (fields[0][0].state == state && fields[1][1].state == state && fields[2][2].state == state) {
            return true;
        }
        if (fields[2][0].state == state && fields[1][1].state == state && fields[0][2].state == state) {
            return true;
        }
        return false;
    }

    private boolean checkColumns(FieldState state) {
        for (int i = 0; i < 3; i++) {
            boolean notMatch = false;
            for (int j = 0; j < 3; j++) {
                if (fields[j][i].state != state) notMatch = true;
            }
            if (!notMatch) return true;
        }
        return false;
    }

    private boolean checkRows(FieldState state) {
        for (int i = 0; i < 3; i++) {
            boolean notMatch = false;
            for (int j = 0; j < 3; j++) {
                if (fields[i][j].state != state) notMatch = true;
            }
            if (!notMatch) return true;
        }
        return false;
    }
}
