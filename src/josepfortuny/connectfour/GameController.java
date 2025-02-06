package josepfortuny.connectfour;

public class GameController {

    InputHandler inputHandler;
    View gameView;
    Board gameBoard;
    Character[] players;

    public void awake() {

        inputHandler = new InputHandler();
        gameView = new View();
        gameBoard = new Board(6, 7);
        players = inputHandler.askForPlayers();
        update();

    }

    public void update() {


    }

}
