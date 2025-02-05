package josepfortuny.connectfour;

public class Board {

    private int rows;
    private int columns;
    private Character[][] playGrid = new Character[6][7];

    public Board(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
    }

    public Character[][] getPlayGrid() {
        return playGrid;
    }

    public void play(Character character, int column) {


    }

    private int findFreeRow(int column) {
        for (int row = playGrid.length - 1; row >= 0; row--) {
            if (playGrid[row][column] == null) {
                return row;
            }
        }
        return -1;
    }

    public boolean canDropPiece(int column) {
        return playGrid[0][column] == null;
    }

}
