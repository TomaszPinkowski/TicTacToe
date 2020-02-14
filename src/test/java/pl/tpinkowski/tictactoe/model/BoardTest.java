package pl.tpinkowski.tictactoe.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static pl.tpinkowski.tictactoe.model.FieldState.CROSS;

class BoardTest {

    @Test
    void checkNextMovePossibleShouldReturnTrueWhenBoardIsNotFull() {
        Board board = new Board();
        for (int i = 0 ;i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                board.fields[i][j].state = CROSS;
            }
        }

        assertTrue(board.checkNextMovePossible());
    }

    @Test
    void checkNextMovePossibleShouldReturnFalseWhenBoardIsFull() {
        Board board = new Board();
        for (int i = 0 ;i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board.fields[i][j].state = CROSS;
            }
        }

        assertFalse(board.checkNextMovePossible());
    }
}