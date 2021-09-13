class Game {

    /*
        Game modes to be defined
     */


    public static void main(String []args) {
        Field field1 = new Field();
        Field field2 = new Field();
        Ships ships = new Ships();

        System.out.println("Field Player 1: ");
        field1.createField(10);
        ships.setShipsRandom(field1.getField());
        field1.printField();

        System.out.println("Field Player 2: ");
        field2.createField(10);
        ships.setShipsRandom(field2.getField());
        field2.printField();

    }
}