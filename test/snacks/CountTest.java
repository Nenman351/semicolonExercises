package snacks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountTest {

    @Test
    public void testThatCountNumberOfDigitInAnInput(){
        Count count = new Count();
        int digit = count.counting("ifhr");
        assertEquals(4,digit);
    }
}
