package josepfortuny.connectfour;

public class GameController {

    InputHandler inputHandler;
    Board gameBoard;
    Character[] players;
    int gameState;

    public void awake() {

        gameState = GameState.RUN;
        inputHandler = new InputHandler();
        gameBoard = new Board(6, 7);
        gameBoard.checkLine(0, 0, 1, 0);

        /*
        players = inputHandler.askForPlayers();
        update();
*/
    }

    public void update() {

        while (gameState == GameState.RUN) {

            for (Character player : players) {

                int move;

                do {
                    View.clearScreen();
                    View.drawBoard(gameBoard);
                    View.drawCurrentPlayer(player);
                    move = inputHandler.askMove();
                } while (!gameBoard.canDropPiece(move));

                gameBoard.play(player, move);

                View.clearScreen();
                View.drawBoard(gameBoard);
            }

        }

    }

}
