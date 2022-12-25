package tdd;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayUnitTest {

    @Test
    public void reversedArrayTest(){
        int[] numbers = {1,2,3,4,5};
        int[] reversedArray = ArrayUtils.reverseMethod(numbers);
        assertArrayEquals(new int[]{5, 4, 3, 2, 1}, reversedArray);
    }

    @Test
    public void reversedStringTest(){
        String words = "Adeleke";
        String reversed =ArrayUtils.reverseString(words);
        assertEquals(" ekeledA",reversed);

    }

//    @Test
//    public void reverseOneLineStringTest(){
//        String input = "Adeleke";
//        String output = ArrayUtils.oneLineReverse(input);
//        assertEquals("ekeledA",output);
//    }

    @Test
    public void returnTheFirstLetterAsAnUpperCaseTest(){
        String input = "jerry";
        String output = ArrayUtils.firstCharacterAsAnUpperCase(input);
        assertEquals("Jerry", output);
    }

    @Test
    public void returnTheOtherLettersToLowerCaseTest() {
        String input = "JERRY";
        String output = ArrayUtils.firstCharacterAsAnUpperCase(input);
        assertEquals("Jerry", output);
    }
}
