package snacks.Assignment;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SummingArrayTest {

    @Test
    public void sumOfArrayTest(){
        int[] numbers = {1, 2, 3, 4};
        int sum = SummingArray.sumWithForLoop(numbers);
        assertEquals(10, sum);
    }

    @Test
    public void sumOfArrayUsingAWhileLoopTest(){
        int[] numbers = {1, 2, 3, 4};
        int sum = SummingArray.sumWithWhileLoop(numbers);
        assertEquals(10, sum);
    }

    @Test
    public void sumOfArrayUsingADoWhileLoopTest(){
        int[] numbers = {1, 2, 3, 4};
        int sum = SummingArray.sumWithDoWhileLoop(numbers);
        assertEquals(10, sum);
    }
}