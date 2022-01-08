package at.ac.fhcampuswien.core;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FleetTest { // TC-44 // TC-44.010
    @Test
    void checkIfFleetSunkTest() {
        Field field = new Field(10);
        Fleet fleet = new Fleet();
        fleet.createStandardFleet(field);

        //Setzen aller Schiffe auf "sank"
        for (int i = 0; i < 10; i++) { // Iteration über alle Schiffe der Flotte
            for (int j = 0; j < fleet.fleet[i].ship.length; j++) { // Iteration über alle shipParts des aktuell ausgewählten Schiffs
                fleet.fleet[i].ship[j].setHit();
            }
        }
        assertTrue(fleet.checkIfFleetSunk());
    }
}