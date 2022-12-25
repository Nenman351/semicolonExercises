package snacks.Assignment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumElementTest {

    @Test
    public void sumOfArrayTest(){
        int[] numbers = {1, 2, 3, 4};
        int sum = SumElement.sumOfArray(numbers);
        assertEquals(10, sum);
    }

}