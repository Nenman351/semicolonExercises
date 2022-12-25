package TurtleGraphics;

public class TurtleArray {
    public static void main(String[] args) {
//       int[][] arrays = new int[20][20];
      int[][] arrays =   {{0,0,1,0,0}, {0,1,0,0,1}, {1,1,0,0,0}, {0,1,0,0,1}, {1,0,1,0,0}};

        for (int[] array : arrays) {
            for (int j = 0; j < arrays.length; j++) {
//                if (arrays[i][j] == 0){
//                    System.out.print(" ");
//                }
                if (array[j] == 1) {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
