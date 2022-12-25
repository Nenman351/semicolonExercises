package exceptionHandling;

public class NumberNotFoundException extends RuntimeException{
    public NumberNotFoundException(String message){
        super(message);
    }
}
