package examples;


public class AdditionOfTwoNumbersTest {
    public static void main(String[] args) {
        AdditionOfTwoNumbers sum = new AdditionOfTwoNumbers();
        System.out.println(sum.addTwoNumbers(2,3));

        System.out.println(sum.addTwoNumbers(2,3.0));

        System.out.println(sum.addTwoNumbers(2.3,2.3));

        System.out.printf("Sum is %d", sum.addTwoNumbers(10,20));
        System.out.println();
        System.out.println( sum.addTwoNumbers(3.5,4));
        System.out.println();

    }
}
