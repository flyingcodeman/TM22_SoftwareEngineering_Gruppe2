package at.ac.fhcampuswien;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class HelloWorldTest {


    @Test
    void testGetTen_GoodCase(){
        int actual = HelloWorld.get10();
        int expected = 10;
        assertEquals(expected, actual);

    }

    @Test
    void testGetTen_BadCase(){
        int actual = HelloWorld.get10();
        int expected = 11;
        assertNotEquals(expected, actual);
    }
}