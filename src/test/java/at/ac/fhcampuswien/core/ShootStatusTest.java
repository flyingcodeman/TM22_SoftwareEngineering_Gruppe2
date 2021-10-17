package at.ac.fhcampuswien.core;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShootStatusTest {

    @Test
    void checkShootOnUsedField() {
        Shot shoot = new Shot();
        Player player1 = new Player('player0ne');
        Player player2 = new Player('playerTwo');
        Coordinate givenShootCoordinate = new Coordinate(0,0);
        Shot.State result;
        player2[1][1] = '~';

        result = shoot.shootsAt(givenShootCoordinate, player1, player2);
        assertEquals(Shot.State.reload, result);
    }
    @Test
    void checkShootOnWater() {
 //       Player player1 = new Player('player0ne');
 //       Player player2 = new Player('playerTwo');
 //       Shot.State result = Shot.State.reload;

    }
}

