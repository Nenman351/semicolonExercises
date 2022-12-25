package snacks.Assignment;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class OddElementTest {
    @Test
    public void checkingForOddElementsPositionTest(){
        int[] numbers = {2, 4, 6, 7, 8};
        int[] oddElements = OddElement.oddElement(numbers);
        int[] excepted = {2, 6, 8};
        assertEquals(Arrays.toString(excepted), Arrays.toString(oddElements));
    }

}