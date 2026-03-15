package lldquestions.tittactoe.game;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.Scanner;

import lldquestions.tittactoe.board.Board;
import lldquestions.tittactoe.observer.iobserver.iobserver;
import lldquestions.tittactoe.player.Player;
import lldquestions.tittactoe.rules.concrete.BasicStrategy;

public class Game {
    Board board;
    BasicStrategy rules = new BasicStrategy();
    List<iobserver> observers = new ArrayList<iobserver>();
    Deque<Player> players = new ArrayDeque<>();

    public Game(int n, int m) {
        this.board = new Board(n, m);
    }

    public void addObserver(iobserver observer) {
        observers.add(observer);
    }

    public void addPlayer(Player player) {
        players.add(player);
    }

    public void nextTurn() {
        Player current = players.pollFirst();
        players.addLast(current);
    }

    public void play() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            board.display();
            Player current = players.peekFirst();
            System.out.println(current.name + "'s turn (symbol " + current.symbol + ")");
            System.out.print("Enter row and column: ");

            int i = sc.nextInt();
            int j = sc.nextInt();

            // get the input where user want to put can be i,j column for now
            // Validate move
            if (!board.isValid(i, j) || !board.isEmpty(i, j)) {
                System.out.println("Invalid move. Try again.");
                continue;
            }

            board.putSymbol(i, j, current.symbol);

            if (rules.checkwin(board, current.symbol)) {
                board.display();
                for (iobserver obs : observers) {
                    obs.notifyWin(current);
                }
                break;
            }

            if (rules.checkDraw(board)) {
                board.display();
                for (iobserver obs : observers) {
                    obs.notifyDraw();
                }
                break;
            }

            nextTurn();

        }
    }

}
