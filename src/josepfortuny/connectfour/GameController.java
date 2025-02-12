package josepfortuny.connectfour;

public final class GameController {

    private static GameController INSTANCE;
    private InputHandler inputHandler;
    private Board gameBoard;
    private Character[] players;
    private int gameState;

    private GameController() {};

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

        gameState = GameState.RUN;
        inputHandler = new InputHandler();
        gameBoard = new Board(6, 7);
        players = inputHandler.askForPlayers();
        update();

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

                if (gameState == GameState.GAME_OVER) {
                    gameOver();
                }
            }

        }

    }

    private void gameOver() {

    }

}
