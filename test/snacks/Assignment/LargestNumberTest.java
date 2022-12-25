package snacks.Assignment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LargestNumberTest {
    @Test
    public void largestNumberTest(){
        int[] numbers = {3, 4, 6, 7};
        int largest = LargestNumber.largest(numbers);
        assertEquals(7, largest);
    }

    @Test
    public void largeNumberSumTest(){
        int[] numbers = {3, 4, 6, 7};
        int sum = LargestNumber.largestSum(numbers);
        assertEquals(13, sum);
    }

}