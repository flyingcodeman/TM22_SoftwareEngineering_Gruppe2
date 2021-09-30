package at.ac.fhcampuswien;

public class GameLogic {
    /*
    GameLogic modes to be defined
    */


    public static void main(String []args) {
        Player player1 = new Player("Simon");
        System.out.println("Hello Player " + player1.getPlayerName());
        player1.printFieldset();
        player1.setStandardFleet();
        player1.printFieldset();
        System.out.println(player1.fleet.fleet[3].ship[0].position[0].positionY);
        System.out.println(player1.fleet.fleet[3].ship[0].position[0].shotAt);
        System.out.println(player1.fleet.fleet[3].ship[1].position[0].positionY);
        System.out.println(player1.fleet.fleet[3].ship[1].position[0].shotAt);
        System.out.println(player1.fleet.fleet[3].ship[2].position[0].positionY);
        System.out.println(player1.fleet.fleet[3].ship[2].position[0].shotAt);

        /*
        Field field1 = new Field();
        Field field2 = new Field();
        Ships ships = new Ships();
        */

        Shot shoot = new Shot();
        Coordinate givenShootCoordinate = new Coordinate(player1.fleet.fleet[3].ship[2].position[0].positionX, player1.fleet.fleet[3].ship[2].position[0].positionY);
        shoot.shootsAt(givenShootCoordinate, player1);
        player1.printFieldset();
        System.out.println(player1.getCharAtPosition(givenShootCoordinate));


    }
}
