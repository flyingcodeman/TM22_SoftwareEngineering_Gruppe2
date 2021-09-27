package at.ac.fhcampuswien;

public class Player {
    private String name;
    private Field ownField;
    private Player opponent;

    public void makesShot(Shot shot) {

    }

    public void hasOpponent(Player player) {
        //
    }

    public void hasField(Field field) {
        //
    }

    public void hasFleet(Fleet fleet) {
        //
    }

    public void createsFleet() {
        //erstellt eine Standardflotte laut DoD
        //erstellt schiffe nacheinander, platziert diese am Feld (siehe setFleet(Fleet))
    }

    public void createsFleet(int shipcount) {
        //
    }

    public void createPlayer(String name) {
        //gibt dem Spieler einen Namen
        //etc
    }
}
