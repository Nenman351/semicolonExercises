package DSA;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayListTest {

    @Test
    public void addItemListSizeIncreaseTest(){
        MyArrayList guitarStrings = new MyArrayList();
        guitarStrings.add("G-String");
        guitarStrings.add("F-String");
        assertEquals(2, guitarStrings.size());
    }

//    @Test
//    public void addOneItemByIndexTest(){
//        MyArrayList guitarStrings = new MyArrayList();
//        guitarStrings.add("G-String");
//        String result = guitarStrings.get(0);
//        assertEquals("G-String".result);
//    }
}
