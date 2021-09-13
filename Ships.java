import java.util.Random;

public class Ships {
    private int positionX = 0; // current x-coordinate of the choosen ship
    private int positionY = 0; // current y-coordinate of the choosen ship
    private int direction = 0; // direction to set the ship - Vertical = 0, Horizontal = 1
    private boolean posClean = false;
    private int posCleanCounter = 0;
    private int fieldSize = 0; // User given field size - Set in setShips


    // Checks if the position for the ship to be set is free - horizontal or vertical
    // In case of no: New random position
    private void checkCleanPosition(int[][] field, int shipSize, int tmpDirection){
        Random rand = new Random();

        // Horizontal case & positionX
        while((!posClean) & (tmpDirection == 0)){
            while((positionX + (shipSize - 1)) > 9){
                positionX = rand.nextInt(fieldSize);
            }

            // Position ok, check if there is another ship
            for (int j = positionX; j < (positionX + shipSize); j++) {
                if (field[j][positionY] == 0) {
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
                if (field[positionX][j] == 0) {
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

    // Place ship with given parameters
    private void setShip(int shipSize, int amount, int shipLabel, int[][] field, int direction, int playMode){

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
                        positionX++;
                    }
                } else if (direction == 1) {
                    checkCleanPosition(field, shipSize, direction);
                    for (int i = 0; i < shipSize; i++) {
                        //Horizontal placement
                        field[positionX][positionY] = shipLabel;
                        positionY++;
                    }
                }
                x++;
            }
        }
        // Manual mode
        //if(playMode == 1) {}
    }

    // Create random coordinates and direction
    private void setRandomPosition(){
        Random rand = new Random();
        positionX = rand.nextInt(fieldSize);
        positionY = rand.nextInt(fieldSize);
        direction = rand.nextInt(2);
        posClean = false;
        posCleanCounter = 0;
    }

    public void setShipsRandom(int[][] field){
        fieldSize = field.length;

        // Place 1 Schlachtschiff (5 Kästchen)
        setShip(5, 1,5, field, direction, 0);

        // Place 2 Kreuzer (je 4 Kästchen)
        setShip(4, 2, 4, field, direction, 0);

        // Place 3 Zerstörer (je 3 Kästchen)
        setShip(3, 3, 3, field, direction, 0);

        // Place 4 U-Boote (je 2 Kästchen)
        setShip(2, 4, 2, field, direction, 0);

    }
}




