package tdd;

public class Group2Craps {
    public static void main(String[] args) {

        Craps carps = new Craps();
        carps.rollDice();

        System.out.println("Roll a dice.");


                if (carps.sumOfDice ==7  ||  carps.sumOfDice == 11) {
                    System.out.printf("You rolled %d%n", carps.sumOfDice);
                    System.out.printf("You %s%n", carps.getStatus());
                }

                else if (carps.sumOfDice ==2 || carps.sumOfDice ==3 || carps.sumOfDice ==12) {
                    System.out.printf("You rolled %d%n", carps.sumOfDice);
                    System.out.printf(" You %s%n", carps.getStatus());
                }


                    else {
                        System.out.printf("You rolled %d%n", carps.sumOfDice);
                        System.out.printf("You can %s%n",carps.getStatus());

        }

    }
}
