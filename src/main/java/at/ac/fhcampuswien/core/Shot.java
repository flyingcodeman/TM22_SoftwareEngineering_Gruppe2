package at.ac.fhcampuswien.core;

public class Shot {

    public static final char SYMBOL_FAILED = '/';
    public static final char SYMBOL_HIT = 'X';
    public static final char SYMBOL_SHIP_SUNK = '#';
    public static final char SYMBOL_WATER = '~';

    public static final char SHIP_SIZE_TWO = '2';
    public static final char SHIP_SIZE_THREE = '3';
    public static final char SHIP_SIZE_FOUR = '4';
    public static final char SHIP_SIZE_FIVE = '5';


    public enum State { //Zustände des Schuss-Ergebnis
        reload, hit, miss, error
    }

    //Gibt den Zustand des Schuss-Ergebnisses zurück
    public State shootsAt (Coordinate coordinate, Player currentPlayer, Player currentOpponent) {
        State resultState;
        char character = currentOpponent.getCharAtPosition(coordinate);

        // Schuss trifft bereits beschossenes Feld, Treffer oder versenktes Schiff
        if (checkFieldAlreadyHit(character)) {
            resultState = State.reload; // Nochmaliges Schießen erlaubt
            // ToDo: Nochmaliges Schießen begrenzen
        } else if(checkFieldWater(character)){
            // Schuss ins Wasser = Vergebener Schuss
            currentPlayer.setCharAtPositionOpponentInfoField(SYMBOL_FAILED, coordinate); // Setzen des vergebenen Schusses im OpponentInfoField
            resultState = State.miss;
        } else if(checkFieldShip(character)) {
            // Abgebener Schuss trifft ein Schiff der Flotte
            // Setz das Zeichen beim currentPlayer.opponentInfoField und currentOpponent.ownField von ~ auf X
            currentOpponent.setCharAtPositionOwnField(SYMBOL_HIT, coordinate);
            currentPlayer.setCharAtPositionOpponentInfoField(SYMBOL_HIT, coordinate);

            //Checken, ob durch diesen Treffer das gesamte Schiff versenkt wurde
            if(currentOpponent.fleet.checkIfShipSunk(coordinate)){
                System.out.println("Hit and ship sunk!"); //TODO move to GUI
                //ToDo: Im Falle des Versenkens: Zeichen des gesamten Schiffs beim currentPlayer.opponentInfoField und currentOpponent.OwnField auf # setzen
            }
            // Checken, ob durch diesen Treffer die gesamte Flotte versenkt wurde und das Spiel damit endet!
            if(currentOpponent.fleet.checkIfFleetSunk()){
                currentOpponent.gameOver = true;
            }
            resultState = State.hit; // Setzen des Trefferstatus
        } else {
            // invalider schuss
            // ToDo: Catch Error!
            resultState = State.error;
        }

        return resultState; // Rückgabe des Trefferstatus
    }

    private boolean checkFieldShip(char character) {
        return character == SHIP_SIZE_TWO || character == SHIP_SIZE_THREE || character == SHIP_SIZE_FOUR || character == SHIP_SIZE_FIVE;
    }

    private boolean checkFieldWater(char character) {
        return character == SYMBOL_WATER;
    }

    private boolean checkFieldAlreadyHit(char character) {
        return character == SYMBOL_FAILED || character == SYMBOL_HIT || character == SYMBOL_SHIP_SUNK;
    }
}
