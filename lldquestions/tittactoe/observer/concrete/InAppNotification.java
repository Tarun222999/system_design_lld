package lldquestions.tittactoe.observer.concrete;

import lldquestions.tittactoe.observer.iobserver.iobserver;
import lldquestions.tittactoe.player.Player;

public class InAppNotification implements iobserver {
    public void notifyUserMove(int i, int j, Player p) {
        System.out.println(p.name + "put" + i + " " + j);
    }

    public void notifyWin(Player p) {
        System.out.println("Player Wins:" + p.name);
    }

    public void notifyDraw() {
        System.out.println("Draw Match");
    }
}
