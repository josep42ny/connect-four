package josepfortuny.connectfour;

public class Board {

    private Character[][] playGrid = new Character[6][7];

    public Character[][] getPlayGrid() {
        return playGrid;
    }

    public void play(Character character, int column) {
        playGrid[0][column] = character;
    }

}
