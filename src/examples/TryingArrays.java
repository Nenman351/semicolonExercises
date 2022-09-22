package examples;

public class TryingArrays {
    public static void main(String[] args) {
        String [] colours = new String[7];
        colours[0] = "maroon";
        colours[1] = "magenta";
        colours[2] = "red";
        colours[3] = "purple";
        colours[4] = "orange";
        colours[5] = "yellow";
        colours[6] = "blue";

        int index = 0;
        do{
            System.out.println(index + " " + colours[index]);
            index++;
        }while(index < colours.length);


    }
}

//this is another method of arrays for populating your index.
//    String [] colours = {"RED", "GREEN", "PURPLE", "ORANGE", "YELLOW", "MAGENTA","MAROON"};