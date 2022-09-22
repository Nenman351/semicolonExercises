package examples;

public class MethodOfArray {
    public int addTwoNumbers(int[]numbers){
        int sum = 0;

        for(int i = 0; i < numbers.length; i++){
            sum += numbers[i];
            //enhanced for loop
            //for(int number : numbers){
            //sum += i;
        }
            return sum;
    }
}
