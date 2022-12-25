package exceptionHandling;

public class BeansMessenger {

    public Beans buyBeans(int amount, int numberOfSpoons, boolean moneyIsFake, boolean withOmiEwa){

//        verify(moneyIsFake);
        verifyValidPrice(amount, numberOfSpoons);
         return  buyBeans(numberOfSpoons, withOmiEwa);
    }

    private Beans buyBeans(int numberOfSpoons, boolean withOmiEwa){
        return  new Beans(numberOfSpoons, withOmiEwa);
    }
    public void verifyValidPrice(int amount, int numberOfSpoons){
        int price = 50;
        if (numberOfSpoons * price > amount) throw new IllegalArgumentException();

    }
//    public void verify(boolean moneyIsFake){
//        try{
//            verifyValidPrice(amount, numberOfSpoons);
//        }
//        catch (IllegalArgumentException e){
//
//        }
//
//    }
}
