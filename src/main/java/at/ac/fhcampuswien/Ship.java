package at.ac.fhcampuswien;

import java.util.Random;

public class Ship {

    ShipPart[] ship;
    private int size;
    private boolean sunk = false;
    //private ShipfieldArray parts;

    private int positionX = 0; // current x-coordinate of the choosen ship
    private int positionY = 0; // current y-coordinate of the choosen ship
    private int direction = 0; // direction to set the ship - Vertical = 0, Horizontal = 1
    private boolean posClean = false;
    private int posCleanCounter = 0;
    private int fieldSize = 0; // User given field size - Set in setShips


    public Ship(int shipSize, char shipLabel, char[][] ownField){
        fieldSize = ownField.length;
        ship = new ShipPart[shipSize];
        setShip(ship, shipSize, 1, shipLabel, ownField, 0);
    }

    private boolean checkIfSunk() {
    //überprüft alle Shipfield.hit ob true o false
    // -> wenn alle true
    // -> set sunk=true
    return this.sunk;
    }

    private void consistsOf (ShipPart shippart) {
        // adds Shipfields to ship
        // ruft isPartof(Ship) auf
    }

    private void isPartOf (Fleet fleet) {
        // ruft addShipToFleet auf
        // Hier muss überprüft werden ob ship mit flotte kompatibel ist (ob nicht andere schiffe im Weg stehen)
        // fügt Schiff zur Flotte hinzu

    }

    // Checks if the position for the ship to be set is free - horizontal or vertical
    // In case of no: New random position
    private void checkCleanPosition(char[][] field, int shipSize, int tmpDirection){
        Random rand = new Random();

        // Horizontal case & positionX
        while((!posClean) & (tmpDirection == 0)){
            while((positionX + (shipSize - 1)) > 9){
                positionX = rand.nextInt(fieldSize);
            }

            // Position ok, check if there is another ship
            for (int j = positionX; j < (positionX + shipSize); j++) {
                if (field[j][positionY] == '~') {
                    posCleanCounter++;
                }
            }

            // Full ship length in horizontal direction is available on this position
            if (posCleanCounter == shipSize){
                posClean = true;
            }else{
                posClean = false;
                posCleanCounter = 0;
                positionX = rand.nextInt(fieldSize);
            }
        }

        // Vertical case & positionY
        while((!posClean) & (tmpDirection == 1)){
            while ((positionY + (shipSize - 1)) > 9){
                positionY = rand.nextInt(fieldSize);
            }

            // Position ok, check if there is another ship
            for (int j = positionY; j < (positionY + shipSize); j++) {
                if (field[positionX][j] == '~') {
                    posCleanCounter++;
                }
            }

            // Full ship length in vertical direction is available on this position
            if (posCleanCounter == shipSize){
                posClean = true;
            }else{
                posClean = false;
                posCleanCounter = 0;
                positionX = rand.nextInt(fieldSize);
            }
        }
    }

    // Place one ship with given parameters
    private void setShip(ShipPart[] ship, int shipSize, int amount, char shipLabel, char[][] field, int playMode){

        // Random mode
        if(playMode == 0) {
            int x = 0;

            // Set given amount of ships
            while(x < amount) {
                setRandomPosition();
                if (direction == 0) {
                    checkCleanPosition(field, shipSize, direction);
                    for (int i = 0; i < shipSize; i++) {
                        //Vertical placement
                        field[positionX][positionY] = shipLabel;
                        ship[i] = new ShipPart(positionY, positionX);
                        positionX++;
                    }
                } else if (direction == 1) {
                    checkCleanPosition(field, shipSize, direction);
                    for (int i = 0; i < shipSize; i++) {
                        //Horizontal placement
                        field[positionX][positionY] = shipLabel;
                        ship[i] = new ShipPart(positionY, positionX);
                        positionY++;
                    }
                }
                x++;
            }
        }
        // Manual mode
        //if(playMode == 1) {}
    }

    public void placeShips(){}

    // Create random coordinates and direction
    private void setRandomPosition(){
        Random rand = new Random();
        positionX = rand.nextInt(fieldSize);
        positionY = rand.nextInt(fieldSize);
        direction = rand.nextInt(2);
        posClean = false;
        posCleanCounter = 0;
    }

}
