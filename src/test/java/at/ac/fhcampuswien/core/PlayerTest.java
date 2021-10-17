package at.ac.fhcampuswien.core;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {

    @Test
    void printFieldSetTest() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Player player1 = new Player("Test1");
        //Player player2 = new Player("Test2");
        player1.setStandardFleet();
        player1.printFieldset();

        String expectedOut1 = "A B C D E F G H I J";
        String expectedOut2 = "2 2";
        String expectedOut3 = "3 3 3";

        assertTrue(outContent.toString().contains(expectedOut1));
        assertTrue(outContent.toString().contains(expectedOut2));
        assertTrue(outContent.toString().contains(expectedOut3));
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