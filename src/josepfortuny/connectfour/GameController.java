package josepfortuny.connectfour;

public class GameController {

    InputHandler inputHandler;
    View gameView;
    Board gameBoard;

    public void awake() {

        inputHandler = new InputHandler();
        gameView = new View();
        gameBoard = new Board(6, 7);
        update();

    }

    public void update() {

        inputHandler.askForPlayers();

    }

}
