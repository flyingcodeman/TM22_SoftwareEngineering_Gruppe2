package at.ac.fhcampuswien.core;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FieldTest {

    @Test
    void generateField_Standard10() {
        Field field = new Field(10);
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
    void getOwnFieldAxisTest() { //TC-39
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


    // Testcode für TSV-38 : Field-Sizes 15, 18, 20, 30, 35, 40, 45, 48, 50
    @Test
    void generateField_flexibleSize15() {  // TSV-38 , testdriven , Mario
        Field field = new Field(15);
        assertEquals(15, field.getField().length);
        assertTrue(checkArrayFields(field.getField(), 15));
    }

    @Test
    void generateField_flexibleSize18() {  // TSV-38 , testdriven , Mario
        Field field = new Field(18);
        assertEquals(18, field.getField().length);
        assertTrue(checkArrayFields(field.getField(), 18));
    }

    @Test
    void generateField_flexibleSize20() {  // TSV-38 , testdriven , Mario
        Field field = new Field(20);
        assertEquals(20, field.getField().length);
        assertTrue(checkArrayFields(field.getField(), 20));
    }

    @Test
    void generateField_flexibleSize30() {  // TSV-38 , testdriven , Mario
        Field field = new Field(30);
        assertEquals(30, field.getField().length);
        assertTrue(checkArrayFields(field.getField(), 30));
    }

    @Test
    void generateField_flexibleSize35() {  // TSV-38 , testdriven , Mario
        Field field = new Field(35);
        assertEquals(35, field.getField().length);
        assertTrue(checkArrayFields(field.getField(), 35));
    }

    @Test
    void generateField_flexibleSize40() {  // TSV-38 , testdriven , Mario
        Field field = new Field(40);
        assertEquals(40, field.getField().length);
        assertTrue(checkArrayFields(field.getField(), 40));
    }

    @Test
    void generateField_flexibleSize45() {  // TSV-38 , testdriven , Mario
        Field field = new Field(45);
        assertEquals(45, field.getField().length);
        assertTrue(checkArrayFields(field.getField(), 45));
    }

    @Test
    void generateField_flexibleSize48() {  // TSV-38 , testdriven , Mario
        Field field = new Field(48);
        assertEquals(48, field.getField().length);
        assertTrue(checkArrayFields(field.getField(), 48));
    }

    @Test
    void generateField_flexibleSize50() {  // TSV-38 , testdriven , Mario
        Field field = new Field(50);
        assertEquals(50, field.getField().length);
        assertTrue(checkArrayFields(field.getField(), 50));
    }

}