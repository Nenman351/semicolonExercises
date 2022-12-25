package tdd;

import java.util.Random;


public class ShufflingAlgorithm {

    public static int[] shufflingMethod(int[] numbers, int length) {
        Random random = new Random();

         length = numbers.length;
        for(int i = length -1; i > 0; i--){
            int j = random.nextInt(i +1);

            numbers[i] = numbers [j];
        }

        return numbers;
    }

    public static int insertionSort(int[] numbers) {
        for (int i = 1; i < numbers.length; i++) {
            int current = numbers[i];
            int j = i - 1;
            while (j >= 0 && numbers[j] > current) {
                numbers[j + 1] = numbers[j];
                j--;
            }
            numbers[j + 1] = current;
        }
        return 0;
    }
}
