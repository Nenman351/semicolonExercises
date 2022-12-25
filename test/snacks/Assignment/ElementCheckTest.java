package snacks.Assignment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ElementCheckTest {
    @Test
    public void checkThatAnElementIsInTheListTest(){
        int[] numbers = {3, 5, 6, 7};
        boolean check = ElementCheck.check(5,numbers);
        assertTrue(check);
    }

    @Test
    public void checkThatElementNotInListTest(){
        int[] numbers = {3, 4, 2, 6};
        boolean check = ElementCheck.check(8, numbers);
        assertFalse(check);
    }

}