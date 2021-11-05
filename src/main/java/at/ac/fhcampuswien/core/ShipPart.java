package at.ac.fhcampuswien.core;

public class ShipPart {

    public Coordinate position;
    private boolean hit;

    public ShipPart(int x, int y){
        position = new Coordinate(x,y);
        hit = false;
    }

    public void setHit(){hit = true;}
    public boolean getHit(){
        return hit;
    }
}
