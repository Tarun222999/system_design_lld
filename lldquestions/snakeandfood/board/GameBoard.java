package lldquestions.snakeandfood.board;

public class GameBoard {
    private static GameBoard instance;
    private int height, width;

    public GameBoard(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public static GameBoard getInstance(int width, int height) {
        if (instance == null) {
            instance = new GameBoard(height, width);
        }
        return instance;
    }

    public int getHeight() {
        return this.height;
    }

    public int getWidth() {
        return this.width;
    }
}
