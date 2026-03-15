package lldquestions.snakeandladder.models;

public class Snake extends BoardEntity {
    public Snake(int start, int end) {
        super(start, end);
        if (start >= end) {
            throw new IllegalArgumentException("Ladder bottom must be at a lower position than its top.");
        }
    }
}
