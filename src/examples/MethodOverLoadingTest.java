package examples;

public class MethodOverLoadingTest {
    public static void main(String[] args) {
        MethodOverLoading overload = new MethodOverLoading();
        overload.buyPizza("dodoPizza", 4000);
        System.out.println();
        System.out.println(overload.buyPizza());
        System.out.println(overload.buyPizza("Dominos"));
    }
}
