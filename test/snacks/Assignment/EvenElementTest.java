package snacks.Assignment;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class EvenElementTest {

    @Test
    public void checkingForEvenElementTest(){
        int[] numbers = {1, 2, 3, 4, 5};
        int[] evenElement = EvenElement.evenElement(numbers);
        int[] expectedElement = {2, 4};
        assertEquals(Arrays.toString(expectedElement), Arrays.toString(evenElement));
    }

}