import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import tdd.Calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class CalculatorTest {
    Calculator calculator;

    @BeforeEach
    void startAllTestWith(){
         calculator = new Calculator();
    }
    @Test
    void testThatObjectExist() {
        assertNotNull(calculator);
    }

    @Test
    void sum(){
        calculator.addTwoNumbers(2,3);
        assertEquals(5,calculator.addTwoNumbers(2,3));
    }

    @Test
    void subtract(){
        calculator.subtractTwoNumbers(20,10);
        assertEquals(10,calculator.subtractTwoNumbers(20,10));
    }

    @Test
    void divide(){
        calculator.divideTwoNumbers(8,2);
        assertEquals(4,calculator.divideTwoNumbers(8,2));
    }

    @Test
    void multiply(){
        calculator.multiplyTwoNumbers(3,2);
        assertEquals(6,calculator.multiplyTwoNumbers(3,2));
    }

    @Test
    void squareRoot(){
        calculator.squareRootOfANumber(4);
        assertEquals(2,calculator.squareRootOfANumber(4));
    }

    @Test
    void testThatUserCanNotInputANegativeInteger(){
        calculator.collectUserInput(0,0);
        assertEquals(0, calculator.collectUserInput(0,0));
    }




}
