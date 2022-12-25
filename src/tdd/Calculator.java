package tdd;


public class Calculator {
    public int addTwoNumbers(int num1, int num2) {
        return num1 + num2;
    }

    public int subtractTwoNumbers(int num1, int num2) {
        return num1 - num2;
    }

    public int divideTwoNumbers(int num1, int num2) {
        return num1 / num2;
    }

    public int multiplyTwoNumbers(int num1, int num2) {
        return num1 * num2;
    }

    public int squareRootOfANumber(int num) {
        return (int) Math.sqrt(num);
    }

    public int collectUserInput(int num1, int num2) {
        if(num1 <= 0 || num2 <= 0){
            System.out.printf("%s%n", "Invalid input" );
        }
        return num1 + num2;
    }
}
