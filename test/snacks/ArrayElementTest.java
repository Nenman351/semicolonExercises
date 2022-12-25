package snacks;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ArrayElementTest {
    @Test
    public void swappingArrayTest(){
        int[] numbers = {1, 2};
        int[] swap = ArrayElement.takingArray(numbers);
        int[] expected = {2, 1};
        assertEquals(Arrays.toString(expected), Arrays.toString(swap));
    }

    @Test
    public void swapArrayTest(){
        int[] numbers = {1,2};
        int[] swap = ArrayElement.swapping(numbers);
        int[] expected = {2, 1};
        assertEquals(Arrays.toString(expected), Arrays.toString(swap));
    }

}