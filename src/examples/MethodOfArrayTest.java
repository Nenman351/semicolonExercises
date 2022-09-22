package examples;

public class MethodOfArrayTest {
    public static void main(String[] args) {
        MethodOfArray array = new MethodOfArray();
        int[]numbers = {1,6,7,8,9};
        array.addTwoNumbers(numbers);
        System.out.println(array.addTwoNumbers(numbers));
        System.out.printf("%d",array.addTwoNumbers(numbers));
    }
}
