package at.ac.fhcampuswien.core;


public class Player {
    private String playerName;
    private Field ownField = new Field();
    private Field opponentField = new Field();
    public Fleet fleet = new Fleet();

    public Player(String name){
        setPlayerName(name);
        setOwnField();
        setOpponentField();
    }

    public String getPlayerName() {
        return playerName;
    }
    public void setPlayerName(String name) {
        playerName = name;
    }
    public void setOwnField(){ownField.createField();}
    public char[][] getOwnField(){return ownField.getField();}
    public void setOpponentField(){opponentField.createField();}
    public char[][] getOpponentField(){return opponentField.getField();}

    public void setCharAtPositionOwnField(char character, Coordinate cord){
        ownField.field[cord.getPositionY()][cord.getPositionX()] = character;
    }

    public char getCharAtPosition(Coordinate cord){
        char character;
        character = ownField.field[cord.getPositionY()][cord.getPositionX()];
        return character;
    }

    public void setCharAtPositionOpponentInfoField(char character, Coordinate cord){
        opponentField.field[cord.getPositionY()][cord.getPositionX()] = character;
    }

    public char getCharAtPositionOpponentInfoField(Coordinate cord){
        char character;
        character = opponentField.field[cord.getPositionY()][cord.getPositionX()];
        return character;
    }

    public void setShipSunk(Player currentPlayer, Player currentOpponent, Coordinate givenShootCoordinate){
        Coordinate coordinateToHit = new Coordinate(0,0);
        for (int i = 0; i < 10; i++) { // Iteration über alle Schiffe der Flotte
            for (int j = 0; j < currentOpponent.fleet.fleet[i].ship.length; j++) { // Iteration über alle shipParts des aktuell ausgewählten Schiffs
                int posX = currentOpponent.fleet.fleet[i].ship[j].position.getPositionX();
                int posY = currentOpponent.fleet.fleet[i].ship[j].position.getPositionY();
                if ((posX == givenShootCoordinate.getPositionX()) && (posY == givenShootCoordinate.getPositionY())) { // Welches Schiffpart wurde mit der shotCoordinate getroffen?
                    for (int k = 0; k < currentOpponent.fleet.fleet[i].ship.length; k++) { // Wurde alle Schiffsteile des Schiffs bereits getroffen?
                        int posXtoHit = currentOpponent.fleet.fleet[i].ship[k].position.getPositionX();
                        int posYtoHit = currentOpponent.fleet.fleet[i].ship[k].position.getPositionY();
                        coordinateToHit.setNewCoordinates(posXtoHit, posYtoHit);

                        currentOpponent.setCharAtPositionOwnField('#', coordinateToHit);
                        currentPlayer.setCharAtPositionOpponentInfoField('#', coordinateToHit);
                    }
                }
            }
        }
    }

    public void setStandardFleet(){fleet.createStandardFleet(ownField);}

    public Fleet getStandardFleet(){return this.fleet;}

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
