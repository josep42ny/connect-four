package josepfortuny.connectfour;

public class Board {

    private Character[][] playGrid = new Character[6][7];

    public Character[][] getPlayGrid() {
        return playGrid;
    }

    public void play(Character character, int column) {
        playGrid[0][column] = character;
    }

    private int findFreeRow(int column) {
        for (int row = playGrid.length - 1; row >= 0; row--) {
            if (playGrid[row][column] == null) {
                return row;
            }
        }
        return -1;
    }

    private boolean canDropPiece(int column) {
        return playGrid[0][column] == null;
    }

}
