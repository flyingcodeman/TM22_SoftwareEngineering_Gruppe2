package at.ac.fhcampuswien.core;

import java.util.ArrayList;
import java.util.List;

public class Fleet {
    Ship[] fleet = new Ship[10]; //Flottenarray fleet besteht aus 10 Schiffsobjekten
    List<Ship> fleetNew = new ArrayList<>();
    boolean fleetSunk = false;

    public void createStandardFleet(int size, char[][] ownField) {
        // Erstellung und zufälliges Setzen der Standardflotte fleet (1x5, 2x4, 3x3, 2x4)
        fleet[0] = new Ship(5, '5', ownField);
        fleet[1] = new Ship(4, '4', ownField);
        fleet[2] = new Ship(4, '4', ownField);
        for(int i = 3; i<(size-4); i++){
            fleet[i] = new Ship(3, '3', ownField);
        }
        for(int i = 6; i<size; i++){
            fleet[i] = new Ship(2, '2', ownField);
        }
    }

    public Ship[] getFleet(){return fleet;}

    //public void setFleetRandomly(Field field) {}

    public boolean checkIfShipSunk(Coordinate shotCoordinate) {
        //Überprüft alle Schiffe der Flotte, ob alle Schiffsteile eines Schiffs den Paramter hit = true
        int shipSunkCounter = 0;
        boolean shipSunk = false; //Rückgabewert, ob einzelnes Schiff gesunken (true) oder nicht (false)
        for (int i = 0; i < 10; i++) { // Iteration über alle Schiffe der Flotte
            for (int j = 0; j < this.fleet[i].ship.length; j++) { // Iteration über alle shipParts des aktuell ausgewählten Schiffs
                int x = this.fleet[i].ship[j].position[0].positionX;
                int y = this.fleet[i].ship[j].position[0].positionY;
                if ((x == shotCoordinate.positionX) && (y == shotCoordinate.positionY)) { // Welches Schiffpart wurde mit der shotCoordinate getroffen?
                    this.fleet[i].ship[j].setHit(); // Getroffenes Schiffpart j im i-ten Schiff der Flotte
                    shipSunkCounter = 0;
                    for (int k = 0; k < this.fleet[i].ship.length; k++) { // Wurde alle Schiffsteile des Schiffs bereits getroffen?
                        if (this.fleet[i].ship[k].getHit()) {
                            shipSunkCounter++;
                        }
                        if (shipSunkCounter == this.fleet[i].ship.length) { // Alle Teile getroffen, Schiff gesunken
                            return true;
                        }
                    }
                    shipSunkCounter = 0;
                }
            }
        }
        return false;
    }

    public boolean checkIfFleetSunk() {
        //überprüft alle Schiffe der Flotte, ob jedes Schiffsteil hit = true
        int fleetSunkCounter = 0;
        for (int i = 0; i < 10; i++) { // Iteration über alle Schiffe der Flotte
            if(this.fleet[i].checkIfSunk()) {
                    fleetSunkCounter++;
            };
        }
        if (fleetSunkCounter == this.fleet.length) { // Anzahl der versenkten Schiffe = Anzahl der Schiffe der FLotte
            return this.fleetSunk = true; // Flotte versenkt
        }
        return this.fleetSunk = false;
    }

    public void addShipToFleet(Ship ship) {}

    public void printFleet() {

    }

}
