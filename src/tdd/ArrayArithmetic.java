package tdd;

public class ArrayArithmetic {

    public static int sumOfTheArray(int[] numbers) {
        int sum = 0;
        for (int i = 0; i <= numbers.length; i++) {
            sum += i;
        }
        return sum;
    }

    public static int minimumOfTheArray(int[] numbers) {
        int minimum = numbers[0];
        for (int number : numbers) {
            if (minimum > number)
                minimum = number;
        }
        return minimum;
    }

    public static int maximumOfTheArray(int[] numbers) {
        int maximum = numbers[0];
        for (int number : numbers) {
            if (maximum < number)
                maximum = number;
        }
        return maximum;
    }

    public static int highestSumOfArray(int[] numbers) {
        int highestSum = sumOfTheArray(numbers) - minimumOfTheArray(numbers);

        return highestSum;
    }

    public static int lowestSumOfArray(int[] numbers) {
        int lowestSum = sumOfTheArray(numbers) - maximumOfTheArray(numbers);

        return lowestSum;
    }
}









//        if (numbers[1] < minimum)
//            minimum = numbers[1];
//        if(numbers[2] < minimum)

//            minimum = numbers[2];
//        if (numbers[3] < minimum)
//            minimum = numbers[3];
//
//        return minimum;