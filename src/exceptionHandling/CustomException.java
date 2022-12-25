package exceptionHandling;

import java.time.LocalDateTime;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class CustomException {
    private  static final Scanner input = new Scanner(System.in);
    private static int[] numbers = {23, 25, 18, 90, 100};
    public static void main(String[] args) throws InterruptedException {

        System.out.println("Enter a number: ");
        int userInput = input.nextInt();
        try {
            verifyNumber(userInput);
        }catch (RuntimeException e){
            e.printStackTrace();
        }finally {
            System.out.println();
            System.out.println("Shutting down.");
            for (int i = 0; i < 10; i++){
                TimeUnit.SECONDS.sleep(2);
//                LocalDateTime.now().plusSeconds(2);
                System.out.println(".");
            }

        }
    }

    private static void verifyNumber (int userInput) throws NumberFormatException{

        for (int number: numbers){
            if (number == userInput){
                System.out.println("found");
                System.exit(0);
            }
        }
        throw new NumberNotFoundException("number you entered is not found");
    }
}
