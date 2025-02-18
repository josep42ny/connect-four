package josepfortuny.connectfour;

public class View {

    public static void drawBoard(Board board) {
        String content = "";
        Player[][] grid = board.getGameGrid();

        content += "┎╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌┒\n";
        for (int row = 0; row < grid.length; row++) {
            content += "┃ ";
            for (int cell = 0; cell < grid[row].length; cell++) {
                if (grid[row][cell] == null) {
                    content += " ○ ";
                } else {
                    content += AnsiCodes.paintString(" ● ", grid[row][cell].getAnsiColor());
                }
            }
            content += " ┃\n";
        }
        content += "┗━━━━━━━━━━━━━━━━━━━━━━━┛";

        System.out.println(content);
    }

    public static void drawCurrentPlayer(Player player) {
        System.out.println(AnsiCodes.paintString(player.getName() + "'s turn", player.getAnsiColor()));
    }

    public static void drawWinner(Player winner) {
        System.out.println(AnsiCodes.paintString(winner.getName() + " ha guanyat, feliçitats!", winner.getAnsiColor()));
        System.out.println();
        System.out.println("aturant...");
    }

    public static void clearScreen() {
        System.out.print(AnsiCodes.ANSI_CLEAR_SCREEN);
        System.out.flush();
    }

    public static void clearLastLine() {
        System.out.print(AnsiCodes.ANSI_LINE_UP);
        System.out.print(AnsiCodes.ANSI_LINE_CLEAR);
        System.out.flush();
    }

}
