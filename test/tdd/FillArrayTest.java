package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class FillArrayTest {
    @Test
    public void fillingTheArrayTest(){
        int[] arr = new int[10];
        arr = FillArray.fillUpTheArray(arr);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, arr);
    }

}
