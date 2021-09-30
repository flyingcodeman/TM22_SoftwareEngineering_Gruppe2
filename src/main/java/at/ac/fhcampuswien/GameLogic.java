package at.ac.fhcampuswien;
import java.util.Scanner;

public class GameLogic {
    /*
    GameLogic modes to be defined
    */
    Scanner scanner = new Scanner(System.in);
    Player player1;
    Player player2;
    boolean gameOver = false;

    private void flowWelcome(){
        //ToDo:
        //Sprache festlegen
        //Ausgabe der Begruessung der Spielregeln
        System.out.println("Sprache auswaehlen: ");
        //Input einlesen und Sprachwahl durchführen
        System.out.println("Das Spiel wird geladen");
    }

    private void flowInit(){
        //Initialisierung aller Spieler und Grundeinstellungen
        System.out.println("Spieler 1: Geben Sie Ihren Namen ein");
        String name1 = scanner.nextLine();
        player1 = new Player(name1);
        System.out.println("Bitte wählen Sie Ihren Gegner: ");
        System.out.println("Computer oder Spieler");
        String chosenPlayer = scanner.nextLine();
        //ToDo: Check String
        System.out.println("Spieler 2: Geben Sie Ihren Namen ein");
        String name2 = scanner.nextLine();
        player2 = new Player(name2);

        //-----
        //Platzierung der Schiffe
        player1.setStandardFleet();
        player2.setStandardFleet();
        System.out.println("Schiffe wurden platziert!");
    }



    private void flowMainSequence(Player currentPlayer, Player currentOpponent){
        System.out.println("Hello Player " + currentPlayer.getPlayerName());
        currentPlayer.printFieldset();

        //---
        Shot shoot = new Shot();
        Coordinate givenShootCoordinate = new Coordinate(0,0);
        Shot.State result = Shot.State.reload;

        while(result == Shot.State.reload) {
            System.out.println("Geben Sie Ihre Schusskoordinaten ein:");
            System.out.println("x-Koordinate:");
            int shootX = scanner.nextInt();
            System.out.println("y-Koordinate:");
            int shootY = scanner.nextInt();
            givenShootCoordinate.setNewCoordinates(shootX, shootY);
            result = shoot.shootsAt(givenShootCoordinate, currentPlayer, currentOpponent);
            System.out.println(currentOpponent.getCharAtPosition(givenShootCoordinate));

            switch (result){
                case reload:
                    System.out.println("You already shot there. Please try again!");
                    break;
                case hit:
                    System.out.println("Nice shot - HIT on coordinate " + givenShootCoordinate.positionX + "/" + givenShootCoordinate.positionY);
                    break;
                case miss:
                    System.out.println("Nice try - Only water! Missed shot on coordinate " + givenShootCoordinate.positionX + "/" + givenShootCoordinate.positionY);
                    break;
                case error:
                    System.out.println("Invalid shot!");
                    break;
            }
        }

        if(currentOpponent.gameOver == true){
            gameOver = true;
        }
    }

    public void flowChangePlayer(Player currentPlayer, Player currenOpponent){
        System.out.println(currentPlayer.getPlayerName() + " - Ihr Zug ist beendet. " + currenOpponent.getPlayerName() + " ist am Zug.");
        System.out.println(currenOpponent.getPlayerName() + " ready? J/N");
        String name2 = scanner.nextLine();
    }


    public static void main(String []args) {
        GameLogic game = new GameLogic();

        game.flowWelcome();
        game.flowInit();
        while(game.gameOver == false) {
            game.flowMainSequence(game.player1, game.player2);
            game.flowChangePlayer(game.player1, game.player2);
            game.flowMainSequence(game.player2, game.player1);
            game.flowChangePlayer(game.player2, game.player1);
        }

        System.out.println("GAME OVER");



        /*
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

        System.out.println(player1.fleet.fleet[3].ship[0].position[0].positionY);
        System.out.println(player1.fleet.fleet[3].ship[0].position[0].shotAt);
        System.out.println(player1.fleet.fleet[3].ship[1].position[0].positionY);
        System.out.println(player1.fleet.fleet[3].ship[1].position[0].shotAt);
        System.out.println(player1.fleet.fleet[3].ship[2].position[0].positionY);
        System.out.println(player1.fleet.fleet[3].ship[2].position[0].shotAt);


        Shot shoot = new Shot();
        Coordinate givenShootCoordinate = new Coordinate(player1.fleet.fleet[3].ship[2].position[0].positionX, player1.fleet.fleet[3].ship[2].position[0].positionY);
        shoot.shootsAt(givenShootCoordinate, player1);
        player1.printFieldset();
        System.out.println(givenShootCoordinate.positionY + " " + givenShootCoordinate.positionX);
        System.out.println(player1.getCharAtPosition(givenShootCoordinate));
        */

    }
}
