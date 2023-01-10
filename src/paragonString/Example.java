package paragonString;

import java.util.Arrays;

public class Example {
    public static void main(String[] args) {
        char[] chars = new char[20];
        String string = "Semicolon Africa";
        string.getChars(2,10, chars, 12);

        System.out.println(Arrays.toString(chars));
    }
}
