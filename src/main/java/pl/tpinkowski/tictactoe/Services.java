package pl.tpinkowski.tictactoe;

import pl.tpinkowski.tictactoe.interaction.ConsoleInterface;
import pl.tpinkowski.tictactoe.interaction.UserContactInterface;
import pl.tpinkowski.tictactoe.service.GameService;
import pl.tpinkowski.tictactoe.service.PlayerManager;
import pl.tpinkowski.tictactoe.service.PlayerValidator;
import pl.tpinkowski.tictactoe.service.ResultService;

public class Services {
    public static UserContactInterface userContactInterface = new ConsoleInterface();
    public static PlayerValidator pLayerValidator = new PlayerValidator();
    public static PlayerManager playerManager = new PlayerManager();
    public static ResultService resultService = new ResultService();
    public static GameService gameService = new GameService();
}
