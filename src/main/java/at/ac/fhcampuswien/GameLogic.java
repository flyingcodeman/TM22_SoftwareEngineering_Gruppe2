package at.ac.fhcampuswien;
import java.util.Scanner;

public class GameLogic {
    /*
    GameLogic modes to be defined
    */
    private Scanner scanner; //Object zum Einlesen der User-Inputs über die Console
    public Player player1;
    public Player player2;
    boolean gameOver = false;

    //Begrüßung und Festlegen der Sprache
    private void flowWelcome(){
        scanner = new Scanner(System.in);
        //ToDo:
        //Sprache festlegen
        //Ausgabe der Begruessung gemäß den Spielregeln
        System.out.println("Select language: ");
        //Input einlesen und Sprachwahl durchführen
        System.out.println("The game is loading...");
    }

    //Initialisierung aller Spieler und Grundeinstellungen
    private void flowInit(){
        scanner = new Scanner(System.in);

        //ToDo: Check input strings
        System.out.println("Player 1: Insert your name:");
        String name1 = scanner.nextLine();
        //Initialisierung des Players, seiner Spielfelder und Zuweisung des Namens
        player1 = new Player(name1);
        System.out.println("Please select your opponent:");
        System.out.println("Computer or player");
        String chosenPlayer = scanner.nextLine();
        System.out.println("Player 2: Insert your name");
        String name2 = scanner.nextLine();
        //Initialisierung des Players, seiner Spielfelder und Zuweisung des Namens
        player2 = new Player(name2);

        //Platzierung der Schiffe
        player1.setStandardFleet();
        player2.setStandardFleet();
        System.out.println("Ships were placed");
    }

    //Hauptsequenz des Spiels
    private void flowMainSequence(Player currentPlayer, Player currentOpponent){
        scanner = new Scanner(System.in);

        // Ausgabe beider Felder des jeweiligen Spielers
        System.out.println("Hello Player " + currentPlayer.getPlayerName());
        currentPlayer.printFieldset();

        //Schießen
        Shot shoot = new Shot();
        Coordinate givenShootCoordinate = new Coordinate(0,0);
        Shot.State result = Shot.State.reload;

        while(result == Shot.State.reload) {
            System.out.println("Please insert your shot coordinates:");
            System.out.println("x-coordinate:");
            int shootX = scanner.nextInt();
            System.out.println("y-coordinate:");
            int shootY = scanner.nextInt();
            givenShootCoordinate.setNewCoordinates(shootX, shootY);
            //Check, ob und was der Schuss getroffen hat
            result = shoot.shootsAt(givenShootCoordinate, currentPlayer, currentOpponent);
            //Ausgabe des getroffenen characters im gegnerischen Feld
            System.out.println(currentOpponent.getCharAtPosition(givenShootCoordinate));

            // Consolenausgabe gemäß des Schussergebnisses
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

        //Checken der player.gameOver-Variable, ob Spiel vorbei & Flotte versenkt
        //ToDo: Andere Positionierung des Checks und Erweiterung der Methode
        if(currentOpponent.gameOver){
            gameOver = true;
        }
    }

    //Flow zum Wechseln der Spieler
    public void flowChangePlayer(Player currentPlayer, Player currenOpponent){
        scanner = new Scanner(System.in);
        System.out.println(currentPlayer.getPlayerName() + " - Your turn is over. It's " + currenOpponent.getPlayerName() + "turn.");
        System.out.println(currenOpponent.getPlayerName() + " ready? y(es)/n(o)");
        String name2 = scanner.nextLine();
    }

    //MAIN
    public static void main(String []args) {
        GameLogic game = new GameLogic();

        game.flowWelcome();
        game.flowInit();
        // Wechseln der Spieler und SPielzüge bis Flotte versenkt/game.gameOver == true
        while(game.gameOver == false) {
            game.flowMainSequence(game.player1, game.player2);
            game.flowChangePlayer(game.player1, game.player2);
            game.flowMainSequence(game.player2, game.player1);
            game.flowChangePlayer(game.player2, game.player1);
        }

        //ToDo: Stats ausgeben
        //ToDo: flowGameOver erstellen, Consolenausgabe ausformulieren und Möglichkeiten zum Beenden / Neustart implementieren
        System.out.println("GAME OVER");
    }
}
