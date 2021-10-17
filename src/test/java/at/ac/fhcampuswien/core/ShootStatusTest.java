package at.ac.fhcampuswien.core;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShootStatusTest {

    @Test
    void checkShootOnUsedField() {
        Shot shootAt = new Shot();
        Coordinate givenShootCoordinate = new Coordinate(0,0);
        Shot.State result = Shot.State.reload;
        assertEquals(Shot.State.reload, result);
    }
    @Test
    void checkShootOnWater() {
 //       Player player1 = new Player('player0ne');
 //       Player player2 = new Player('playerTwo');
 //       Shot.State result = Shot.State.reload;

    }
}

