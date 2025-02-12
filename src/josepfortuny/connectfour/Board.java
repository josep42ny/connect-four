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

    public void play(Character player, int column) {

        int row = findFreeRow(column);
        gameGrid[row][column] = player;
        System.out.println(checkWin(player, row, column));

    }

    private boolean checkWin(Character player, int row, int column) {

        for (int i = 0; i < gameGrid[row].length; i++) {
            //if (gameGrid[row][i].getId() == player.getId()) {
            //todo
            //}
        }

        return false;

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
        if (!validColumn(column)) {
            return false;
        }
        
        return gameGrid[0][column] == null;
    }

    public boolean validColumn(int column) {
        return column < columns && column >= 0;
    }

}
