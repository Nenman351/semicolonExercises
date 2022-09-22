package examples;

public class BreakTest {
    public static void main(String[] args) {
        int count;

        for(count = 1; count <= 10; count++){
            if(count == 5){
//                break;
                continue;
            }
            System.out.printf("%d ", count);
        }
//        System.out.printf("%nBroke out of loop at count = %d%n", count);
        System.out.printf("%nUsed continue to skip printing 5%n");
    }
}
