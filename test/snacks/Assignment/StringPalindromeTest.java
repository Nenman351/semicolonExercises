package snacks.Assignment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringPalindromeTest {

    @Test
    public void palindromeTest(){
        String letter = "wow";
        String reservedString = StringPalindrome.palindrome(letter);
        assertEquals("It's a palindrome!", reservedString);
    }

    @Test
    public void notAPalindromeTest(){
        String word = "Baby";
        String reservedWord = StringPalindrome.palindrome(word);
        assertEquals("Not a palindrome! ", reservedWord);
    }

}