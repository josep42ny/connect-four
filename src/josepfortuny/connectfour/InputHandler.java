package josepfortuny.connectfour;

public class InputHandler {

    private static final String[] COLORS = {AnsiCodes.ANSI_CYAN, AnsiCodes.ANSI_YELLOW};

    public Character[] askForPlayers() {
        Character[] players = new Character[2];

        for (int i = 0; i < players.length; i++) {
            System.out.print(COLORS[i] + ">>> ● Player " + (i + 1) + " <<<\n" + AnsiCodes.ANSI_RESET);
            String name = read("Name: ");
            players[i] = new Character(name, COLORS[i]);
            System.out.println();
        }

        return players;
    }

    private String read(String prompt) {
        String input = "";
        System.out.println();
        do {
            View.clearLastLine();
            System.out.print(prompt);
            input = System.console().readLine();
        } while (input.isEmpty());
        return input;
    }

}
