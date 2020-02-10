package pl.tpinkowski.tictactoe;

import pl.tpinkowski.tictactoe.interaction.ConsoleInterface;
import pl.tpinkowski.tictactoe.interaction.UserContactInterface;
import pl.tpinkowski.tictactoe.service.PlayerValidator;

public class Services {
    public static UserContactInterface userContactInterface = new ConsoleInterface();
    public static PlayerValidator pLayerValidator = new PlayerValidator();
}
