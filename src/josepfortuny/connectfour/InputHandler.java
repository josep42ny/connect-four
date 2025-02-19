package josepfortuny.connectfour;

public class InputHandler {

    private int playerAmount;

    public InputHandler(int playerAmount) {
        this.playerAmount = playerAmount;
    }

    public String[] askForPlayers() {
        String[] names = new String[playerAmount];

        for (int i = 0; i < names.length; i++) {
            System.out.println(AnsiCodes.paintString("Enter name for player " + (i + 1), AnsiCodes.ANSI_COLORS[i]));
            String name = read("> ");
            names[i] = name;
            System.out.println();
        }

        return names;
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
