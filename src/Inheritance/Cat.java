package Inheritance;

public class Cat extends Animal{
    @Override
    public void speak(){
        System.out.println("Meow");
    }
    public void chaseMice(){
        System.out.println("Tom and Jerry");
    }
}
