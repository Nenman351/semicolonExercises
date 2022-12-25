package Inheritance;

import org.junit.jupiter.api.Test;

public class AnimalTest {
    @Test
    public void speakTest(){
        Dog aja = new Dog();
        aja.speak();
        aja.eat();
    }

    @Test
    public void polymorphismTest(){
        Animal aja = new Goat();
        Goat myGoat = (Goat) aja;
        aja.speak();
        myGoat.speak();

        Movable movable = new Dog();
    }
}