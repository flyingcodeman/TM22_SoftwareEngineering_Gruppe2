package at.ac.fhcampuswien;

import java.util.Random;

public class Field {

    //VARIABLES
    public char[][] field;

    //METHODS

    //Erstellt ein quadratisches Standard-Feld in 10x10 mit char
    public void createField() {
        field = new char[10][10];
        //Füllen aller 100 Felder mit Wasser/~
        for(int x = 0; x<10; x++){
            for(int y = 0; y<10; y++){
                field[x][y] = '~';
            }
        }
    }

    //Erstellt ein quadratisches Feld in variabler Größe
    public void createField(int size) {
        field = new char[size][size];
        //Füllen aller Felder mit Wasser/~
        for(int x = 0; x<(size); x++){
            for(int y = 0; y<size; y++){
                field[x][y] = '~';
            }
        }
    }

    // Rückgabe des zuvor erstellten Felds field
    public char[][] getField(){
        return field;
    }

    public void printShipStats() {
        //prints how many ships on the field are hit and how many are sunk
        // Achtung!: sunk shouldn't be included in the hit count!
    }

    public boolean existActiveShips() {
    //checks if all ships have the value ship.sunk == true
    //if yes -> returns false
        return false;
    }

    public void printField() {
        // Gibt das aktuelle Feld auf der Console aus
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
}
