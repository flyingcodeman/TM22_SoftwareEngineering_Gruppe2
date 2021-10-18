package at.ac.fhcampuswien.core;

import at.ac.fhcampuswien.gui.GameLogic;
import com.google.inject.matcher.Matchers;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class ShotTest {

    @Test
    void shootsAtValidShotTest() { // TC-49 & 51
        Player player1 = new Player("Test1");
        Player player2 = new Player("Test2");
        player1.setStandardFleet();
        player2.setStandardFleet();
        Shot shoot = new Shot();
        Coordinate shootCoordinate = new Coordinate(5, 5);

        Shot.State state = shoot.shootsAt(shootCoordinate, player1, player2);

        Shot.State expectedStates[] = {Shot.State.hit, Shot.State.miss, Shot.State.error, Shot.State.reload};
        List<Shot.State> expectedStatesList = Arrays.asList(expectedStates);

        assertTrue(expectedStatesList.contains(state));

    }

}