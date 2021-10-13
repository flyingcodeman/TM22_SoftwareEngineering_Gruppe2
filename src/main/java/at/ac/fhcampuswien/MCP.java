package at.ac.fhcampuswien;

import at.ac.fhcampuswien.gui.GameLogic;

public class MCP {

    //MAIN
    public static void main(String []args) {
        GameLogic game = new GameLogic();

        game.flowWelcome();
        game.flowInit();
        // Wechseln der Spieler und SPielzüge bis Flotte versenkt/game.gameOver == true
        while(!game.gameOver) {
            game.flowMainSequence(game.player1, game.player2);
            game.flowChangePlayer(game.player1, game.player2);
            game.flowMainSequence(game.player2, game.player1);
            game.flowChangePlayer(game.player2, game.player1);
        }

        //ToDo: Stats ausgeben
        //ToDo: flowGameOver erstellen, Consolenausgabe ausformulieren und Möglichkeiten zum Beenden / Neustart implementieren
        System.out.println("GAME OVER");
    }
}
