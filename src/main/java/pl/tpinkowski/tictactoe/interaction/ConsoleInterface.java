package pl.tpinkowski.tictactoe.interaction;
import java.util.Scanner;

public class ConsoleInterface implements UserContactInterface {
    private Scanner scanner = new Scanner(System.in);

    public String ask(String question) {
        System.out.print(question);
        return scanner.next();
    }

    public String choose(String[] options, String message) {
        boolean wrongInput = false;
        while (true) {
            if (wrongInput) {
                System.out.println("Wrong choose. Try again.");
            }
            System.out.println(message);
            for(int i = 0; i < options.length; i++) {
                System.out.println((i + 1) + ": " + options[i]);
            }
            try {
                String result = scanner.next();
                int chosenIndex = Integer.parseInt(result);
                if (chosenIndex <= options.length) {
                    return options[chosenIndex - 1];
                } else {
                    wrongInput = true;
                }
            } catch (Exception ex) {
                wrongInput = true;
            }
        }

    }
}
