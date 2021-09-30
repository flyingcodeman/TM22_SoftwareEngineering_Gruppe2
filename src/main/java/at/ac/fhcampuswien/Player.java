package at.ac.fhcampuswien;

public class Player {
    private String playerName;
    private Field ownField = new Field();
    private Field opponentField = new Field();
    public Fleet fleet = new Fleet();

    //Constructor
    public Player(String name){
        setPlayerName(name);
        setOwnField();
        setOpponentField();
    }

    public String getPlayerName(){return playerName;}

    public char[][] getOwnField(){return ownField.getField();}

    public char[][] getOpponentField(){return opponentField.getField();}

    public char getCharAtPosition(Coordinate cord){
        char character;
        character = ownField.field[cord.positionY][cord.positionX];
        return character;
    }

    public void getFleet(){}

    public void setPlayerName(String name) {playerName = name;}

    public void setOwnField(){ownField.createField();}

    public void setOpponentField(){opponentField.createField();}

    public void setStandardFleet(){
        fleet.createStandardFleet(10, ownField.getField());
        //return fleet array filled with ship-objects
    }

    //public Fleet createFleet() {
        //erstellt eine Standardflotte laut DoD
        //erstellt schiffe nacheinander, platziert diese am Feld (siehe setFleet(Fleet))

    //}

    public void hit(Coordinate coordinate){
        ownField.field[coordinate.positionY][coordinate.positionX] = 'X';
    }

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

    public void makesShot(Shot shot) {}

    public void hasOpponent(Player player) {}

    public void hasField(Field field) {}

    public void hasFleet(Fleet fleet) {}

}
