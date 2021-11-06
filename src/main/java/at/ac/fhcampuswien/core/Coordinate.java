package at.ac.fhcampuswien.core;

import java.util.HashMap;
import java.util.Map;

public class Coordinate {
    private int positionX = 0;
    private int positionY = 0;
    Map<Character, Integer> inputMap = new HashMap<>();

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

    public int translateInput(char c) {
        int mappedValue = 0;
        char input = 'A';
        try {
            for (int i = 0; i < 10; i++) {
                inputMap.put(input, i);
                input++;
            }
            if(!(c >= 'A' && c <= 'J')){
                throw new IllegalArgumentException("Translation error: Invalid character!");
            }
            mappedValue = inputMap.get(c);
        } catch (IllegalArgumentException e) {
            System.out.println("Exception Error: Something went wrong during input translation!");
            throw new IllegalArgumentException("Translation error: Invalid character!");
        }
        return mappedValue;
    }
}
