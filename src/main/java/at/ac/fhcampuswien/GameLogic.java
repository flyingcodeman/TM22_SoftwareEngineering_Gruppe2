package at.ac.fhcampuswien;

public class GameLogic {
    /*
    GameLogic modes to be defined
    */


    public static void main(String []args) {
        Player player1 = new Player("Simon");
        Player player2 = new Player("Adriane");
        player1.setOpponent(player2);
        player2.setOpponent(player1);
        System.out.println("Hello Player " + player1.getPlayerName());
        player1.printFieldset();
        System.out.println("\nNow  give "+ player1.getPlayerName() +"'s field gets some ships!");
        player1.setStandardFleet();
        System.out.println("\nNow lets print "+ player1.getPlayerName() +"'s fields again.");
        player1.printFieldset();

        Coordinate cord = new Coordinate(2,3);


        player1.getCharFromOpponentFieldAtCoordinate(cord, (player1.getOpponent()).getOwnField());
        System.out.println("Chosen Coordinate: "+ cord.positionX + "/" + cord.positionY + "\nCharacter at Coordinate: "+ player1.getCharFromOpponentFieldAtCoordinate(cord, (player1.getOpponent()).getOwnField()));

        /*
        System.out.println(player1.fleet.fleet[3].ship[0].position[0].positionY);
        System.out.println(player1.fleet.fleet[3].ship[0].position[0].shotAt);
        System.out.println(player1.fleet.fleet[3].ship[1].position[0].positionY);
        System.out.println(player1.fleet.fleet[3].ship[1].position[0].shotAt);
        System.out.println(player1.fleet.fleet[3].ship[2].position[0].positionY);
        System.out.println(player1.fleet.fleet[3].ship[2].position[0].shotAt);
        */

        /*
        Field field1 = new Field();
        Field field2 = new Field();
        Ships ships = new Ships();
        */


    }
}
