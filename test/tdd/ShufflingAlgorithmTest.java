package tdd;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class ShufflingAlgorithmTest {

    @Test
    public void checkingThatArrayIsShuffledTest(){
        int[] numbers = {1,2,3,45,6,7,8,9,10};
        int length = numbers.length;
        int[] shuffle = ShufflingAlgorithm.shufflingMethod(numbers,length);
        assertNotEquals(new int[] {5, 6, 7, 3, 2, 9}, numbers);
        System.out.println(Arrays.toString(numbers));
    }

    @Test
    public void checkingThatArrayIsInsertedAtTheRightIndex(){
        int[] numbers = {8, 4, 2, 3, 1};
        int insert = ShufflingAlgorithm.insertionSort(numbers);
        assertNotEquals(new int[] {}, numbers);
        System.out.println(Arrays.toString(numbers));
    }
}
