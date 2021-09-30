package at.ac.fhcampuswien;

public class Shot {

    private Coordinate target;
    private Player targetPlayer;

    public void shootsAt (Coordinate coordinate, Player player) {
        char[][] currentTargetField = player.getOwnField();
        if(currentTargetField[coordinate.positionY][coordinate.positionX] == '~'){
            System.out.println("WATER");
        }else if(currentTargetField[coordinate.positionY][coordinate.positionX] == 'X' ||
                currentTargetField[coordinate.positionY][coordinate.positionX] == '#'){
            System.out.println("Already shot!");
        }else if(currentTargetField[coordinate.positionY][coordinate.positionX] == '1' ||
                currentTargetField[coordinate.positionY][coordinate.positionX] == '2' ||
                currentTargetField[coordinate.positionY][coordinate.positionX] == '3' ||
                currentTargetField[coordinate.positionY][coordinate.positionX] == '4' ||
                currentTargetField[coordinate.positionY][coordinate.positionX] == '5'){
            System.out.println("HIT!");
            player.fleet.fleet[3].ship[1].position[0].shotAt = true;
            player.hit(coordinate);
        }
    }
}
