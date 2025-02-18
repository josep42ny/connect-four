package josepfortuny.connectfour;

public class GameController {

    private final int boardRows = 6;
    private final int boardColumns = 7;
    private final int playerAmount = 2;
    private InputHandler inputHandler;
    private Board gameBoard;
    private Player[] players;

    public void awake() {

        inputHandler = new InputHandler(playerAmount);
        gameBoard = new Board(boardRows, boardColumns);
        String[] names = inputHandler.askForPlayers();
        players = new Player[names.length];
        for (int i = 0; i < players.length; i++) {
            players[i] = new Player(names[i]);
        }
        update();

    }

    private void update() {

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
