package at.ac.fhcampuswien.gui;
import at.ac.fhcampuswien.core.Coordinate;
import at.ac.fhcampuswien.core.Player;
import at.ac.fhcampuswien.core.Shot;

import java.util.InputMismatchException;
import java.util.Scanner;


public class GameLogic {
    /*
        GameLogic modes to be defined
        */
    private Scanner scanner; //Object zum Einlesen der User-Inputs über die Console
    public Player player1;
    public Player player2;
    private String language = "";
    private String playerMode = "";
    public boolean gameOver = false;

    //Consolen-Ein- und Ausgaben + Input-Checks
    private void flowDialog(String sequence){
        switch(sequence){
            case "language":
                boolean validLanguage = false;
                //Sprache festlegen
                //Ausgabe der Begruessung gemäß den Spielregeln
                System.out.println("Select language: (E)nglish (G)erman (D)^2");
                do {
                    try {
                        //Ask user to input 'G', "German", 'E' or "English", 'D' or D^2
                        scanner = new Scanner(System.in);
                        language = scanner.next();

                        if ((language.equals("G")) || (language.equals("German")) ||
                                (language.equals("E")) || (language.equals("English")) ||
                                (language.equals("D")) || (language.equals("D^2"))) {
                            validLanguage = true;
                            // ToDo: Save input and choose language

                        } else {
                            System.out.println("Error: The input (" + language + ") is not in the expected range - Please retry!");
                            language = "";
                        }
                    }
                    catch (Exception e) {
                        System.out.println("Error: The input (" + language + ") is not a valid input - Please retry!");
                        language = "";
                    }
                } //Continue the loop while input is not valid
                while (!validLanguage);
                break;

            case "player":
                scanner = new Scanner(System.in);
                //Player 1
                System.out.println("Player 1: Insert your name:");
                String name1 = scanner.next();
                //Initialisierung des Players 1, seiner Spielfelder und Zuweisung des Namens
                player1 = new Player(name1);

                //Player 2
                scanner = new Scanner(System.in);
                System.out.println("Player 2: Insert your name");
                String name2 = scanner.next();
                //Initialisierung des Players, seiner Spielfelder und Zuweisung des Namens
                player2 = new Player(name2);
                break;

            case "playermode":
                boolean validPlayer = false;
                System.out.println("Please select your opponent:");
                System.out.println("(C)omputer or (P)layer");
                do {
                    try {
                        //Ask user to input 'C', "Computer", 'P' or "Player"
                        scanner = new Scanner(System.in);
                        playerMode = scanner.nextLine();

                        if ((playerMode.equals("C")) || (playerMode.equals("Computer")) || (playerMode.equals("P")) || (playerMode.equals("Player"))) {
                            validPlayer = true;
                            // ToDo: Save input and choose playmode

                        } else {
                            System.out.println("Error: The input (" + playerMode + ") is not in the expected range - Please retry!");
                            playerMode = "";
                        }
                    }
                    catch (Exception e) {
                        System.out.println("Error: The input (" + playerMode + ") is not a valid input - Please retry!");
                        playerMode = "";
                    }
                } //Continue the loop while input is not valid
                while (!validPlayer);
                break;

            case "changePlayer":
                boolean validSwitch = false;
                String readyState = "";
                do {
                    try {
                        //Ask user to input 'y', "yes", 'n' or "no", 'q' or "quit", 'r' or "rules"
                        scanner = new Scanner(System.in);
                        readyState = scanner.nextLine();

                        if ((readyState.equals("y")) || (readyState.equals("yes")) || (readyState.equals("n")) || (readyState.equals("no"))) {
                            validSwitch = true;
                            // ToDo: Save input and choose playmode
                        } else if((readyState.equals("r")) || (readyState.equals("rules"))){
                            //ToDo: Show rules of the game / call init function
                            System.out.println("Placeholder for game rules // ToDo!");

                            //Ongoing game after presentation of the rules
                            System.out.println("Are you ready? (y)es/(n)o/(q)uit game/(r)ules of the game");
                            readyState = "";
                        }else if((readyState.equals("q")) || (readyState.equals("quit"))){
                            flowGameOver();
                            System.out.println("Quit game successfully - Missing implementation of GameOver-/GameQuit-Handling!");
                            //Todo: BREAK!
                        }
                        else {
                            System.out.println("Error: The input (" + readyState + ") is not in the expected range - Please retry!");
                            readyState = "";
                        }

                    }
                    catch (Exception e) {
                        System.out.println("Error: The input (" + readyState + ") is not a valid input - Please retry!");
                        readyState = "";
                    }
                } //Continue the loop while input is not valid
                while (!validSwitch);
                break;
        }
    }


    //Begrüßung und Festlegen der Sprache
    public void flowWelcome(){
        //Start sequence language
        flowDialog("language");
        //Input einlesen und Sprachwahl durchführen
        System.out.println("The game is loading...");
    }

    //Initialisierung aller Spieler und Grundeinstellungen
    public void flowInit(){
        //Read in player names
        flowDialog("player");
        //Player-Mode
        flowDialog("playermode");

        //Platzierung der Schiffe
        player1.setStandardFleet();
        player2.setStandardFleet();
        System.out.println("Ships were placed");
    }

    //Hauptsequenz des Spiels
    public void flowMainSequence(Player currentPlayer, Player currentOpponent){
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

            System.out.println("Please insert your shot coordinates:");
            // Check input from x-coordinate
            do {
                try {
                    //Ask user to input a character between A and J
                    scanner = new Scanner(System.in);
                    System.out.println("x-coordinate:");
                    tmpshootX = scanner.next().charAt(0);

                    if ((tmpshootX == 'A') || (tmpshootX == 'B') || (tmpshootX == 'C') || (tmpshootX == 'D') || (tmpshootX == 'E') ||
                            (tmpshootX == 'F') || (tmpshootX == 'G') || (tmpshootX == 'H') || (tmpshootX == 'I') || (tmpshootX == 'J')) {
                        //System.out.println("Your coordinate is " + tmpshootX);
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
                    System.out.println("y-coordinate:");
                    shootY = scanner.nextInt();

                    if ((shootY == 1) || (shootY == 2) || (shootY == 3) || (shootY == 4) || (shootY == 5) ||
                            (shootY == 6) || (shootY == 7) || (shootY == 8) || (shootY == 9) || (shootY == 10)) { //ToDo
                        //System.out.println("Your number is " + shootY);
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
            //System.out.println(currentOpponent.getCharAtPosition(givenShootCoordinate));

            // Consolenausgabe gemäß des Schussergebnisses
            switch (result){
                case reload:
                    System.out.println("You already shot there. Please try again!");
                    break;
                case hit:
                    System.out.println("Nice shot - HIT on coordinate " + tmpshootX + "/" + (shootY+1));
                    break;
                case miss:
                    System.out.println("Nice try - Only water! Missed shot on coordinate " + tmpshootX + "/" + (shootY+1));
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
        for(int i = 0; i <10; i++){
            System.out.println(">");
        }
        System.out.println(currentPlayer.getPlayerName() + " - Your turn is over. It's " + currenOpponent.getPlayerName() + "s turn.");
        System.out.println(currenOpponent.getPlayerName() + " ready? (y)es/(n)o/(q)uit game/(r)ules of the game");
        flowDialog("changePlayer");
    }

    //Flow Zum GameOver-Handling des Spiels
    public void flowGameOver(){
        //ToDo
    }

    public boolean checkGameOver(){
        return true;
    }


}