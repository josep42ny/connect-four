package josepfortuny.connectfour;

public class View {

    public static final String ANSI_RESET = "\u001B[0m";
    int widht;
    int height;

    public View(int widht, int height) {
        this.widht = widht;
        this.height = height;
    }

    public static void drawBoard(Board board) {

        String content = "";
        Character[][] grid = board.getPlayGrid();

        for (int row = 0; row < grid.length; row++) {
            for (int cell = 0; cell < grid[row].length; cell++) {
                if (grid[row][cell] == null) {
                    content += " ○ ";
                } else {
                    content += grid[row][cell].getAnsiColor() + " ● " + ANSI_RESET;
                }
            }
            content += "\n";
        }

        String out =
                ">>> Connect Four <<<" + "\n" + "\n" +
                        "┎╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌┒" + "\n" +
                        "┃  ●  ●  ●  ●  ●  ●  ●  ┃" + "\n" +
                        "┃  ●  ●  ●  ●  ●  ●  ●  ┃" + "\n" +
                        "┃  ●  ●  ●  ●  ●  ●  ●  ┃" + "\n" +
                        "┃  ●  ●  ●  ●  ●  ●  ●  ┃" + "\n" +
                        "┃  ●  ●  ●  ●  ●  ●  ●  ┃" + "\n" +
                        "┃  ●  ●  ●  ●  ●  ●  ●  ┃" + "\n" +
                        "┗━━━━━━━━━━━━━━━━━━━━━━━┛" + "\n";
        System.out.println(out);
        // ○
        // ●
    }

}
