package josepfortuny.connectfour;

public final class GameController {

    private static GameController INSTANCE;
    private InputHandler inputHandler;
    private Board gameBoard;
    private Player[] players;
    private int gameState;

    private GameController() {
    }

    public static GameController getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new GameController();
        }
        return INSTANCE;
    }

    public void setGameState(int gameState) {
        this.gameState = gameState;
    }

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
                    View.displayWinner(gameBoard.getWinner());
                    return;
                }

            }

        }

    }

}
