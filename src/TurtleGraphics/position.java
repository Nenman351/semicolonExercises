package TurtleGraphics;

public class position {
    private int row;
    private int column;



    public position(int row, int column) {
        this.row = row;
        this.column = column;
    }

    @Override
    public String toString() {
        String toBeReturned = "";
        toBeReturned+= "row= " + row+ "\n";
        toBeReturned+= "column= " + column+ "\n";

        return toBeReturned;
//        return "position{" +
//                "row=" + row +
//                ", column=" + column +
//                '}';
    }

    @Override
    public boolean equals(Object o){
        position compared = (position) o;
        if (compared.row == this.row && compared.column == this.column)
            return true;
        else return false;
    }


    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }
}
