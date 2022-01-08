package at.ac.fhcampuswien.core;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FieldTest {

    @Test
    void generateField_Standard10() { // TC-42 // TC-42.010
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

    @Test
    void getOwnFieldAxisTest() { //TC-39 // TC-39.020 // TC-39.030
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Player player1 = new Player("Test1");
        player1.setStandardFleet();
        player1.printFieldset();

        String xAxis = "A B C D E F G H I J";
        String yAxis6 = "6";
        String yAxis7 = "7";
        String yAxis8 = "8";
        String yAxis9 = "9";

        assertTrue(outContent.toString().contains(xAxis));
        assertTrue(outContent.toString().contains(yAxis6));
        assertTrue(outContent.toString().contains(yAxis7));
        assertTrue(outContent.toString().contains(yAxis8));
        assertTrue(outContent.toString().contains(yAxis9));

    }
}