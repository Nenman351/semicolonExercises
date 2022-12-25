package com.chiefSession;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TurtleTest {
    private Turtle ijapa;
    private  Sketchpad sketchpad;

    @BeforeEach
    public void setUp(){
        ijapa = new Turtle();
        Pen biro = new Pen();
        sketchpad = new Sketchpad();
        ijapa.setPen(biro);
    }

    @Test
    public void changePosition(){
        assertEquals(PenPosition.UP, ijapa.getPen().getPosition());
        ijapa.changePenPosition(PenPosition.DOWN);
        assertEquals(PenPosition.DOWN, ijapa.getPen().getPosition());
    }

    @Test
    public void moveForward(){
        assertEquals(0, ijapa.getXCoordinate());
        assertEquals(0, ijapa.getYCoordinate());
        assertEquals(Cardinal.EAST, ijapa.getDirection());
        ijapa.moveForward(7, sketchpad.getFloor());
        assertEquals(6, ijapa.getXCoordinate());
        assertEquals(0, ijapa.getYCoordinate());
        assertEquals(Cardinal.EAST, ijapa.getDirection());

    }

    @Test
    public void changeDirection(){
        assertEquals(Cardinal.EAST, ijapa.getDirection());
        ijapa.setDirection(Cardinal.SOUTH);
        assertEquals(Cardinal.SOUTH, ijapa.getDirection());
    }

    @Test
    public void move(){
        ijapa.moveForward(12, sketchpad.getFloor());
        assertEquals(11, ijapa.getXCoordinate());
        assertEquals(0, ijapa.getYCoordinate());
        assertEquals(Cardinal.EAST, ijapa.getDirection());

        ijapa.moveForward(Cardinal.SOUTH, 12, sketchpad.getFloor());
        assertEquals(11, ijapa.getXCoordinate());
        assertEquals(11, ijapa.getYCoordinate());
        assertEquals(Cardinal.SOUTH, ijapa.getDirection());

        ijapa.moveForward(Cardinal.WEST, 12, sketchpad.getFloor());
        assertEquals(0, ijapa.getXCoordinate());
        assertEquals(11, ijapa.getYCoordinate());
        assertEquals(Cardinal.SOUTH, ijapa.getDirection());

        ijapa.moveForward(Cardinal.NORTH, 12, sketchpad.getFloor());
        assertEquals(0, ijapa.getXCoordinate());
        assertEquals(0, ijapa.getYCoordinate());
        assertEquals(Cardinal.NORTH, ijapa.getDirection());

        int[][] turtle = sketchpad.getFloor();
        for (int i = 0; i < sketchpad.getFloor().length; i++){
            for (int j = 0; j < sketchpad.getFloor().length; j++){
                if (turtle[i][j] == 1){
                    System.out.println("*");
                }else {
                    System.out.println(" ");
                }
            }
            System.out.println();
        }
    }
}
