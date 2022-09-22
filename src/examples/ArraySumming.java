package examples;

public class ArraySumming {
    public static void main(String[] args) {
        int [] arrays = {87,68,94,100,83,78,85,91,76,87};
        int total = 0;

        for(int counter =0; counter < arrays.length; counter++){
            total += arrays[counter];
        }
        System.out.println("Total of array elements is: " + total);
    }
}
