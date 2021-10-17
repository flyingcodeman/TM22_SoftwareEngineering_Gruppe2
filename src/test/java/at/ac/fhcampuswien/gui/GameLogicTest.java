package at.ac.fhcampuswien.gui;

import static org.junit.jupiter.api.Assertions.*;

import at.ac.fhcampuswien.core.Field;
import at.ac.fhcampuswien.core.Ship;
import at.ac.fhcampuswien.core.ShipFactory;
import org.apache.commons.io.input.CharSequenceInputStream;
import org.junit.jupiter.api.Test;

import java.awt.*;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.List;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class GameLogicTest {

    public enum gameState { //Zustände des Spiels
        gameOver, gameQuit, gameContinue, gamePlayAgain
    }

    @Test
    void flowGameOver_PlayAgainTest() { //TC-47
        ByteArrayInputStream inputStream = new ByteArrayInputStream("q".getBytes());
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(byteArrayOutputStream);

        GameLogic gameLogic = new GameLogic();
        gameLogic.tmpgameover = 'p';
        GameLogic.gameState currentGameState = gameLogic.flowGameOver();
        //assertEquals(gameState.gamePlayAgain, currentGameState);
        assertEquals(gameState.gamePlayAgain, currentGameState);
        //ToDO!
    }

    @Test
    void printingGameRulesTest() { // TC-57
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        GameLogic gameLogic = new GameLogic();
        gameLogic.printingGameRules();
        String expectedOut = "----------------------------------\n" +
                "\n" +
                "Schiffe versenken - Spielregeln: \n" +
                "\n" +
                "----------------------------------\n" +
                "Each player has 2 playing fields.\n" +
                "The own field indicates the state of the current fleet. \n" +
                "The opponent's field shows the shots the player has taken and whether they were a hit 'X' or a shot into empty space '/'. \n" +
                "Each player must start by placing all the ships at his disposal, or have them placed automatically by the program.\n" +
                "After each shot, independently of the result (hit/no hit), the player is changed.\n" +
                "Since the game is only played on a PC, the player swap must fit before the swap is confirmed, otherwise the opponent will have visibility of the playing field.\n" +
                "The player must enter coordinates for shooting\n" +
                "Horizontal (x) in capital letters and vertical (y) in numbers.\n" +
                "The first player to hit and sink all enemy ships wins the game.\n" +
                "----------------------------------\n" +
                "\n";
        assertEquals(expectedOut, outContent.toString());
    }





}