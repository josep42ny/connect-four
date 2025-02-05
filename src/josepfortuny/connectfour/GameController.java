package josepfortuny.connectfour;

public class GameController {

    View gameView;
    Board gameBoard;

    public void awake() {

        gameView = new View();
        gameBoard = new Board(6, 7);
        update();

    }

    public void update() {


    }

}
