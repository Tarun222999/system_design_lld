package lldquestions.tittactoe.rules.istrategy;

import lldquestions.tittactoe.board.Board;

public interface IRule {
    public boolean checkwin(Board b, int symbol);

    public boolean checkDraw(Board b);
}
