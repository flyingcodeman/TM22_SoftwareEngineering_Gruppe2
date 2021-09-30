package at.ac.fhcampuswien;

import java.util.Random;

public class Coordinate {
    public int positionX = 0;
    public int positionY = 0;
    public boolean shotAt = false;

    public Coordinate(int x, int y){
        positionX = x;
        positionY = y;
    }
    public int getPositionX(){return positionX;}
    public int getPositionY(){return positionY;}

}
