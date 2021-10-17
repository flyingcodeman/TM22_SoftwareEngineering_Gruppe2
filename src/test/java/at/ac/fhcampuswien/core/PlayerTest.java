package at.ac.fhcampuswien.core;

import at.ac.fhcampuswien.gui.GameLogic;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {

    @Test
    void printFieldSetTest01() { //TC-40.01
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

    @Test
    void printFieldSetTest0509() { //TC-40.05 // TC-40.09
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Player player1 = new Player("Test1");
        //Player player2 = new Player("Test2");
        player1.setStandardFleet();
        player1.printFieldset();

        String expectedOutNotHitYet = "~";

        assertTrue(outContent.toString().contains(expectedOutNotHitYet));

    }

    @Test
    void printFieldSetTest0208() { //TC-40.02 // TC-40.08
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));


        Player player1 = new Player("Test1");
        Player player2 = new Player("Test2");
        player1.setStandardFleet();
        player2.setStandardFleet();
        Shot shoot = new Shot();
        Coordinate givenShootCoordinate = new Coordinate(0,0);
        givenShootCoordinate.setNewCoordinates('A', 1);
        //result = shoot.shootsAt(givenShootCoordinate, player2, player1);


        player1.printFieldset();

        String expectedOutNotHitYet = "~";

        assertTrue(outContent.toString().contains(expectedOutNotHitYet));

    }

    @Test
    void setShipsofFleetRandom() { //TC-32
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Player player1 = new Player("Test1");
        Player player2 = new Player("Test2");
        player1.setStandardFleet();
        player2.setStandardFleet();

        assertNotEquals(player1.getOwnField().toString(), player2.getOwnField().toString());
    }
}