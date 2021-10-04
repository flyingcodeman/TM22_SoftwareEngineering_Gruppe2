package at.ac.fhcampuswien;
import java.util.InputMismatchException;
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
        System.out.println("Sprache auswaehlen: ");
        //Input einlesen und Sprachwahl durchführen
        System.out.println("Das Spiel wird geladen");
    }

    //Initialisierung aller Spieler und Grundeinstellungen
    private void flowInit(){
        scanner = new Scanner(System.in);

        //ToDo: Check input strings
        System.out.println("Spieler 1: Geben Sie Ihren Namen ein");
        String name1 = scanner.nextLine();
        //Initialisierung des Players, seiner Spielfelder und Zuweisung des Namens
        player1 = new Player(name1);
        System.out.println("Bitte wählen Sie Ihren Gegner: ");
        System.out.println("Computer oder Spieler");
        String chosenPlayer = scanner.nextLine();
        System.out.println("Spieler 2: Geben Sie Ihren Namen ein");
        String name2 = scanner.nextLine();
        //Initialisierung des Players, seiner Spielfelder und Zuweisung des Namens
        player2 = new Player(name2);

        //Platzierung der Schiffe
        player1.setStandardFleet();
        player2.setStandardFleet();
        System.out.println("Schiffe wurden platziert!");
    }

    //Hauptsequenz des Spiels
    private void flowMainSequence(Player currentPlayer, Player currentOpponent){
        int shootX = 0;
        int shootY = 0;

        // Ausgabe beider Felder des jeweiligen Spielers
        System.out.println("Hello Player " + currentPlayer.getPlayerName());
        currentPlayer.printFieldset();

        //Schießen
        Shot shoot = new Shot();
        Coordinate givenShootCoordinate = new Coordinate(0,0);
        Shot.State result = Shot.State.reload;

        while(result == Shot.State.reload) {
            boolean validX = false;
            boolean validY = false;
            char tmpshootX = '0';

            System.out.println("Geben Sie Ihre Schusskoordinaten ein:");
            // Check input from x-coordinate
            do {
                try {
                    //Ask user to input a character between A and J
                    scanner = new Scanner(System.in);
                    System.out.println("x-Coordinate:");
                    tmpshootX = scanner.next().charAt(0);

                    if ((tmpshootX == 'A') || (tmpshootX == 'B') || (tmpshootX == 'C') || (tmpshootX == 'D') || (tmpshootX == 'E') ||
                            (tmpshootX == 'F') || (tmpshootX == 'G') || (tmpshootX == 'H') || (tmpshootX == 'I') || (tmpshootX == 'J')) {
                        System.out.println("Your coordinate is " + tmpshootX);
                        validX = true;
                        shootX = givenShootCoordinate.translateInput(tmpshootX);
                    } else {
                        System.out.println("Error: The (" + tmpshootX + ") is not between A and J, try again");
                    }
                } catch (NumberFormatException ne) {
                    System.out.println("Error: The (" + tmpshootX + ") is not between A and J, try again");
                }
                catch (Exception e) {
                    System.out.println("Error: The (" + tmpshootX + ") is not a valid input - Only characters between A and J");
                }
            } //Continue the loop while input is not valid
            while (!validX);

            // Check input from y-coordinate
            do {
                try {
                    //Ask user to input a number between 1 and 10
                    scanner = new Scanner(System.in);
                    System.out.println("y-Coordinate:");
                    shootY = scanner.nextInt();

                    if ((shootY == 1) || (shootY == 1) || (shootY == 3) || (shootY == 4) || (shootY == 5) ||
                            (shootY == 6) || (shootY == 7) || (shootY == 8) || (shootY == 9) || (shootY == 10)) { //ToDo
                        System.out.println("Your number is " + shootY);
                        validY = true;
                        shootY -= 1;
                    } else {
                        System.out.println("Error: The (" + shootY + ") is not between 1 and 10, try again");
                    }
                } catch (NumberFormatException ne) {
                    System.out.println("Error: The (" + shootY + ") is not between 1 and 10, try again");
                } catch (InputMismatchException ne) {
                    System.out.println("Error: The (" + shootY + ") is not a valid input - Only numbers between 1 and 10");
                }
            } //Continue the loop while Number is not equal 1 - 10
            while (!validY);


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
        System.out.println(currentPlayer.getPlayerName() + " - Ihr Zug ist beendet. " + currenOpponent.getPlayerName() + " ist am Zug.");
        System.out.println(currenOpponent.getPlayerName() + " ready? J/N");
        String name2 = scanner.nextLine();
    }


    public boolean checkGameOver(){
        return true;
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
