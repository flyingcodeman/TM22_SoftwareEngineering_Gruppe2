package at.ac.fhcampuswien.core;

import java.util.Random;

public class Ship {

    ShipPart[] ship; // Schiffsarray, bestehend aus Schiffsteile-Objekten
    private boolean sunk = false;

    private int positionX = 0; // Aktuelle x-Koordinate des ausgewählten Schiffs
    private int positionY = 0; // Aktuelle y-Koordinate des ausgewählten Schiffs
    private int direction = 0; // Setz-Richtung des Schiffs - Vertikal = 0, Horizontal = 1
    private boolean posClean = false; // Variable zum Speichern, ob die gewählte Stelle zum Setzen des Schiffs frei ist
    private int posCleanCounter = 0;
    private int fieldSize = 0; // Speichert die zuvor festgelegte Größe des Spielfelds

    public Ship(int shipSize, char shipLabel, Field ownField){
        fieldSize = ownField.getField().length;
        if(shipSize <= fieldSize){
            ship = new ShipPart[shipSize];
            setShip(ship, shipSize, 1, shipLabel, ownField.getField(), 0);
        }else{
            throw new IllegalArgumentException("Ship too big for Playfield!");
        }

    }
    public Ship(int shipSize, char shipLabel, char[][] ownField){
        fieldSize = ownField.length;
        ship = new ShipPart[shipSize];
        setShip(ship, shipSize, 1, shipLabel, ownField, 0);
    }

    // ToDo: Erweiterung und Implementierung dieser Methode
    public void setSunk(){sunk = true;}

    public boolean checkIfSunk() {
        //überprüft alle Schiffsteile des Schiffs, ob hit = true or false
        //Wenn alle Teile true: Schiff gesunken
        int hitCounter = 0;
        for(int i = 0; i < this.ship.length; i++) {
            if(this.ship[0].getHit()){
                hitCounter ++;
            }
        }
        // Wenn hitCounter-variable gleich der Länge des Schiffs: Schiff gesunken
        if(hitCounter == this.ship.length){
            this.sunk = true;
        }
        else{
            this.sunk = false;
        }
        return this.sunk;
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

    // Plazierung des Schiffs mit entsprechenden Übergabeparamtern im Feld
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

    //Erstellung zufälliger Varibalen wie Position, direction, etc
    // Wenn zu setztende Position des Schiffs nicht frei ist: Neue zufällige Position und Rücksetzen aller Counter
    private void setRandomPosition(){
        Random rand = new Random(); // Zufallsfunktion
        positionX = rand.nextInt(fieldSize);
        positionY = rand.nextInt(fieldSize);
        direction = rand.nextInt(2);
        posClean = false;
        posCleanCounter = 0;
    }

}
