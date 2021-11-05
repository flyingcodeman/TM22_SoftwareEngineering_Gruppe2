package at.ac.fhcampuswien.core;

import java.util.ArrayList;
import java.util.List;

public class Fleet {
    Ship[] fleet = new Ship[10]; //Flottenarray fleet besteht aus 10 Schiffsobjekten
    boolean fleetSunk = false;

    public void createStandardFleet(Field ownField) {
        // Erstellung und zufälliges Setzen der Standardflotte fleet (1x5, 2x4, 3x3, 2x4)
        fleet[0] = new Ship(5, '5', ownField);
        fleet[1] = new Ship(4, '4', ownField);
        fleet[2] = new Ship(4, '4', ownField);
        fleet[3] = new Ship(3, '3', ownField);
        fleet[4] = new Ship(3, '3', ownField);
        fleet[5] = new Ship(3, '3', ownField);
        fleet[6] = new Ship(2, '2', ownField);
        fleet[7] = new Ship(2, '2', ownField);
        fleet[8] = new Ship(2, '2', ownField);
        fleet[9] = new Ship(2, '2', ownField);
    }

    //ToDo: public void setFleetRandomly(Field field) {}

    public Ship[] getFleet(){return fleet;}

    public boolean checkIfShipSunk(Coordinate shotCoordinate) {
        int shipSunkCounter = 0;

        for (int i = 0; i < 10; i++) { // Iteration über alle Schiffe der Flotte
            for (int j = 0; j < this.fleet[i].ship.length; j++) { // Iteration über alle shipParts des aktuell ausgewählten Schiffs
                int posX = this.fleet[i].ship[j].position.getPositionX();
                int posY = this.fleet[i].ship[j].position.getPositionY();
                if ((posX == shotCoordinate.getPositionX()) && (posY == shotCoordinate.getPositionY())) { // Welches Schiffpart wurde mit der shotCoordinate getroffen?
                    this.fleet[i].ship[j].setHit(); // Getroffenes Schiffpart j im i-ten Schiff der Flotte
                    shipSunkCounter = 0;
                    for (int k = 0; k < this.fleet[i].ship.length; k++) { // Wurde alle Schiffsteile des Schiffs bereits getroffen?
                        if (this.fleet[i].ship[k].getHit()) {
                            shipSunkCounter++;
                        }
                        if (shipSunkCounter == this.fleet[i].ship.length) { // Alle Teile getroffen, Schiff gesunken
                            return true; //Ship sunk
                        }
                    }
                    shipSunkCounter = 0;
                }
            }
        }
        return false; //Ship not sunk
    }

    public boolean checkIfFleetSunk() {
        //überprüft alle Schiffe der Flotte, ob jedes Schiffsteil hit = true
        int fleetSunkCounter = 0;
        for (int i = 0; i < 10; i++) { // Iteration über alle Schiffe der Flotte
            if(this.fleet[i].checkIfSunk()) {
                    fleetSunkCounter++;
            };
        }
        if (fleetSunkCounter == this.fleet.length) {
            return this.fleetSunk = true; // Flotte versenkt
        }
        return this.fleetSunk = false;
    }
}
