package TurtleGraphics;

import static TurtleGraphics.Direction.*;

public class Turtle {
    private Pen pen;
    private Direction currentDirection;
    private position currentPosition;

    public Turtle(){
        pen = new Pen();
        currentDirection = EAST;
        currentPosition = new position(0, 0);
    }

    public void penUp() {
        pen.penUp();
    }

    public boolean isPenUp() {
        return pen.isPenUp();
    }

    public void penDown() {
        pen.penDown();
    }

    public Direction getCurrentDirection() {
        return currentDirection;
    }

    public void turnRight() {
       switch (currentDirection){
          case NORTH -> face(EAST);
           case WEST -> face(NORTH);
           case SOUTH-> face(WEST);
           case EAST -> face(SOUTH);
       }
    }

    private void face(Direction direction){
        currentDirection = direction;
    }

    public void turnLeft() {
        switch (currentDirection){
            case SOUTH -> face(EAST);
            case WEST -> face(SOUTH);
            case NORTH -> face(WEST);
            case EAST -> face(NORTH);
        }
    }

    public position getCurrentPosition() {
        return currentPosition;
    }

    public void move(int numberOfSteps) {
        switch (currentDirection){
            case SOUTH -> currentPosition.setColumn(currentPosition.getColumn() -numberOfSteps);
            case WEST -> {
                currentPosition.setColumn(currentPosition.getColumn() +numberOfSteps);
            }
            case EAST -> currentPosition.setColumn(currentPosition.getColumn() +numberOfSteps);
        }
    }
}