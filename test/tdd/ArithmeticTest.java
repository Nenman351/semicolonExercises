package tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArithmeticTest {

    Arithmetic arithmetic;

    @BeforeEach
    void setThisForAllTest(){
        arithmetic = new Arithmetic();
    }

    @Test
    void sum(){
        arithmetic.sumOfThreeNumbers(2,3,2);
        assertEquals(7,arithmetic.sumOfThreeNumbers(2,3,2));
    }

    @Test
    void average(){
        arithmetic.averageOfThreeNumbers(2,2,2);
        assertEquals(2,arithmetic.averageOfThreeNumbers(2,2,2));

    }

    @Test
    void product(){
        arithmetic.productOfThreeNumbers(2,2,2);
        assertEquals(8, arithmetic.productOfThreeNumbers(2,2,2));
    }

    @Test
    void smallest(){
        arithmetic.smallestOfThreeNumbers(1,5,6);
        assertEquals(1,arithmetic.smallestOfThreeNumbers(1,5,6));
    }

    @Test
    void largest(){
        arithmetic.largestOfThreeNumbers(7,8,9);
        assertEquals(9,arithmetic.largestOfThreeNumbers(7,8,9));
    }

    @Test
    void square(){
        arithmetic.squareOfANumber(2);
        assertEquals(4,arithmetic.squareOfANumber(2));
    }

    @Test
    void sumOfSquares(){
        arithmetic.sumOfSquaresOfNumber(2,2);
        assertEquals(8, arithmetic.sumOfSquaresOfNumber(2,2));
    }

    @Test
    void differencesOfASquareOfNumbers(){
        arithmetic.differencesOfASquareOfNumber(3,3);
        assertEquals(0, arithmetic.differencesOfASquareOfNumber(3,3));

    }

    @Test
    void comparingIntegers(){
        arithmetic.comparingIntegers(0);
        assertEquals(0,arithmetic.comparingIntegers(0));
    }
}
