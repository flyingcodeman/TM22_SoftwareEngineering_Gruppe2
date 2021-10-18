package at.ac.fhcampuswien.core;

import java.util.ArrayList;
import java.util.List;

public class ShipFactory {

    public static List<Ship> generateShip(int size, Field ownField, int amount){
        List<Ship> ships = new ArrayList<>();
        int count = 0;
        while(count < amount){
            ships.add(new Ship(size,(char) size, ownField));
            count++;
        }
        return ships;
    }
}
