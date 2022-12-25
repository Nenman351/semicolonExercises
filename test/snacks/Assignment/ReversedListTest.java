package snacks.Assignment;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ReversedListTest {
    @Test
    public void reversedListTest(){
        int[] numbers = {6, 5, 7, 8, 3};
        int[] reversedList = ReversedList.reversedList(numbers);
        int[] expectedList = {3, 8, 7, 5, 6};
        assertEquals(Arrays.toString(reversedList), Arrays.toString(expectedList));
    }
}