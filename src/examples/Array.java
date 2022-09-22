package examples;

public class Array {
    public static void main(String[] args) {
        int[] arrays = {32, 27, 64, 18, 95, 14, 90, 70, 60, 37 };
        System.out.printf("%s%8s%n", "Index", "Value");

        for (int counter= 0; counter < arrays.length; counter++){
            System.out.printf("%5d%8d%n", counter, arrays[counter]);
        }
    }
}
