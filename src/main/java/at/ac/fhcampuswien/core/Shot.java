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


    public enum State {
        reload, hit, miss, error
    }

    //Gibt den Zustand des Schuss-Ergebnisses zurück
    public State shootsAt (Coordinate coordinate, Player currentPlayer, Player currentOpponent) {
        State resultState = State.error;
        char charOpponentOwnField = currentOpponent.getCharAtPosition(coordinate);
        char charOpponentInfoField = currentPlayer.getCharAtPositionOpponentInfoField(coordinate);

        if (checkFieldWater(charOpponentInfoField)){
            // Noch nicht beschossenes Feld
            if(checkFieldShip(charOpponentOwnField)) {
                // Abgebener Schuss trifft ein Schiff der Flotte
                // Setz das Zeichen beim currentPlayer.opponentInfoField und currentOpponent.ownField von ~ auf X
                currentOpponent.setCharAtPositionOwnField(SYMBOL_HIT, coordinate);
                currentPlayer.setCharAtPositionOpponentInfoField(SYMBOL_HIT, coordinate);
                resultState = State.hit;
            }
            else if(checkFieldWater(charOpponentOwnField)) {
                // Schuss ins Wasser = Vergebener Schuss
                currentPlayer.setCharAtPositionOpponentInfoField(SYMBOL_FAILED, coordinate);
                resultState = State.miss;
            }
        }else if(checkFieldAlreadyHit(charOpponentInfoField)){
            //Bereits beschossenes Feld - Bitte noch mal!
            resultState = State.reload;
        }else{
            // Kein valider Char
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
