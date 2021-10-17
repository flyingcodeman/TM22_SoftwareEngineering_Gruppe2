package at.ac.fhcampuswien.core;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {

    @Test
    void printFieldSetTest() { //TC-40.01
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Player player1 = new Player("Test1");
        //Player player2 = new Player("Test2");
        player1.setStandardFleet();
        player1.printFieldset();

        String expectedOutAxis = "A B C D E F G H I J";
        String expectedOutShip2 = "2 2";
        String expectedOutShip3 = "3 3 3";
        String expectedOutWater = "~";


        assertTrue(outContent.toString().contains(expectedOutAxis));
        assertTrue(outContent.toString().contains(expectedOutShip2));
        assertTrue(outContent.toString().contains(expectedOutShip3));
        assertTrue(outContent.toString().contains(expectedOutWater));
    }
}