package josepfortuny.connectfour;

public class Board {

    private int rows;
    private int columns;
    private final Player[][] gameGrid;
    private Player winner;

    public Board(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        this.gameGrid = new Player[rows][columns];
    }

    public Player[][] getGameGrid() {
        return gameGrid;
    }

    public Player getWinner() {
        return winner;
    }

    public boolean playerWon() {
        return winner != null;
    }

    public void setWinner(Player winner) {
        this.winner = winner;
    }

    public void play(Player player, int column) {
        int row = findFreeRow(column);
        gameGrid[row][column] = player;
        checkWin(player, row, column);
    }

    public void checkWin(Player player, int row, int column) {
        checkLine(player, 0, row, 1, 0);
        checkLine(player, column >= row ? column - row : 0, row >= column ? row - column : 0, 1, 1);
        checkLine(player, column, 0, 0, 1);
        checkLine(player, column >= (gameGrid.length - row - 1) ? column - (gameGrid.length - row - 1) : 0, column >= (gameGrid.length - row - 1) ? gameGrid.length - 1 : row + column, 1, -1);
    }

    private void checkLine(Player player, int positionX, int positionY, int offsetX, int offsetY) {
        int posX = positionX;
        int posY = positionY;
        int count = 0;

        while ((posY >= 0 && posY < gameGrid.length) && (posX >= 0 && posX < gameGrid[posY].length)) {
            if (gameGrid[posY][posX] != null && gameGrid[posY][posX].equals(player)) {
                count++;
            } else {
                count = 0;
            }
            if (count >= 4) {
                setWinner(player);
                return;
            }
            posX += offsetX;
            posY += offsetY;
        }
    }

    private int findFreeRow(int column) {
        for (int row = gameGrid.length - 1; row >= 0; row--) {
            if (gameGrid[row][column] == null) {
                return row;
            }
        }

        return -1;
    }

    public boolean canDropPiece(int column) {
        boolean columnExists = column < columns && column >= 0;

        if (columnExists) {
            return gameGrid[0][column] == null; // if there's a piece at row 0, the row is full
        } else {
            return false;
        }

    }

}
