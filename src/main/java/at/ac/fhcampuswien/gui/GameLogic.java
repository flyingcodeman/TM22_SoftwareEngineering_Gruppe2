package at.ac.fhcampuswien.gui;
import at.ac.fhcampuswien.core.Coordinate;
import at.ac.fhcampuswien.core.Player;
import at.ac.fhcampuswien.core.Shot;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;



public class GameLogic {


    //-- Parameter list --
    private Scanner scanner;
    public Player player1;
    public Player player2;
    private String language = "";
    private String playerMode = "";
    public char tmpgameover = 'p';
    public enum gameState { //Zustände des Spiels
        gameOver, gameQuit, gameContinue, gamePlayAgain
    }

    //-- Consolen-Ein- und Ausgaben + Input-Checks --
    public gameState flowDialog(String sequence){
        gameState currentGameState = gameState.gameContinue;

        switch(sequence){
            case "language" -> {
                boolean validLanguage = false;
                //Sprache festlegen
                //Ausgabe der Begruessung gemäß den Spielregeln
                System.out.println("Select language: (E)nglish (G)erman (D)^2");
                do {
                    try {
                        //Ask user to input 'G', "German", 'E' or "English", 'D' or D^2
                        scanner = new Scanner(System.in);
                        language = scanner.next();

                        if ((language.equals("E")) || (language.equals("English"))) {
                            validLanguage = true;
                            // ToDo: Save input and set language
                        }else if((language.equals("G")) || (language.equals("German")) ||
                                (language.equals("D")) || (language.equals("D^2"))){
                            System.out.println("Selected language not implemented yet - language Englisch selected!\n");
                            validLanguage = true;
                        } else {
                            System.out.println("Error: The input (" + language + ") is not in the expected range - Please retry!");
                            language = "";
                        }
                    } catch (Exception e) {
                        System.out.println("Error: The input (" + language + ") is not a valid input - Please retry!");
                        language = "";
                    }
                }
                while (!validLanguage);
                break;
            }
            case "player" -> {
                scanner = new Scanner(System.in);
                System.out.println("Player 1: Insert your name:");
                String name1 = scanner.next();
                player1 = new Player(name1);

                scanner = new Scanner(System.in);
                System.out.println("Player 2: Insert your name");
                String name2 = scanner.next();
                player2 = new Player(name2);
                break;
            }
            case "playermode" -> {
                boolean validPlayer = false;
                do {
                    System.out.println("Please select your opponent:");
                    System.out.println("(C)omputer or (P)layer");
                    try {
                        scanner = new Scanner(System.in);
                        playerMode = scanner.nextLine();

                        if ((playerMode.equals("P")) || (playerMode.equals("Player"))) {
                            validPlayer = true;
                        } else if((playerMode.equals("C")) || (playerMode.equals("Computer"))){
                            System.out.println("Computer mode not implemented yet - Opponent player selected!\n");
                            validPlayer = true;
                        }else {
                            System.out.println("Error: The input (" + playerMode + ") is not in the expected range - Please retry!");
                            playerMode = "";
                        }
                    } catch (Exception e) {
                        System.out.println("Error: The input (" + playerMode + ") is not a valid input - Please retry!");
                        playerMode = "";
                    }
                }
                while (!validPlayer);
                break;
            }
            case "changePlayer" -> {
                boolean validSwitch = false;
                String readyState = "";
                do {
                    try {
                        scanner = new Scanner(System.in);
                        readyState = scanner.nextLine();

                        switch (readyState) {
                            case "y", "yes" -> {
                                validSwitch = true;
                                currentGameState = gameState.gameContinue;
                            }
                            // ToDo: Save input and choose playmode
                            case "r", "rules" -> {
                                //ToDo: Show rules of the game / call init function
                                printingGameRules();

                                //Ongoing game after presentation of the rules
                                System.out.println("Are you ready? (y)es/(q)uit game/(r)ules of the game");
                                readyState = "";
                            }
                            case "q", "quit" -> {
                                System.out.println("Quit game successfully!");
                                validSwitch = true;
                                currentGameState = gameState.gameQuit;
                            }
                            default -> {
                                System.out.println("Error: The input (" + readyState + ") is not in the expected range - Please retry!");
                                readyState = "";
                            }
                        }
                    } catch (Exception e) {
                        System.out.println("Error: The input (" + readyState + ") is not a valid input - Please retry!");
                        readyState = "";
                    }
                }
                while (!validSwitch);
                break;
            }
        }
        return currentGameState;
    }

