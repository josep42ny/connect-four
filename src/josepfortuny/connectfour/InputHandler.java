package josepfortuny.connectfour;

public class InputHandler {

    private int playerAmount;

    public InputHandler(int playerAmount) {
        this.playerAmount = playerAmount;
    }

    public Player[] askForPlayers() {
        Player[] players = new Player[playerAmount];

        for (int i = 0; i < players.length; i++) {
            System.out.print(Player.getAnsiColorById(i) + ">>> ● Player " + (i + 1) + " <<<\n" + AnsiCodes.ANSI_RESET);
            String name = read("Name: ");
            players[i] = new Player(name);
            System.out.println();
        }

        return players;
    }

    public int askMove() {
        int parsed;

        while (true) {
            String input = read("");

            try {
                parsed = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                View.clearLastLine();
                continue;
            }

            break;
        }

        return parsed;
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
