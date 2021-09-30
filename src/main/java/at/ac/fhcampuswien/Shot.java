package at.ac.fhcampuswien;

public class Shot {

    private Coordinate target;
    private Player targetPlayer;

    //returns true if the shot was valid, returns false if invalid
    public boolean shootsAt (Coordinate coordinate, Player player) {
        char[][] field = (player.getOpponent()).getOwnField();
        char character = player.getCharFromOpponentFieldAtCoordinate(coordinate, field);
        if (character == '-' ||
            character == 'X' ||
            character == '#') {
            // schonmal geschossen == invalide
            System.out.println("You already shot there. Please try again");
            return false;
            }
        else if ( character == '2' ||
                character == '3' ||
                character == '4'||
                character == '5') {
            // shot hits a ship
            // muss dem schiff, dass bei dem Opponent an der Coordinate coordinate steht sagen, dass es getroffen wurde ^^
            // setz das Zeichen beim player.opponentfield von ~ auf X o #
            return true;
        }

        else {
            // invalider schuss da nicht wasser aber auch kein schiff von 2 - 5
            return false;
        }

    }
}
