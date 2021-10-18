package at.ac.fhcampuswien.core;

public class Field {

    public static final int SIZE = 10;

    public char[][] field;

    public Field() {

    }
    public Field(int size) {
        createField(size);
    }

    public void createField() {
        createField(SIZE);
    }

    public void createField(int size) {
        field = new char[size][size];
        for(int x = 0; x<(size); x++){
            for(int y = 0; y<size; y++){
                field[x][y] = Shot.SYMBOL_WATER;
            }
        }
    }

    public char[][] getField(){
        return field;
    }

}
