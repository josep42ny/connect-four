package josepfortuny.connectfour;

public class Player {

    private static final String[] COLORS = {AnsiCodes.ANSI_CYAN, AnsiCodes.ANSI_YELLOW};
    private static int count = 0;
    private int id;
    private String name;
    private String ansiColor;

    public Player(String name) {
        this.id = count++;
        this.name = name;
        this.ansiColor = COLORS[id];
    }

    public String getName() {
        return name;
    }

    public String getAnsiColor() {
        return ansiColor;
    }

    public static String getAnsiColorById(int id) {
        return COLORS[id];
    }

}
