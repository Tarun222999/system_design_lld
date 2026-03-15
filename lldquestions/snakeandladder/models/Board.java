package lldquestions.snakeandladder.models;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Board {
    private final int size;
    private final Map<Integer, Integer> snakeAndLadders;

    public Board(int size, List<BoardEntity> entities) {
        this.size = size;
        this.snakeAndLadders = new HashMap<>();

        for (BoardEntity entity : entities) {
            snakeAndLadders.put(entity.getStart(), entity.getEnd());
        }
    }

    public int getSize() {
        return size;
    }

    public int getFinalPosition(int position) {
        return snakeAndLadders.getOrDefault(position, position);
    }

}
