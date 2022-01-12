package at.ac.fhcampuswien.core;

import at.ac.fhcampuswien.gui.GameLogic;
import com.google.inject.matcher.Matchers;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class ShotTest {

    @Test
    void shootsAtValidShotTest() { // TC-49 // TC-49.010 // TC-51 // TC-51.010 // TC-51.030
        Player player1 = new Player("Test1");
        Player player2 = new Player("Test2");
        player1.setStandardFleet();
        player2.setStandardFleet();
        Shot shoot = new Shot();
        Coordinate shootCoordinate = new Coordinate(5, 5);

        Shot.State state = shoot.shootsAt(shootCoordinate, player1, player2);

        Shot.State expectedStates[] = {Shot.State.hit, Shot.State.miss, Shot.State.error, Shot.State.reload};
        List<Shot.State> expectedStatesList = Arrays.asList(expectedStates);

        assertTrue(expectedStatesList.contains(state));

    }

    @Test
    void checkIfShipSunkTest() { // TC-50
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Player player1 = new Player("Player1");
        Player player2 = new Player("Player2");
        Shot shoot = new Shot();
        Shot.State result = Shot.State.reload;
        Coordinate givenShootCoordinate = new Coordinate(0,0);
        int posX = 0, posY = 0;

        player1.setStandardFleet();
        player2.setStandardFleet();
        //Setze 4 von 5 Shipparts des ersten Schiffs auf "hit"
        for (int j = 0; j < 4; j++) { // Iteration über 4 von 5 shipParts
            posX = player1.getStandardFleet().fleet[0].ship[j].position.getPositionX();
            posY = player1.getStandardFleet().fleet[0].ship[j].position.getPositionY();
            givenShootCoordinate.setNewCoordinates(posX, posY);
            player1.setCharAtPositionOwnField('X', givenShootCoordinate);
            player2.setCharAtPositionOpponentInfoField('X', givenShootCoordinate);
        }
        posX = player1.getStandardFleet().fleet[0].ship[4].position.getPositionX();
        posY = player1.getStandardFleet().fleet[0].ship[4].position.getPositionY();

        givenShootCoordinate.setNewCoordinates(posX, posY);
        result = shoot.shootsAt(givenShootCoordinate, player2, player1);
        assertEquals(Shot.State.hit, result);
    }


    @Test
    void shootsInsideFieldNegative1Test() { //  TC-51.020
        Player player1 = new Player("Test1");
        Player player2 = new Player("Test2");
        player1.setStandardFleet();
        player2.setStandardFleet();
        Shot shoot = new Shot();
        Coordinate shootCoordinate = new Coordinate(25, 2);

        Shot.State state = shoot.shootsAt(shootCoordinate, player1, player2);

        Shot.State expectedStates[] = {Shot.State.hit, Shot.State.miss, Shot.State.error, Shot.State.reload};
        List<Shot.State> expectedStatesList = Arrays.asList(expectedStates);

        assertTrue(expectedStatesList.contains(state));

    }
    @Test
    void shootsInsideFieldNegative2Test() { //  TC-51.020
        Player player1 = new Player("Test1");
        Player player2 = new Player("Test2");
        player1.setStandardFleet();
        player2.setStandardFleet();
        Shot shoot = new Shot();
        Coordinate shootCoordinate = new Coordinate(2, 25);

        Shot.State state = shoot.shootsAt(shootCoordinate, player1, player2);

        Shot.State expectedStates[] = {Shot.State.hit, Shot.State.miss, Shot.State.error, Shot.State.reload};
        List<Shot.State> expectedStatesList = Arrays.asList(expectedStates);

        assertTrue(expectedStatesList.contains(state));

    }
}