package josepfortuny.connectfour;

public class Board {

    private int rows;
    private int columns;
    private Character[][] gameGrid;

    public Board(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        this.gameGrid = new Character[rows][columns];
    }

    public Character[][] getGameGrid() {
        return gameGrid;
    }

    public void play(Character character, int column) {


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
        return gameGrid[0][column] == null;
    }

}
