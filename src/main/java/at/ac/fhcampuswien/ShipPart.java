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
        coordinates[0] = postion.getPositionX();
        coordinates[1] = postion.getPositionY();
        return coordinates;
    }*/

    /*public void setCoordinates(int x, int y){
        postion.setCoordinates(x,y);
    }*/

    public void isPartOf(Ship ship) {
        //stellt die Verbindung zw
    }

    public void has(Coordinate coordinate) {
        //defines on which coordinate the shipfield is placed
        //writes the coordinate into this.position
    }
}
