import java.util.Random;

public class Ships {
    private int positionX = 0;
    private int positionY = 0;
    private int direction = 0;
    private boolean posClean = false;
    private int posCleanCounter = 0;
    private int pitchSize = 0;


    public void checkCleanPosition(int[][] pitch, int shipSize, int tmpDirection){
        Random rand = new Random();
        while((!posClean) & (tmpDirection == 0)){ // Horizontal & positionX
            while((positionX + 4) > 9){
                positionX = rand.nextInt(pitchSize);
            }
            // Position ok, check if there is another ship
            System.out.println("xPos: " + positionX + " yPos: " + positionY + " shipSize: " + shipSize);
            for (int j = positionX; j < (positionX + shipSize); j++) {
                if (pitch[j][positionY] == 0) {
                    posCleanCounter++;
                }
            }

            if (posCleanCounter == shipSize){
                posClean = true;
            }else{
                posClean = false;
                posCleanCounter = 0;
                positionX = rand.nextInt(pitchSize);
            }
        }
        while((!posClean) & (tmpDirection == 1)){ // Vertical & positionY
            while ((positionY + 4) > 9){
                positionY = rand.nextInt(pitchSize);
            }
            // Position ok, check if there is another ship
            System.out.println("xPos: " + positionX + " yPos: " + positionY + " shipSize: " + shipSize);
            for (int j = positionY; j < (positionY + shipSize); j++) {
                if (pitch[positionX][j] == 0) {
                    posCleanCounter++;
                }
            }

            if (posCleanCounter == shipSize){
                posClean = true;
            }else{
                posClean = false;
                posCleanCounter = 0;
                positionX = rand.nextInt(pitchSize);
            }
        }
    }

    public void setShip(int shipSize, int[][] pitch, int direction){
        if(direction == 0) {
            checkCleanPosition(pitch, shipSize, direction);
            for (int i = 0; i < shipSize; i++) {
                //Vertical alignment
                pitch[positionX][positionY] = 1;
                positionX++;
            }
        }
        else if (direction == 1){
            checkCleanPosition(pitch, shipSize, direction);
            for (int i = 0; i < shipSize; i++) {
                //Vertical alignment
                pitch[positionX][positionY] = 1;
                positionY++;
            }
        }
    }

    public void setRandomVars(){
        Random rand = new Random();
        positionX = rand.nextInt(pitchSize);
        positionY = rand.nextInt(pitchSize);
        direction = rand.nextInt(2);
        posClean = false;
        posCleanCounter = 0;
    }

    public void setShipsRandom(int[][] pitch){
        pitchSize = pitch.length;

        // Place 1 Schlachtschiff (5 Kästchen)
        setRandomVars();
        setShip(5, pitch, direction);

        // Place 2 Kreuzer (je 4 Kästchen)
        setRandomVars();
        setShip(4, pitch, direction);
        setRandomVars();
        setShip(4, pitch, direction);

        // Place 3 Zerstörer (je 3 Kästchen)
        setRandomVars();
        setShip(3, pitch, direction);
        setRandomVars();
        setShip(3, pitch, direction);
        setRandomVars();
        setShip(3, pitch, direction);

        // Place 4 U-Boote (je 2 Kästchen)
        setRandomVars();
        setShip(2, pitch, direction);
        setRandomVars();
        setShip(2, pitch, direction);
        setRandomVars();
        setShip(2, pitch, direction);
        setRandomVars();
        setShip(2, pitch, direction);


    }
}




