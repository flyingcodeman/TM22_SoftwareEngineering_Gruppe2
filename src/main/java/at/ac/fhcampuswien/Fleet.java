package at.ac.fhcampuswien;

public class Fleet {
    Ship[] fleet = new Ship[10];
    boolean fleetSunk = false;

    public void createStandardFleet(int size, char[][] ownField) {
        fleet[0] = new Ship(5, '5', ownField);
        fleet[1] = new Ship(4, '4', ownField);
        fleet[2] = new Ship(4, '4', ownField);
        for(int i = 3; i<(size-4); i++){
            fleet[i] = new Ship(3, '3', ownField);
        }
        for(int i = 6; i<size; i++){
            fleet[i] = new Ship(2, '2', ownField);
        }
        //Fill fleet array with ships

    }

    public Ship[] getFleet(){return fleet;}

    //public void setFleetRandomly(Field field) {}

    public boolean checkIfShipSunk(Coordinate shotCoordinate) {
        //überprüft alle Schiffe der Flotte
        int shipsize = 5;
        int shipSunkCounter = 0;
        boolean shipSunk = false;
        for (int i = 0; i < 10; i++) { // Iteration über alle Schiffe der Flotte
            shipSunkCounter = 0;
            for (int j = 0; j < this.fleet[i].ship.length; j++) { // Iteration über alle shipParts des aktuellen Schiffs
                int x = this.fleet[i].ship[j].position[0].positionX;
                int y = this.fleet[i].ship[j].position[0].positionY;
                if ((x == shotCoordinate.positionX) && (y == shotCoordinate.positionY)) {
                    this.fleet[i].ship[j].setHit();
                    for (int k = 0; k < this.fleet[i].ship.length; k++) {
                        if (this.fleet[i].ship[k].getHit()) {
                            shipSunkCounter++;
                        }
                        if (shipSunkCounter == this.fleet[i].ship.length) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public boolean checkIfFleetSunk() {
        //überprüft alle Schiffe der Flotte
        int fleetSunkCounter = 0;
        for (int i = 0; i < 10; i++) { // Iteration über alle Schiffe der Flotte
            if(this.fleet[i].checkIfSunk()) {
                    fleetSunkCounter++;
            };
        }
        if (fleetSunkCounter == this.fleet.length) {
            this.fleetSunk = true;
        }
        return this.fleetSunk;
    }

    public void addShipToFleet(Ship ship) {}

    public void printFleet() {

    }

}
