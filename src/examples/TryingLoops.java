package examples;

public class TryingLoops {
    public static void main(String[] args) {
        //counter initialization.
        int counter = 1;
        //loop continuation condition
        while(counter <=5){
            System.out.printf("%s%d%n", "Hello, Cohort ",13);
            //incrementing
            counter++;
        }
        System.out.println();
        System.out.println("For Loop");
        for(int count = 5; count >=1; count--){
            System.out.println(count + " Enjoy your meal");
        }
        System.out.println();
        int counting = 1;
        do{
            System.out.println("Hello");
            counting++;
        }while(counting <= 5);


    }

}
