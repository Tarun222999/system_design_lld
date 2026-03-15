package lldquestions.tittactoe;

import lldquestions.tittactoe.game.Game;
import lldquestions.tittactoe.observer.concrete.InAppNotification;
import lldquestions.tittactoe.observer.iobserver.iobserver;
import lldquestions.tittactoe.player.Player;

public class Main {
    public static void main(String[] args) {
        Game game = new Game(3, 3);
        iobserver inappobserver = new InAppNotification();
        game.addObserver(inappobserver);
        game.addPlayer(new Player("raj", 0));
        game.addPlayer(new Player("shyam", 1));
        game.play();

    }
}
