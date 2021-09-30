package at.ac.fhcampuswien;

public class Fleet {
    Ship[] fleet = new Ship[10];

    public void createStandardFleet(int size, char[][] ownField) {
        fleet[0] = new Ship(5, '5', ownField);
        fleet[1] = new Ship(4, '4', ownField);
        fleet[2] = new Ship(4, '4', ownField);
        for(int i = 3; i<(size-4); i++){
            fleet[i] = new Ship(3, '3', ownField);
        }
        for(int i = 6; i<size; i++){
            fleet[i] = new Ship(2, '2', ownField);
        }
        //Fill fleet array with ships

    }

    public Ship[] getFleet(){return fleet;}

    //public void setFleetRandomly(Field field) {}

    public void addShipToFleet(Ship ship) {}

    public void printFleet() {

    }

}
