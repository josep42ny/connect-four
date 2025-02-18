package josepfortuny.connectfour;

public class GameController {

    private InputHandler inputHandler;
    private Board gameBoard;
    private Player[] players;

    public void awake() {

        inputHandler = new InputHandler();
        gameBoard = new Board(6, 7);
        players = inputHandler.askForPlayers();
        update();

    }

    public void update() {

        while (true) {

            for (Player player : players) {

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

                if (gameBoard.playerWon()) {
                    View.drawWinner(gameBoard.getWinner());
                    return;
                }

            }

        }

    }

}
