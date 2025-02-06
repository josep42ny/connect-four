package josepfortuny.connectfour;

public class View {

    public static void drawBoard(Board board) {

        String content = "";
        Character[][] grid = board.getGameGrid();

        content += "┎╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌┒\n";
        for (int row = 0; row < grid.length; row++) {
            content += "┃ ";
            for (int cell = 0; cell < grid[row].length; cell++) {
                if (grid[row][cell] == null) {
                    content += " ○ ";
                } else {
                    content += grid[row][cell].getAnsiColor() + " ● " + AnsiCodes.ANSI_RESET;
                }
            }
            content += " ┃\n";
        }
        content += "┗━━━━━━━━━━━━━━━━━━━━━━━┛";

        System.out.println(content);

    }

    public static void drawCurrentPlayer(Character player) {
        System.out.println(player.getAnsiColor() + player.getName() + "'s turn" + AnsiCodes.ANSI_RESET);
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
