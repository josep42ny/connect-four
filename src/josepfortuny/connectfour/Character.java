package josepfortuny.connectfour;

public class Character {

    private String ansiColor = "\u001B[30m";

    public Character(String ansiColor) {
        this.ansiColor = ansiColor;
    }

    public String getAnsiColor() {
        return ansiColor;
    }
}
