package at.ac.fhcampuswien.core;


public class Player {
    private String playerName;
    private Field ownField; // EIgenes Spielfeld mit gesetzten Schiffen
    private Field opponentField; // Eigenes opponent Info Feld zur Markierung der Schüsse auf den Gegner
    public Fleet fleet = new Fleet(); // Eigene Flotte mit Schiffen
    public boolean gameOver = false;

    //Constructor zum Setzen initalier Dinge
    public Player(String name){
        setPlayerName(name);
        setOwnField(10);
        setOpponentField(10);
    }

    public Player(String name,int fieldSize){
        setPlayerName(name);
        setOwnField(fieldSize);
        setOpponentField(fieldSize);
    }

    //Rückgabe des Spielernamens
    public String getPlayerName() {
        return playerName;
    }

    //Setzen des Spielernamens
    public void setPlayerName(String name) {
        playerName = name;
    }

    //Erstellung des eigenen, mit Schiffen gefüllten, Spielfelds
    public void setOwnField(int fieldSize){
        ownField = new Field(fieldSize);
    }

    //Rückgabe des eigenen, mit Schiffen gefüllten, Spielfelds
    public char[][] getOwnField(){return ownField.getField();}

    //Erstellung des eigenen, mit Information über Treffer beim Gegner gefüllten, Spielfelds
    public void setOpponentField(int fieldSize){
        opponentField = new Field(fieldSize);
    }

    //Rückgabe des eigenen opponentInfoFIelds
    public char[][] getOpponentField(){return opponentField.getField();}

    // Setzen des übergebenen Characters character an der Position cord im ownField
    public void setCharAtPositionOwnField(char character, Coordinate cord){
        ownField.field[cord.positionY][cord.positionX] = character;
    }

    // Rückgabe des aktuell gesetzten Characters an der Position cord im ownField
    public char getCharAtPosition(Coordinate cord){
        char character;
        character = ownField.field[cord.positionY][cord.positionX];
        return character;
    }

    // Setzen des übergebenen Characters character an der Position cord im opponentInfoField
    public void setCharAtPositionOpponentInfoField(char character, Coordinate cord){
        opponentField.field[cord.positionY][cord.positionX] = character;
    }

    public char getCharAtPositionOpponentInfoField(Coordinate cord){
        char character;
        character = opponentField.field[cord.positionY][cord.positionX];
        return character;
    }

    //Erstellt eine Standardflotte laut DoD
    //Erstellt schiffe nacheinander, platziert diese am Feld (siehe setFleet(Fleet))
    public void setStandardFleet(){
        fleet.createStandardFleet(10, ownField.getField());
        //return fleet array filled with ship-objects
    }

    // Rückgabe der erstellten Standard-Flotte
    public Fleet getStandardFleet(){return this.fleet;}

    //prints both your own and the opponent field
    public void printFieldset(){
        //prints player.field
        //with characters defined in the DoD
        System.out.println("        Own Shipfield       |  Infofield about opponent");
        System.out.println("     A B C D E F G H I J    |     A B C D E F G H I J  ");
        System.out.println("   * * * * * * * * * * * *  |   * * * * * * * * * * * *");
        int x = 1;
        for(int i = 0 ; i < 10 ; i++) {
            if (x != 10) {
                System.out.print(x + "  " + "* ");
            }else{
                System.out.print(x + " " + "* ");
            }
            for (int j = 0; j < 10; j++) {
                System.out.print(ownField.field[i][j]);
                System.out.print(" ");
            }
            System.out.print("*  |");
            if (x != 10) {
                System.out.print(x + "  " + "* ");
            }else{
                System.out.print(x + " " + "* ");
            }
            for (int j = 0; j < 10; j++) {
                System.out.print(opponentField.field[i][j]);
                System.out.print(" ");
            }
            System.out.print("*");
            x++;
            System.out.println();
        }
        System.out.println("   * * * * * * * * * * * *  |   * * * * * * * * * * * *");
    }
}
