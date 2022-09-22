package tdd;
import java.util.Scanner;
public class Game {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number:");
        int number = input.nextInt();
        int guess = 70;

        if ( number > guess){
        System.out.println("To High");
    }
    else if(number < guess){
        System.out.println("To Low");
    }
    else {
        System.out.println("Perfect");
    }
    int count = 1;
    while(count <= 3){
        System.out.print(count+ " ");
        count++;
    }

    }

}
