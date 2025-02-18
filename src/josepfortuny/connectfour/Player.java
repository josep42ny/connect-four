package josepfortuny.connectfour;

public class Player {

    private static int count = 0;
    private int id;
    private String name;
    private String ansiColor;

    public Player(String name) {
        this.id = count++;
        this.name = name;
        this.ansiColor = AnsiCodes.ANSI_COLORS[id];
    }

    public String getName() {
        return name;
    }

    public String getAnsiColor() {
        return ansiColor;
    }

}
