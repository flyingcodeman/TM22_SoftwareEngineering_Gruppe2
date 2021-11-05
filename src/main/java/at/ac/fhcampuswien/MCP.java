package at.ac.fhcampuswien;

import at.ac.fhcampuswien.gui.GameLogic;

public class MCP {

    //MAIN
    public static void main(String []args) {
        GameLogic game = new GameLogic();
        GameLogic.gameState currentGameState = GameLogic.gameState.gameContinue;

        do {
            game.flowWelcome();
            game.flowInit();
            // Wechseln der Spieler und SPielzüge bis Flotte versenkt/game.gameOver == true
            while (currentGameState == GameLogic.gameState.gameContinue) {
                currentGameState = game.flowMainSequence(game.player1, game.player2);
                if(currentGameState == GameLogic.gameState.gameContinue){
                    currentGameState = game.flowMainSequence(game.player2, game.player1);
                }
            }
            var state = game.flowGameOver();
            if (state == GameLogic.gameState.gameQuit){
                currentGameState = GameLogic.gameState.gameQuit;
            }
            else if (state == GameLogic.gameState.gamePlayAgain){
                game = new GameLogic();
                currentGameState = GameLogic.gameState.gameContinue;
            }
        }
        while (currentGameState != GameLogic.gameState.gameQuit);
    }
}
