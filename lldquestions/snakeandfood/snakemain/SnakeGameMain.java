package lldquestions.snakeandfood.snakemain;

import java.util.Scanner;

import lldquestions.snakeandfood.snakegame.SnakeGame;

public class SnakeGameMain {
    public static void main(String[] args) {
        int width = 20;
        int height = 15;

        int[][] foodPositions = {
                { 5, 5 },
                { 10, 8 },
                { 3, 12 },
                { 8, 17 },
                { 12, 3 }
        };

        SnakeGame game = new SnakeGame(width, height, foodPositions);
        System.out.println("===== SNAKE GAME =====");
        System.out.println(
                "Controls: W (Up), S (Down), A (Left), D (Right), Q (Quit)");
        System.out.println("Eat food to grow your snake and increase your score.");
        System.out.println("Don't hit the walls or bite yourself!");
        System.out.println("=======================");

        Scanner scanner = new Scanner(System.in);
        boolean gameRunning = true;
        int score = 0;

        while (gameRunning) {
            System.out.print("Enter move (W/A/S/D) or Q to quit: ");
            String input = scanner.nextLine().toUpperCase();

            if (input.equals("Q")) {
                System.out.println("Game ended by player. Final score: " + score);
                gameRunning = false;
                continue;

            }

            String direction = input;

            if (direction.isEmpty()) {
                System.out.println("Invalid input! Use W/A/S/D to move or Q to quit.");
                continue;
            }

            score = game.move(direction);

            if (score == -1) {
                System.out.println("GAME OVER! You hit a wall or bit yourself.");
                System.out.println("Final score: " + (game.snake.size() - 1));
                gameRunning = false;
            } else {
                System.out.println("Score: " + score);
            }
        }

        scanner.close();
        System.out.println("Thanks for playing");
    }
}
