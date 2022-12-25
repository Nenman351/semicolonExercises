package TurtleGraphics;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static TurtleGraphics.Direction.*;
import static org.junit.jupiter.api.Assertions.*;

public class TurtleTest {
    private Turtle turtle;

    @BeforeEach
    public void setThisForAll(){
        turtle = new Turtle();
    }

    @Test
    public void turtleExistTest(){
        assertNotNull(turtle);
    }

    @Test
    public void turtleCanMovePenUp(){
        turtle.penUp() ;
        assertTrue(turtle.isPenUp());
    }

    @Test
    public void turtleCanMovePenDown(){
        turtle.penDown();
        assertFalse(turtle.isPenUp());
    }

    @Test
    public void turtleCanTurnRightWhileFacingEastTest(){
        assertEquals(EAST, turtle.getCurrentDirection());
        turtle.turnRight();
        assertEquals(SOUTH, turtle.getCurrentDirection());
    }

    @Test
    public void turtleCanTurnRightWhileFacingSouthTest(){
        turtle.turnRight();
        assertEquals(SOUTH, turtle.getCurrentDirection());
        turtle.turnRight();
        assertEquals(WEST, turtle.getCurrentDirection());
    }

    @Test
    public void turtleCanTurnRightFromTheCardinalPointTest(){
        turtle.turnRight();
        assertEquals(SOUTH, turtle.getCurrentDirection());
        turtle.turnRight();
        assertEquals(WEST, turtle.getCurrentDirection());
        turtle.turnRight();
        assertEquals(NORTH, turtle.getCurrentDirection());
        turtle.turnRight();
        assertEquals(EAST, turtle.getCurrentDirection());
    }

    @Test
    public void turtleCanTurnLeftFacingEastTest(){
        assertEquals(EAST, turtle.getCurrentDirection());
        turtle.turnLeft();
        assertEquals(NORTH, turtle.getCurrentDirection());
    }

    @Test
    public void turtleCanTurnLeftFacingNorthTest(){
        turtle.turnLeft();
        assertEquals(NORTH, turtle.getCurrentDirection());
        turtle.turnLeft();
        assertEquals(WEST, turtle.getCurrentDirection());
        turtle.turnLeft();
        assertEquals(SOUTH, turtle.getCurrentDirection());
        turtle.turnLeft();
        assertEquals(EAST, turtle.getCurrentDirection());
    }

    @Test
    public void turtleCanMoveForwardWhileFacingEastTest(){
        assertEquals(new position(0,0), turtle.getCurrentPosition());
        turtle.move(5);
        assertEquals(new position(0, 5), turtle.getCurrentPosition());
    }

    @Test
    public void turtleCanMoveForwardWhileFacingNorthTest(){
        assertEquals(new position(0, 0), turtle.getCurrentPosition());
        turtle.move(5);
        assertEquals(new position(0, 5), turtle.getCurrentPosition());
    }

    @Test
    public void turtleCanMoveForwardWhileFacingWestTest(){
        assertEquals(new position(0, 0), turtle.getCurrentPosition());
        turtle.move(5);
        assertEquals(new position(0, 5), turtle.getCurrentPosition());
    }

    @Test
    public void turtleCanMoveForwardWhileFacingSouthTest(){
        assertEquals(new position(0,0), turtle.getCurrentPosition());
        turtle.move(10);
        assertEquals(new position(0, 10), turtle.getCurrentPosition());
    }
}
