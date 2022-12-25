package tdd;

public class ArrayUtils {

    public static int[] reverseMethod(int[] userArray){
        int[] reverseArray = new int[userArray.length];
        int backCounter = userArray.length-1;
        int forwardCounter = 0;
        while (backCounter!=-1){
            reverseArray[forwardCounter++] = userArray[backCounter--];
        }
        return reverseArray;
    }

    public static String reverseString(String words) {
        String reversedString = " ";
        int backCounter = words.length()-1;
        while (backCounter != -1){
            reversedString += words.charAt(backCounter--);
        }
        return reversedString;
    }

    public static String firstCharacterAsAnUpperCase(String input) {
        String firstLetter = ("" + input.charAt(0)).toUpperCase();
        String otherLetters = "";
            for(int i =1; i < input.length(); i++){
                otherLetters += input.charAt(i);
            }
            return firstLetter+otherLetters.toLowerCase();
    }
}
