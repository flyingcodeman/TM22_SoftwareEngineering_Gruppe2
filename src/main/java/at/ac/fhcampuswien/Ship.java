package at.ac.fhcampuswien;

public class Ship {
    private int size;
    //private ShipfieldArray parts;
    private boolean sunk = false;

    //private boolean checkIfSunk() {
    //überprüft alle Shipfield.hit ob true o false
    // -> wenn alle true
    // -> set sunk=true
    //}

    private void consistsOf (Shipfield shipfield) {
        // adds Shipfields to ship
        // ruft isPartof(Ship) auf
    }

    private void isPartOf (Fleet fleet) {
        // ruft addShipToFleet auf
        // Hier muss überprüft werden ob ship mit flotte kompatibel ist (ob nicht andere schiffe im Weg stehen)
        // fügt Schiff zur Flotte hinzu

    }
}
