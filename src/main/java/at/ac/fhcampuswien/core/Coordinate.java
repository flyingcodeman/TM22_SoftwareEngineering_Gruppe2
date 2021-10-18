package at.ac.fhcampuswien.core;


public class Coordinate {
    public int positionX = 0;
    public int positionY = 0;
    public boolean shotAt = false;

    public Coordinate(int x, int y){
        positionX = x;
        positionY = y;
    }

    public void setNewCoordinates(int x, int y){
        positionX = x;
        positionY = y;
    }
    public int getPositionX(){return positionX;}
    public int getPositionY(){return positionY;}

    public int translateInput(char c){
        int xCoordinate = 0;
        if(c == 'A'){
            xCoordinate = 0;
        }
        else if(c == 'B'){
            xCoordinate = 1;
        }
        else if(c == 'C'){
            xCoordinate = 2;
        }
        else if(c == 'D'){
            xCoordinate = 3;
        }
        else if(c == 'E'){
            xCoordinate = 4;
        }
        else if(c == 'F'){
            xCoordinate = 5;
        }
        else if(c == 'G'){
            xCoordinate = 6;
        }
        else if(c == 'H'){
            xCoordinate = 7;
        }
        else if(c == 'I'){
            xCoordinate = 8;
        }
        else if(c == 'J'){
            xCoordinate = 9;
        }
        else{
            throw new IllegalArgumentException("Translation error: Invalid character!");
        }
        return xCoordinate;
    }

}
