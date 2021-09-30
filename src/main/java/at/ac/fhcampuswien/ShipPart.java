package at.ac.fhcampuswien;

public class ShipPart {

    Coordinate[] position;
    private boolean hit;

    public ShipPart(int x, int y){
        position = new Coordinate[1];
        position[0] = new Coordinate(x,y);
        hit = false;
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

    public void setHit(){
        hit = true;
    }

    public boolean getHit(){
        return hit;
    }

    public void isPartOf(Ship ship) {
        //stellt die Verbindung zw
    }

    public void has(Coordinate coordinate) {
        //defines on which coordinate the ship part is placed
        //writes the coordinate into this.position
    }
}
