package josepfortuny.connectfour;

public class GameController {

    int width = 7;
    int height = 6;
    View gameView;

    public void awake() {

        gameView = new View(width, height);

    }

}
