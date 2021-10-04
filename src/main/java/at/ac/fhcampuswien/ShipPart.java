package at.ac.fhcampuswien;

public class ShipPart {

    public Coordinate[] position; //1-Dimensionaler Koordinaten-Array zur Speicherung von x & y!
    private boolean hit; // Variable zur Speicherung, ob Schiffsteil getroffen wurde //ToDo: Speichern im position-Array!

    //Constructor zur Initialisierung des Schiffsteils
    public ShipPart(int x, int y){
        position = new Coordinate[1];
        position[0] = new Coordinate(x,y);
        hit = false;
    }

    // Wenn Treffer erfolgreich: Setzen der Varibale hit = true
    public void setHit(){hit = true;}

    // Rückgabe des aktuellen Status von hit
    public boolean getHit(){
        return hit;
    }

    /*public int[] getCoordinates(){
        int[] coordinates = new int[2];
        coordinates[0] = position.getPositionX();
        coordinates[1] = position.getPositionY();
        return coordinates;
    }*/

    /*public void setCoordinates(int x, int y){
        position.setCoordinates(x,y);
    }*/
}
