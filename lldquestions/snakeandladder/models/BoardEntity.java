package lldquestions.snakeandladder.models;

public abstract class BoardEntity {
    private final int start;
    private final int end;

    public BoardEntity(int start, int end) {
        this.end = end;
        this.start = start;
    }

    public int getStart() {
        return start;
    }

    public int getEnd() {
        return end;
    }
}
