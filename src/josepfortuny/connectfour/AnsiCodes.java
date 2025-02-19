package josepfortuny.connectfour;

public class AnsiCodes {

    private static final String ANSI_RESET = "\u001B[0m";
    private static final String ANSI_BLACK = "\u001B[30m";
    private static final String ANSI_RED = "\u001B[31m";
    private static final String ANSI_GREEN = "\u001B[32m";
    private static final String ANSI_YELLOW = "\u001B[33m";
    private static final String ANSI_BLUE = "\u001B[34m";
    private static final String ANSI_PURPLE = "\u001B[35m";
    private static final String ANSI_CYAN = "\u001B[36m";
    private static final String ANSI_WHITE = "\u001B[37m";
    public static final String[] ANSI_COLORS = {ANSI_YELLOW, ANSI_CYAN, ANSI_BLACK, ANSI_RED, ANSI_GREEN, ANSI_BLUE, ANSI_PURPLE, ANSI_WHITE};
    public static final String ANSI_CLEAR_SCREEN = "\033[H\033[2J";
    public static final String ANSI_LINE_UP = "\033[1A";
    public static final String ANSI_LINE_CLEAR = "\033[2K";

    public static String paintString(String text, String ansiColor) {
        return ansiColor + text + ANSI_RESET;
    }

}
