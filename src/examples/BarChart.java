package examples;

public class BarChart {
    public static void main(String[] args) {
        int [] array = {0, 0, 0, 0, 0, 0, 1, 2, 4, 2, 1};
        System.out.println("Grade distribution:");

        for (int count = 0; count < array.length; count++){
            if(count == 10){
                System.out.printf("%5d: ", 100);
            }
            else {
                System.out.printf("%02d - %02d: ", count * 10, count * 10 + 9);
            }

            for (int stars = 0; stars < array[count]; stars++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
