package pl.tpinkowski.tictactoe.interaction;

public interface UserContactInterface {
    String ask(String about);

    String choose(String[] options, String message);
}
