package josepfortuny.connectfour;

public class GameController {

    InputHandler inputHandler;
    Board gameBoard;
    Character[] players;

    public void awake() {

        inputHandler = new InputHandler();
        gameBoard = new Board(6, 7);
        players = inputHandler.askForPlayers();
        update();

    }

    public void update() {


    }

}
