package tdd;

public class Arithmetic {

    public int sumOfThreeNumbers(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    public int averageOfThreeNumbers(int num1, int num2, int num3) {
        return (num1 + num2 + num3) / 3;
    }

    public int productOfThreeNumbers(int num1, int num2, int num3) {
        return num1 * num2 * num3;
    }

    public int smallestOfThreeNumbers(int num1, int num2, int num3) {
        int smallest = num1;
        if(num2 < smallest){
            smallest = num2;
            if(num3 < smallest){
                smallest = num3;
            }
        }
        return smallest;
    }

    public int largestOfThreeNumbers(int num1, int num2, int num3) {
        int largest = num1;
        if(num2 > largest){
            largest = num2;
            if(num3 > largest){
                largest = num3;
            }
        }
        return largest;
    }

    public int squareOfANumber(int num1) {
        return num1 * num1;
    }

    public int sumOfSquaresOfNumber(int num1, int num2) {
        return (num1 * num1) + (num2 * num2);
    }

    public int differencesOfASquareOfNumber(int num1, int num2) {
        return (num1 * num1) - (num2 * num2);
    }

    public int comparingIntegers(int num1) {
        int square = (num1 * num1);
        if(square < 100){
            System.out.print("Number is lesser than 100.");
        } else 
            if (square > 100) {
            System.out.print("Number is greater than 100.");
        } else {
            System.out.print("Number is equal to 100.");
        }
        return num1 * num1;
    }
}
