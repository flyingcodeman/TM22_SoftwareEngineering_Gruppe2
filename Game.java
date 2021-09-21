class Game {

    /*
        Game modes to be defined
     */


    public static void main(String []args) {
        //initializes 2 Fields and 1 set of Ships
        Field field1 = new Field();
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

    }
}