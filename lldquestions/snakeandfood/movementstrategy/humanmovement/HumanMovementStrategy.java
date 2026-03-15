package lldquestions.snakeandfood.movementstrategy.humanmovement;

import lldquestions.snakeandfood.movementstrategy.MoveMentStrategy;
import lldquestions.snakeandfood.pair.Pair;

public class HumanMovementStrategy implements MoveMentStrategy {

    public Pair getNextPosition(Pair currentHead, String direction) {
        int col = currentHead.getCol();
        int row = currentHead.getRow();

        switch (direction) {
            case "U":
                return new Pair(row - 1, col);
            case "D":
                return new Pair(row + 1, col);

            case "R":
                return new Pair(row, col + 1);

            case "L":
                return new Pair(row, col - 1);

            default:
                return currentHead;
        }
    }
}
