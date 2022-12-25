package com.chiefSession;

public class Turtle {
    private int xCoordinate;
    private int yCoordinate;
    private Cardinal direction = Cardinal.EAST;
    private Pen pen;


    public Turtle() {
    }

    public Turtle(int x, int y) {
        this.xCoordinate = x;
        this.yCoordinate = y;
    }

    public Turtle(int x, int y, Cardinal direction) {
        this(x, y);
        this.direction = direction;
    }

    public void changePenPosition(PenPosition position) {
        pen.setPosition(position);
    }


    public void moveForward(int numberOfSteps, int[][] floor) {
        if (direction.equals(Cardinal.EAST)) {
            this.xCoordinate += numberOfSteps - 1;
        }
    }

    public void moveForward(Cardinal movementDirection, int numberOfSteps, int[][] floor) {
        this.setDirection(movementDirection);
        if (direction.equals(Cardinal.EAST)) {
            if (PenPosition.DOWN.equals(getPen().getPosition())) {
                for (int i = 0; i < numberOfSteps; i++) {
                    floor[xCoordinate][yCoordinate] = 1;
                    yCoordinate++;
                }
            }
//            this.xCoordinate += numberOfSteps - 1;
        } else if (direction.equals(Cardinal.SOUTH)) {
            if (PenPosition.DOWN.equals(getPen().getPosition())) {
                for (int i = 0; i < numberOfSteps; i++) {
                    floor[xCoordinate][yCoordinate] = 1;
                    yCoordinate++;
                }
                yCoordinate--;
            }
//            this.yCoordinate += numberOfSteps - 1;
        } else if (direction.equals(Cardinal.WEST)) {
            if (PenPosition.DOWN.equals(getPen().getPosition())) {
                for (int i = 0; i < numberOfSteps; i++) {
                    floor[xCoordinate][yCoordinate] = 1;
                    xCoordinate--;
                }
                xCoordinate++;
            }
//            this.yCoordinate -= numberOfSteps - 1;
        } else if (direction.equals(Cardinal.NORTH))
            if (PenPosition.DOWN.equals(getPen().getPosition())) {
                for (int i = 0; i < numberOfSteps; i++) {
                    floor[xCoordinate][yCoordinate] = 1;
                    yCoordinate--;
                }
                yCoordinate++;
            }
    }
//            this.yCoordinate -=numberOfSteps -1;}
    public int getXCoordinate() {
        return xCoordinate;
    }

    public void setXCoordinate(int xCoordinate) {
        this.xCoordinate = xCoordinate;
    }

    public int getYCoordinate() {
        return yCoordinate;
    }

    public void setYCoordinate(int yCoordinate) {
        this.yCoordinate = yCoordinate;
    }

    public Cardinal getDirection() {
        return direction;
    }

    public void setDirection(Cardinal direction) {
        this.direction = direction;
    }

    public Pen getPen() {
        return pen;
    }

    public void setPen(Pen pen) {
        this.pen = pen;
    }
}
