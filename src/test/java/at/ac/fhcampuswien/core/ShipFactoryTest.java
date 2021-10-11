package at.ac.fhcampuswien.core;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ShipFactoryTest {


    @Test
    void generateShip_createOneShipSizeOne() {
        Field field = new Field(10);
        List<Ship> ships = ShipFactory.generateShip(1, field, 1);
        assertEquals(1, ships.size());
        assertEquals(1, ships.get(0).ship.length);
    }

    @Test
    void generateShip_createTwoShipSizeOne() {
        Field field = new Field(10);
        List<Ship> ships = ShipFactory.generateShip(1, field, 2);
        assertEquals(2, ships.size());
    }

    @Test
    void generateShip_createThreeShipSizeOne() {
        Field field = new Field(10);
        List<Ship> ships = ShipFactory.generateShip(1, field, 3);
        assertEquals(3, ships.size());
    }

    @Test
    void generateShip_createFourShipSizeOne() {
        Field field = new Field(10);
        List<Ship> ships = ShipFactory.generateShip(1, field, 4);
        assertEquals(4, ships.size());
    }

    @Test
    void generateShip_createOneShipSizeTwo() {
        Field field = new Field(10);
        List<Ship> ships = ShipFactory.generateShip(2, field, 1);
        assertEquals(1, ships.size());
        assertEquals(2, ships.get(0).ship.length);
    }
}