    public void printingGameRules(){
        System.out.println("----------------------------------\n");
        System.out.println("Schiffe versenken - Game rules: ");
        System.out.println("\n----------------------------------");
        System.out.println("- Each player has 2 playing fields.");

        System.out.println("- The own field shows the location of your own ships and their status (not hit, hit, sunk)");
        System.out.println("  - '0' means 'Own, unhit ship'");
        System.out.println("  - 'X' means 'Ship hit'");
        System.out.println("  - '#' means 'Ship sunk'");
        System.out.println("  - '~' means 'Empty Field (own Field)'");
        System.out.println("");

        System.out.println("- The opponent's field shows the shots the player has taken and whether they were a hit or a shot into empty space. ");
        System.out.println("  - 'X' means 'Ship hit'");
        System.out.println("  - '#' means 'Ship sunk'");
        System.out.println("  - '/' means 'Shot hit water'");
        System.out.println("  - '~' means 'Field content still unknown'");
        System.out.println("");

        System.out.println("- Each player must start by placing all the ships at their disposal, or have them placed automatically by the game. ");

        System.out.println("- After each shot, independently of the result (hit/no hit), the player is changed. ");

        System.out.println("- Since the game is only played on a PC, the player must swap it with the other player before confirming the swap. Otherwise the opponent will see the opponents fields.");

        System.out.println("- The player must enter coordinates for shooting");
        System.out.println("- Horizontal (x-axis) in capital letters and vertical (y-axis) in numbers.");

        System.out.println("- The first player to hit and sink all enemy ships wins the game.");
        System.out.println("----------------------------------\n");
    }

    public void flowWelcome(){
        flowDialog("language");
        System.out.println("The game is loading...");
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        printingGameRules();
    }

    public void flowInit(){
        flowDialog("playermode");
        flowDialog("player");

        player1.setStandardFleet();
        player2.setStandardFleet();
    }

    public gameState flowMainSequence(Player currentPlayer, Player currentOpponent){
        int shootX = 0, shootY = 0;
        gameState currentGameState = gameState.gameContinue;

        // Ausgabe beider Felder des jeweiligen Spielers
        System.out.println("Hello Player " + currentPlayer.getPlayerName());
        currentPlayer.printFieldset();

        //Schießen
        Shot shoot = new Shot();
        Coordinate givenShootCoordinate = new Coordinate(0,0);
        Shot.State result = Shot.State.reload;

        while(result == Shot.State.reload) {
            boolean validX = false, validY = false;
            char tmpshootX = '0';

            System.out.println("Please insert your shot coordinates:");
            // Check input from x-coordinate
            do {
                try {
                    scanner = new Scanner(System.in);
                    System.out.println("x-coordinate:");
                    tmpshootX = scanner.next().charAt(0);

                    if (tmpshootX >= 'A' && tmpshootX <= 'J') {
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
            }
            while (!validX);

            // Check input from y-coordinate
            do {
                try {
                    //Ask user to input a number between 1 and 10
                    scanner = new Scanner(System.in);
                    System.out.println("y-coordinate:");
                    shootY = scanner.nextInt();

                    if (shootY>0 && shootY<11) {
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
            }
            while (!validY);

            givenShootCoordinate.setNewCoordinates(shootX, shootY);
            result = shoot.shootsAt(givenShootCoordinate, currentPlayer, currentOpponent);
            switch (result) {
                case reload -> System.out.println("You already shot there. Please try again!");
                case hit -> System.out.println("Nice shot - HIT on coordinate " + tmpshootX + "/" + (shootY + 1));
                case miss -> System.out.println("Nice try - Only water! Missed shot on coordinate " + tmpshootX + "/" + (shootY + 1));
                case error -> System.out.println("Invalid shot!");
            }
        }

        //Checken der player.gameOver-Variable, ob Spiel vorbei & Flotte versenkt
        //ToDo: Andere Positionierung des Checks und Erweiterung der Methode
        if(currentOpponent.gameOver){
            return gameState.gameOver;
        }

        //Change Player
        currentGameState = flowChangePlayer(currentPlayer, currentOpponent);

        return currentGameState;
    }

    public gameState flowChangePlayer(Player currentPlayer, Player currentOpponent){
        for(int i = 0; i <10; i++){
            System.out.println(">");
        }
        System.out.println(currentPlayer.getPlayerName() + " - Your turn is over. It's " + currentOpponent.getPlayerName() + "s turn.");
        System.out.println(currentOpponent.getPlayerName() + " ready? (y)es/(q)uit game/(r)ules of the game");
        return flowDialog("changePlayer");
    }

    public gameState flowGameOver() {
        do {
            try {
                // ToDo: Routine aus Change Player oder Readystate abfrage heraus implementieren (hakt hier)

                System.out.println("Game Over...");
                System.out.println("(p)lay again , or (q)uit program?");
                scanner = new Scanner(System.in);
                tmpgameover = scanner.next().charAt(0);

                if ((tmpgameover == 'p')) {
                    System.out.println("Your choice " + tmpgameover);
                    return gameState.gamePlayAgain;
                } else if ((tmpgameover == 'q')) {
                    System.out.println("Thanks for playing ... Please come back soon!");
                    return gameState.gameQuit;
                } else {
                    System.out.println("Input Error: The (" + tmpgameover + ") is not a valid choice (p or q), try again");
                }
            } catch (NumberFormatException ne) {
                System.out.println("Format Error: The (" + tmpgameover + ") is not a valid choice (p or q), try again");
            } catch (Exception e) {
                System.out.println("Exception Error: The (" + tmpgameover + ") is not a valid choice (p or q), try again");
            }
        }
        while (true);
    }
}