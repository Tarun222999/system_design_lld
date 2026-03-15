package lldquestions.snakeandfood.snakegame;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

import lldquestions.snakeandfood.board.GameBoard;
import lldquestions.snakeandfood.food.Food;
import lldquestions.snakeandfood.movementstrategy.MoveMentStrategy;
import lldquestions.snakeandfood.movementstrategy.humanmovement.HumanMovementStrategy;
import lldquestions.snakeandfood.pair.Pair;
import lldquestions.snakeandfood.snake.Snake;

public class SnakeGame {
    // we have to use snake and foodItem food
    // private Snake snake;
    // private Food food;

    private GameBoard board;
    public Deque<Pair> snake;
    private Map<Pair, Boolean> snakeMap;
    private int score;
    private int[][] food;
    private int foodIndex;
    private MoveMentStrategy moveMentStrategy;

    // init game

    public SnakeGame(int width, int height, int[][] food) {
        this.board = GameBoard.getInstance(width, height);
        this.food = food;
        this.foodIndex = 0;

        this.snake = new LinkedList<>();
        this.snakeMap = new HashMap<>();
        Pair initialPos = new Pair(width, height);
        this.snake.offerFirst(initialPos);
        this.snakeMap.put(initialPos, true);

        this.moveMentStrategy = new HumanMovementStrategy();
    }

    public void setMovementStrategy(MoveMentStrategy strategy) {
        this.moveMentStrategy = strategy;
    }

    public int move(String direction) {
        Pair currentHead = this.snake.peekFirst();

        // get next
        Pair newHead = this.moveMentStrategy.getNextPosition(currentHead, direction);

        int newHeadRow = newHead.getRow();
        int newHeadCol = newHead.getCol();

        boolean crossesBoundary = newHeadRow < 0 || newHeadRow >= this.board.getHeight() ||
                newHeadCol < 0 || newHeadCol >= this.board.getWidth();

        Pair currentTail = this.snake.peekLast();

        boolean bitesItself = this.snakeMap.containsKey(newHead) &&
                !(newHead.getRow() == currentTail.getRow()) &&
                !(newHead.getCol() == currentHead.getCol());

        if (crossesBoundary || bitesItself) {
            return -1;
        }

        boolean ateFood = (this.foodIndex < this.food.length) &&
                (this.food[this.foodIndex][0] == newHeadRow) &&
                (this.food[this.foodIndex][1] == newHeadCol);

        if (ateFood) {
            this.foodIndex++;
        } else {
            this.snake.pollLast();
            this.snakeMap.remove(currentTail);
        }

        this.snake.add(newHead);
        this.snakeMap.put(newHead, true);

        int score = this.snake.size() - 1;
        return score;
    }

}
