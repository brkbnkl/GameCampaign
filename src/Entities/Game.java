package Entities;

public class Game {

    private int id;
    private String gameName;
    private String gameOfType;

    public Game(int id, String gameName, String gameOfType) {
        this.id = id;
        this.gameName = gameName;
        this.gameOfType = gameOfType;
    }

    public Game () {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public String getGameOfType() {
        return gameOfType;
    }

    public void setGameOfType(String gameOfType) {
        this.gameOfType = gameOfType;
    }
}
