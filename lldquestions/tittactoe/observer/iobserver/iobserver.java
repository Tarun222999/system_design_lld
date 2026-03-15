package lldquestions.tittactoe.observer.iobserver;

import lldquestions.tittactoe.player.Player;

public interface iobserver {
    public void notifyUserMove(int i, int j, Player p);

    public void notifyWin(Player p);

    public void notifyDraw();

}