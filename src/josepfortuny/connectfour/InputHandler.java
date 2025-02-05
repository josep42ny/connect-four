package josepfortuny.connectfour;

public class InputHandler {

    public Character[] askForPlayers() {
        Character[] players = new Character[2];

        for (int i = 0; i < players.length; i++) {
            System.out.print(">>> Player " + (i + 1) + " <<<\n");
            String name = read("Name: ");
            String color = read("Color: ");
            players[i] = new Character(name, color);
        }

        return players;
    }

    private String read(String prompt) {
        String input = "";
        do {
            System.out.print(prompt);
            input = System.console().readLine();
        } while (input.isEmpty());
        return input;
    }

}
