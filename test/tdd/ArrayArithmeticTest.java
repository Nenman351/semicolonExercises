package tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ArrayArithmeticTest {
    int[] numbers;

    @BeforeEach
    void setThisForAllTest(){
        int[] numbers = {5, 2, 3, 1, 4};
    }

    @Test
    public void sumOfTheArraysTest(){
        int sumArray = ArrayArithmetic.sumOfTheArray(numbers);
        assertEquals(15,sumArray);

    }

    @Test
    public void minimumOfTheArrayTest(){
        int minimumArray = ArrayArithmetic.minimumOfTheArray(numbers);
        assertEquals(1, minimumArray);
    }

    @Test
    public void maximumOfTheArrayTest(){
        int maximumArray = ArrayArithmetic.maximumOfTheArray(numbers);
        assertEquals(5, maximumArray);

    }

    @Test
    public void summingTheArrayAndReturningTheLowestSum(){
        int lowestSum = ArrayArithmetic.lowestSumOfArray(numbers);
        assertEquals(10, lowestSum);
    }

    @Test
    public void summingTheArrayAndReturningTheHighestSum(){
        int highestSum = ArrayArithmetic.highestSumOfArray(numbers);
        assertEquals(14, highestSum);
    }
}
