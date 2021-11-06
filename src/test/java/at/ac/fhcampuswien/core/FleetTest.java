package at.ac.fhcampuswien.core;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FleetTest {
    @Test
    void checkIfFleetSunkTest() {
        Field field = new Field(10);
        Fleet fleet = new Fleet();
        fleet.createStandardFleet(field);

        //Setzen alles Schiffe auf "sank"
        for (int i = 0; i < 10; i++) { // Iteration über alle Schiffe der Flotte
            for (int j = 0; j < fleet.fleet[i].ship.length; j++) { // Iteration über alle shipParts des aktuell ausgewählten Schiffs
                fleet.fleet[i].ship[j].setHit();
            }
        }
        assertTrue(fleet.checkIfFleetSunk());
    }
}