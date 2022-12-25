package tdd;

public class FillArray {

    public static int[] fillUpTheArray(int[] arr) {
        arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        return arr;
    }
}
