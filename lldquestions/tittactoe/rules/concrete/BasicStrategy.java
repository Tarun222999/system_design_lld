package lldquestions.tittactoe.rules.concrete;

import lldquestions.tittactoe.board.Board;
import lldquestions.tittactoe.rules.istrategy.IRule;

public class BasicStrategy implements IRule {

    public boolean checkwin(Board b, int symbol) {

        int n = b.n;
        int m = b.m;

        // Check rows
        for (int i = 0; i < n; i++) {
            boolean win = true;
            for (int j = 0; j < m; j++) {
                if (b.getSymbol(i, j) != symbol) {
                    win = false;
                    break;
                }
            }
            if (win)
                return true;
        }

        // Check columns
        for (int j = 0; j < m; j++) {
            boolean win = true;
            for (int i = 0; i < n; i++) {
                if (b.getSymbol(i, j) != symbol) {
                    win = false;
                    break;
                }
            }
            if (win)
                return true;
        }

        // Check main diagonal
        boolean win = true;
        for (int i = 0; i < n; i++) {
            if (b.getSymbol(i, i) != symbol) {
                win = false;
                break;
            }
        }
        if (win)
            return true;

        // Check anti diagonal
        win = true;
        for (int i = 0; i < n; i++) {
            if (b.getSymbol(i, n - i - 1) != symbol) {
                win = false;
                break;
            }
        }

        return win;
    }

    public boolean checkDraw(Board b) {

        for (int i = 0; i < b.n; i++) {
            for (int j = 0; j < b.m; j++) {
                if (b.isEmpty(i, j)) {
                    return false;
                }
            }
        }

        return true;
    }

}
