package at.ac.fhcampuswien.gui;

import static org.junit.jupiter.api.Assertions.*;

import at.ac.fhcampuswien.core.Player;
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
                "Schiffe versenken - Game rules: \n" +
                "\n" +
                "----------------------------------\n" +
                "- Each player has 2 playing fields.\n" +
                "- The own field shows the location of your own ships and their status (not hit, hit, sunk)\n" +
                "  - '0' means 'Own, unhit ship'\n" +
                "  - 'X' means 'Ship hit'\n" +
                "  - '#' means 'Ship sunk'\n" +
                "  - '~' means 'Empty Field (own Field)'\n" +
                "\n" +
                "- The opponent's field shows the shots the player has taken and whether they were a hit or a shot into empty space. \n" +
                "  - 'X' means 'Ship hit'\n" +
                "  - '#' means 'Ship sunk'\n" +
                "  - '/' means 'Shot hit water'\n" +
                "  - '~' means 'Field content still unknown'\n" +
                "\n" +
                "- Each player must start by placing all the ships at their disposal, or have them placed automatically by the game. \n" +
                "- After each shot, independently of the result (hit/no hit), the player is changed. \n" +
                "- Since the game is only played on a PC, the player must swap it with the other player before confirming the swap. Otherwise the opponent will see the opponents fields.\n" +
                "- The player must enter coordinates for shooting\n" +
                "- Horizontal (x-axis) in capital letters and vertical (y-axis) in numbers.\n" +
                "- The first player to hit and sink all enemy ships wins the game.\n" +
                "----------------------------------\n" +
                "\n";
        assertEquals(expectedOut, outContent.toString());
    }

    @Test
    void printingGameRulesInitTest() { // TC-56 // TC-56.010
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
                "Schiffe versenken - Game rules: \n" +
                "\n" +
                "----------------------------------\n" +
                "- Each player has 2 playing fields.\n" +
                "- The own field shows the location of your own ships and their status (not hit, hit, sunk)\n" +
                "  - '0' means 'Own, unhit ship'\n" +
                "  - 'X' means 'Ship hit'\n" +
                "  - '#' means 'Ship sunk'\n" +
                "  - '~' means 'Empty Field (own Field)'\n" +
                "\n" +
                "- The opponent's field shows the shots the player has taken and whether they were a hit or a shot into empty space. \n" +
                "  - 'X' means 'Ship hit'\n" +
                "  - '#' means 'Ship sunk'\n" +
                "  - '/' means 'Shot hit water'\n" +
                "  - '~' means 'Field content still unknown'\n" +
                "\n" +
                "- Each player must start by placing all the ships at their disposal, or have them placed automatically by the game. \n" +
                "- After each shot, independently of the result (hit/no hit), the player is changed. \n" +
                "- Since the game is only played on a PC, the player must swap it with the other player before confirming the swap. Otherwise the opponent will see the opponents fields.\n" +
                "- The player must enter coordinates for shooting\n" +
                "- Horizontal (x-axis) in capital letters and vertical (y-axis) in numbers.\n" +
                "- The first player to hit and sink all enemy ships wins the game.\n" +
                "----------------------------------\n" +
                "\n";
        assertEquals(expectedOut, outContent.toString());
    }

    @Test
    void flowChangePlayerTest(){ //TC-52 // ?????
        ByteArrayInputStream in = new ByteArrayInputStream("y".getBytes());
        System.setIn(in);
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        Player player1 = new Player("Test1");
        Player player2 = new Player("Test2");

        GameLogic gameLogic = new GameLogic();
        GameLogic.gameState state;
        state = gameLogic.flowChangePlayer(player1, player2);

        String expectedOut = ">\n" +
                ">\n" +
                ">\n" +
                ">\n" +
                ">\n" +
                ">\n" +
                ">\n" +
                ">\n" +
                ">\n" +
                ">\n" +
                "Test1 - Your turn is over. It's Test2s turn.\n" +
                "Test2 ready? (y)es/(q)uit game/(r)ules of the game\n";

        assertEquals(expectedOut, outContent.toString());
        assertEquals(state, GameLogic.gameState.gameContinue);

    }

    @Test
    void flowGameOverTest(){ //TC-45 // TC-45.010
        ByteArrayInputStream in = new ByteArrayInputStream("q".getBytes());
        System.setIn(in);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        GameLogic gameLogic = new GameLogic();
        GameLogic.gameState state;
        state = gameLogic.flowGameOver();

        String expectedOut = "Game Over...\n" +
                "(p)lay again , or (q)uit program?\n" +
                "Thanks for playing ... Please come back soon!\n";

        assertEquals(expectedOut, outContent.toString());
        assertEquals(state, GameLogic.gameState.gameQuit);

    }

    @Test
    void flowGameQuitTest() { // TC-59 // TC-59.010 // TC-59.020
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

    @Test
    void flowGamePlayAgainTest() { // TC-47 // TC-47.010 // TC-47.020
        InputStream sysInBackup = System.in; // backup System.in to restore it later
        ByteArrayInputStream in = new ByteArrayInputStream("p".getBytes());
        System.setIn(in);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        GameLogic gameLogic = new GameLogic();
        GameLogic.gameState state;
        state = gameLogic.flowGameOver();

        String expectedOut = "Game Over...\n" +
                "(p)lay again , or (q)uit program?\n" +
                "Your choice p\n";

        assertEquals(expectedOut, outContent.toString());
        assertEquals(state, GameLogic.gameState.gamePlayAgain);
    }

}