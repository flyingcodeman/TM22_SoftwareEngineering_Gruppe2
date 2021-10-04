package at.ac.fhcampuswien;

public class Shot {

    public enum State { //Zustände des Schuss-Ergebnis
        reload, hit, miss, error
    }

    //Gibt den Zustand des Schuss-Ergebnisses zurück
    public State shootsAt (Coordinate coordinate, Player currentPlayer, Player currentOpponent) {
        State resultState;
        char character = currentOpponent.getCharAtPosition(coordinate);

        // Schuss trifft bereits beschossenes Feld, Treffer oder versenktes Schiff
        if (character == '/' || character == 'X' || character == '#') {
            resultState = State.reload; // Nochmaliges Schießen erlaubt
            // ToDo: Nochmaliges Schießen begrenzen
        }
        else if(character == '~'){
            // Schuss ins Wasser = Vergebener Schuss
            currentPlayer.setCharAtPositionOpponentInfoField('/', coordinate); // Setzen des vergebenen Schusses im OpponentInfoField
            resultState = State.miss;
        }
        else if (character == '2' || character == '3' || character == '4'|| character == '5') {
            // Abgebener Schuss trifft ein Schiff der Flotte
            // Setz das Zeichen beim currentPlayer.opponentInfoField und currentOpponent.ownField von ~ auf X
            currentOpponent.setCharAtPositionOwnField('X', coordinate);
            currentPlayer.setCharAtPositionOpponentInfoField('X', coordinate);

            //Checken, ob durch diesen Treffer das gesamte Schiff versenkt wurde
            if(currentOpponent.fleet.checkIfShipSunk(coordinate)){
                System.out.println("Hit and ship sunk!");
                //ToDo: Im Falle des Versenkens: Zeichen des gesamten Schiffs beim currentPlayer.opponentInfoField und currentOpponent.OwnField auf # setzen
            }
            // Checken, ob durch diesen Treffer die gesamte Flotte versenkt wurde und das Spiel damit endet!
            if(currentOpponent.fleet.checkIfFleetSunk()){
                currentOpponent.gameOver = true;
            }

            resultState = State.hit; // Setzen des Trefferstatus
        }
        else {
            // invalider schuss
            // ToDo: Catch Error!
            resultState = State.error;
        }

        return resultState; // Rückgabe des Trefferstatus
    }
}
