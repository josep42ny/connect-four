package josepfortuny.connectfour;

public class Character {

    private String name;
    private String ansiColor;

    public Character(String name, String ansiColor) {
        this.ansiColor = ansiColor;
    }

    public String getAnsiColor() {
        return ansiColor;
    }
}
