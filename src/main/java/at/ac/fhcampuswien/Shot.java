package at.ac.fhcampuswien;

public class Shot {

    private Coordinate target;
    private Player targetPlayer;
    public enum State {
        reload, hit, miss, error
    }

    //returns true if the shot was valid, returns false if invalid
    public State shootsAt (Coordinate coordinate, Player currentPlayer, Player currentOpponent) {
        State resultState;
        char[][] targetField = currentOpponent.getOwnField();
        char character = currentOpponent.getCharAtPosition(coordinate);
        if (character == '-' ||
            character == 'X' ||
            character == '#') {
            // already shot == invalid
            resultState = State.reload;
        }
        else if(character == '~'){
            currentPlayer.setCharAtPositionOpponentInfoField('-', coordinate);
            resultState = State.miss;
        }
        else if (character == '2' ||
                character == '3' ||
                character == '4'||
                character == '5') {
            // shot hits a ship
            // muss dem schiff, dass bei dem Opponent an der Coordinate coordinate steht sagen, dass es getroffen wurde ^^
            // setz das Zeichen beim player.opponentfield von ~ auf X o #
            currentOpponent.setCharAtPositionOwnField('X', coordinate);
            currentPlayer.setCharAtPositionOpponentInfoField('X', coordinate);
            if(currentOpponent.fleet.checkIfShipSunk(coordinate)){
                System.out.println("Treffer und Schiff VERSENKT");
            }
            if(currentOpponent.fleet.checkIfFleetSunk()){
                currentOpponent.gameOver = true;
            }
            resultState = State.hit;
        }
        else {
            // invalider schuss
            // ToDo: Catch Error!
            resultState = State.error;
        }
        return resultState;
    }
}
