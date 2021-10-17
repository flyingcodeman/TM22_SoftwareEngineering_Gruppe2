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

    @Test
    void printingGameRulesInitTest() { // TC-56
        InputStream sysInBackup = System.in; // backup System.in to restore it later
        ByteArrayInputStream in = new ByteArrayInputStream("E".getBytes());
        System.setIn(in);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        GameLogic gameLogic = new GameLogic();
        gameLogic.flowWelcome();

        String expectedOut = "Select language: (E)nglish (G)erman (D)^2\n" +
                "The game is loading...\n" +
                "----------------------------------\n" +
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

    @Test
    void flowGameQuitTest() { // TC-59
        InputStream sysInBackup = System.in; // backup System.in to restore it later
        ByteArrayInputStream in = new ByteArrayInputStream("q".getBytes());
        System.setIn(in);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        GameLogic gameLogic = new GameLogic();
        GameLogic.gameState state;
        state = gameLogic.flowDialog("changePlayer");

        String expectedOut = "Quit game successfully!\n";

        assertEquals(expectedOut, outContent.toString());
        assertEquals(state, GameLogic.gameState.gameQuit);
    }

}