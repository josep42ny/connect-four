package josepfortuny.connectfour;

public class InputHandler {


    public Character[] askForPlayers() {
        Character[] players = new Character[2];

        for (int i = 0; i < players.length; i++) {
            System.out.print(Character.getAnsiColorFromCharacter(i) + ">>> ● Player " + (i + 1) + " <<<\n" + AnsiCodes.ANSI_RESET);
            String name = read("Name: ");
            players[i] = new Character(name);
            System.out.println();
        }

        return players;
    }

    public int askMoveFrom(Character player) {
        String input = read(player.getAnsiColor() + player.getName() + AnsiCodes.ANSI_RESET);

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
