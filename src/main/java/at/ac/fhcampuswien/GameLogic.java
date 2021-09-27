package at.ac.fhcampuswien;

public class GameLogic {

    /*
        GameLogic modes to be defined
     */


    public static void main(String []args) {
        Field field = new Field();
        field.createField();
        field.printOwnField(field.getField());
        /*Field field1 = new Field();
        Field field2 = new Field();
        Ships ships = new Ships();

        //creates Field for Player 1
        System.out.println("Field Player 1: ");
        field1.createField(10);
        //sets ships for Player 1 randomly
        ships.setShipsRandom(field1.getField());
        field1.printField();

        //creates Field for Player 2
        System.out.println("Field Player 2: ");
        field2.createField(10);
        //sets ships for Player 2 randomly
        ships.setShipsRandom(field2.getField());
        field2.printField();
    */


    }
}
