package josepfortuny.connectfour;

public class Character {

    private static final String[] COLORS = {AnsiCodes.ANSI_CYAN, AnsiCodes.ANSI_YELLOW};
    private static int count = 0;
    private int id;
    private String name;
    private String ansiColor;

    public Character(String name) {
        this.ansiColor = COLORS[count];
        this.id = count++;
    }

    public String getName() {
        return name;
    }

    public String getAnsiColor() {
        return ansiColor;
    }

    public static String getAnsiColorFromCharacter(int id) {
        return COLORS[id];
    }

}
