package at.ac.fhcampuswien;

public class Player {
    private String playerName;
    private Field ownField = new Field();
    private Field opponentField = new Field();
    private Player opponent;
    public Fleet fleet = new Fleet();

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

    public Player getOpponent() {
        return opponent;
    }

    //sets the name of a player
    public void setOpponent(Player opponent) {
        this.opponent = opponent;
    }

    //gives back the own field of the player
    public char[][] getOwnField(){
        return ownField.getField();
    }

    public void setOwnField(){
        ownField.createField();
    }

    //gives back the opponents own field
    public char[][] getOpponentField(){
        return opponentField.getField();
    }

    public char getCharFromOpponentFieldAtCoordinate(Coordinate cord, char [][] OpponentField) {
        //field.getCharAtPosition(cord);
        char character;
        character = OpponentField[cord.positionX][cord.positionX];
        return character;
    }

    public void setOpponentField(){
        opponentField.createField();
    }

    //gives back the fleet
    public void getFleet(){

    }

    public void setStandardFleet(){
        fleet.createStandardFleet(10, ownField.getField());
        //return fleet array filled with ship-objects
    }

    public Fleet createFleet() {
        //erstellt eine Standardflotte laut DoD
        //erstellt schiffe nacheinander, platziert diese am Feld (siehe setFleet(Fleet))
        return fleet;
    }

    //prints both your own and the opponent field
    public void printFieldset(){
        System.out.println("");
        System.out.println("Own Field with ships: ");
        System.out.println("");
        ownField.printField();
        System.out.println("");
        System.out.println("Info field about opponent ships and shots: ");
        System.out.println("");
        opponentField.printField();
    }

    public void makesShot(Shot shot) {

    }

    public void hasOpponent(Player player) {

    }

    public void hasField(Field field) {

    }

    public void hasFleet(Fleet fleet) {

    }

}
