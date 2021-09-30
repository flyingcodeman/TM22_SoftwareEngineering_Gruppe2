package at.ac.fhcampuswien;

public class Player {
    private String playerName;
    public Field ownField = new Field();
    private Field opponentField = new Field();
    //private Player opponent;
    public Fleet fleet = new Fleet();
    public boolean gameOver = false;

    //Constructor
    public Player(String name){
        setPlayerName(name);
        setOwnField();
        setOpponentField();
    }

    //gives back the name of the current player
    public String getPlayerName() {
        return playerName;
    }

    //sets the name of a player
    public void setPlayerName(String name) {
        playerName = name;
    }

    //public Player getOpponent() {return opponent;}

    //sets the name of a player
    //public void setOpponent(Player opponent) {this.opponent = opponent;}

    public char[][] getOwnField(){return ownField.getField();}

    public void setOwnField(){ownField.createField();
    }

    //gives back the opponents own field
    public char[][] getOpponentField(){
        return opponentField.getField();
    }
    public char getCharAtPosition(Coordinate cord){
        char character;
        character = ownField.field[cord.positionY][cord.positionX];
        return character;
    }

    public void setCharAtPositionOwnField(char character, Coordinate cord){
        ownField.field[cord.positionY][cord.positionX] = character;
    }

    public void setCharAtPositionOpponentInfoField(char character, Coordinate cord){
        opponentField.field[cord.positionY][cord.positionX] = character;
    }

    public char getCharFromOpponentFieldAtCoordinate(Coordinate cord, char [][] OpponentField) {
        //field.getCharAtPosition(cord);
        char character = OpponentField[cord.positionX][cord.positionX];
        return character;
    }

    public void setOpponentField(){
        opponentField.createField();
    }

    //gives back the fleet
    public void getFleet(){}

    public void setStandardFleet(){
        fleet.createStandardFleet(10, ownField.getField());
        //return fleet array filled with ship-objects
    }

    public Fleet createFleet() {
        //erstellt eine Standardflotte laut DoD
        //erstellt schiffe nacheinander, platziert diese am Feld (siehe setFleet(Fleet))
        return fleet;
    }


    public void hit(Coordinate coordinate){
        ownField.field[coordinate.positionY][coordinate.positionX] = 'X';
    }

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

    public void makesShot(Shot shot) {}

    public void hasField(Field field) {}

    public void hasFleet(Fleet fleet) {}

}
