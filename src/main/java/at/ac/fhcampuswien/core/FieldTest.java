package at.ac.fhcampuswien.core;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FieldTest {

    @Test
    void generateField_Standard10() {
        Field field = new Field(10);
        field.createField();
        assertEquals(10, field.getField().length);
        assertTrue(checkArrayFields(field.getField(), 10));
    }

    boolean checkArrayFields(char[][] checkField, int size){
        int counter = 0;
        for(int x = 0; x<checkField.length; x++){
            for(int y = 0; y<checkField.length; y++){
                if(checkField[x][y] == '~'){
                    counter++;
                }
            }
        }
        if(counter == size * size){
            return true;
        }else{
            return false;
        }
    }
}