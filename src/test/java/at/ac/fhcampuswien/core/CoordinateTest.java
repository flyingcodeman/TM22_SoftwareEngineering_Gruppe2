package at.ac.fhcampuswien.core;

import org.junit.jupiter.api.Test;

import javax.lang.model.type.NullType;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CoordinateTest {

    @Test
    void translationAToZero() {
       char tempShootX = 'A';
       int shootX = 2;
       Coordinate testingShoot = new Coordinate(0,0);
       shootX = testingShoot.translateInput(tempShootX);
       assertEquals(0, shootX);
    }

    @Test
    void translationAToOne() {
        char tempShootX = 'B';
        int shootX = 2;
        Coordinate testingShoot = new Coordinate(0,0);
        shootX = testingShoot.translateInput(tempShootX);
        assertEquals(1, shootX);
    }

    @Test
    void translationAToTwo() {
        char tempShootX = 'C';
        int shootX = 0;
        Coordinate testingShoot = new Coordinate(0,0);
        shootX = testingShoot.translateInput(tempShootX);
        assertEquals(2, shootX);
    }

    @Test
    void translationAToThree() {
        char tempShootX = 'D';
        int shootX = 0;
        Coordinate testingShoot = new Coordinate(0,0);
        shootX = testingShoot.translateInput(tempShootX);
        assertEquals(3, shootX);
    }
    @Test
    void translationAToFour() {
        char tempShootX = 'E';
        int shootX = 0;
        Coordinate testingShoot = new Coordinate(0,0);
        shootX = testingShoot.translateInput(tempShootX);
        assertEquals(4, shootX);
    }
    @Test
    void translationAToFive() {
        char tempShootX = 'F';
        int shootX = 0;
        Coordinate testingShoot = new Coordinate(0,0);
        shootX = testingShoot.translateInput(tempShootX);
        assertEquals(5, shootX);
    }
    @Test
    void translationAToSix() {
        char tempShootX = 'G';
        int shootX = 0;
        Coordinate testingShoot = new Coordinate(0,0);
        shootX = testingShoot.translateInput(tempShootX);
        assertEquals(6, shootX);
    }
    @Test
    void translationAToSeven() {
        char tempShootX = 'H';
        int shootX = 0;
        Coordinate testingShoot = new Coordinate(0,0);
        shootX = testingShoot.translateInput(tempShootX);
        assertEquals(7, shootX);
    }
    @Test
    void translationAToEight() {
        char tempShootX = 'I';
        int shootX = 0;
        Coordinate testingShoot = new Coordinate(0,0);
        shootX = testingShoot.translateInput(tempShootX);
        assertEquals(8, shootX);
    }
    @Test
    void translationAToNine() {
        char tempShootX = 'J';
        int shootX = 0;
        Coordinate testingShoot = new Coordinate(0,0);
        shootX = testingShoot.translateInput(tempShootX);
        assertEquals(9, shootX);
    }
    @Test
    void translationAToTen() {
        assertThrows(IllegalArgumentException.class, () -> {
            char tempShootX = 'K';
            int shootX = 0;
            Coordinate testingShoot = new Coordinate(0, 0);
            shootX = testingShoot.translateInput(tempShootX);
        });
    }
}