package tdd;

import java.security.SecureRandom;

public class Craps {
    SecureRandom randomNumber = new SecureRandom();

    private int myPoint;

    public Status playerStatus;
    public int sumOfDice;
    public int playerPoint;

    public void rollDice(){
        int die1 = 1 + randomNumber.nextInt(6);
        int die2 = 1 + randomNumber.nextInt(6);

        sumOfDice = die1 + die2;
    }


    public enum Status{WIN, LOSE, CONTINUE};

    public Status getStatus(){
        switch(sumOfDice){
            case 7:
            case 11:
                playerStatus = Status.WIN;
                break;

            case 2:
            case 3:
            case 12:
                playerStatus = Status.LOSE;
                break;

            case 4:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
                playerStatus = Status.CONTINUE;
                break;

            default:{
                sumOfDice = playerPoint;
                do{
                    playerStatus = Status.CONTINUE;

                    System.out.println("Sum:\t" + sumOfDice + "\n");
                } while(sumOfDice != 7 && sumOfDice != playerPoint);

                if (sumOfDice == playerPoint)
                System.out.println("You Win.");
                else
                    System.out.println("you Lose.");
            }
        }
        return playerStatus;
    }
    public int getMyPoint(){
        return myPoint;
    }
}
