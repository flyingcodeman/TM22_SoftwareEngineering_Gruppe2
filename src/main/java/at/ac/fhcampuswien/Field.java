package at.ac.fhcampuswien;

import java.util.Random;

public class Field {

    //private Player player;
    private int size;
    private char[][] field;

    public char[][] getField(){
        return field;
    }

    public void createField() {
        //creates Field with size 10
        field = new char[10][10];
        for(int x = 0; x<10; x++){
            for(int y = 0; y<10; y++){
                field[x][y] = '~';
            }
        }
    }

    public void createField(int size) {
        //creates Field with this.size
        field = new char[size][size];
        for(int x = 1; x<(size+1); x++){
            for(int y = 1; y<(size+1); y++){
                field[x][y] = '~';
            }
        }
    }

    //public void belongsTo(Player player) {
    //assigns Field to player
    //sets Field as player.ownField
    //}

    public void printShipStats() {
        //prints how many ships on the field are hit and how many are sunk
        // Achtung!: sunk shouldn't be included in the hit count!
    }

    //public boolean existActiveShips() {
    //checks if all ships have the value ship.sunk == true
    //if yes -> returns false
    //}

    public void printOwnField(char[][] field) {
        //prints player.field
        //with characters defined in the DoD
        System.out.println("     A B C D E F G H I J ");
        System.out.println("   * * * * * * * * * * * *");
        int x = 1;
        for(int i = 0 ; i < 10 ; i++) {
            if (x != 10) {
                System.out.print(x + "  " + "* ");
            }else{
                System.out.print(x + " " + "* ");
            }
            for (int j = 0; j < 10; j++) {
                System.out.print(field[i][j]);
                System.out.print(" ");
            }
            System.out.print("*");
            x++;
            System.out.println();
        }
        System.out.println("   * * * * * * * * * * * *");
    }

    public void printOpponentField() {
        //has to map the ships of the oponent that weren't hit so far to ~
        // with the characters defined in the DoDs
    }
}
