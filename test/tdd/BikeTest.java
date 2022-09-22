package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BikeTest {

    @Test
    public void itCanBeTurnedOnBikeTest() {
        Bike suzuki = new Bike();
        suzuki.turnedOn(true);
        boolean turnedOn = suzuki.turnedOn(true);
        assertTrue(turnedOn);
    }

    @Test
    public void itCanBeTurnedOffBikeTest() {
        Bike suzuki = new Bike();
        suzuki.turnedOn(true);
        suzuki.turnedOff(false);
        boolean turnedOff = suzuki.turnedOff(false);
        assertFalse(turnedOff);
    }

    @Test
    public void accelerateBikeGear1() {
        Bike suzuki = new Bike();
        suzuki.turnedOn(true);
        suzuki.setAcceleration(1);
        assertEquals(2, suzuki.getAcceleration());
    }

    @Test
    public void accelerateBikeGear2() {
        Bike suzuki = new Bike();
        suzuki.setAcceleration(2);
        suzuki.getAcceleration();
        assertEquals(4, suzuki.getAcceleration());
    }

    @Test
    public void accelerateBikeGear3() {
        Bike suzuki = new Bike();
        suzuki.setAcceleration(3);
        suzuki.getAcceleration();
        assertEquals(6, suzuki.getAcceleration());
    }

    @Test
    public void accelerateBikeGear4() {
        Bike suzuki = new Bike();
        suzuki.setAcceleration(4);
        suzuki.getAcceleration();
        assertEquals(8, suzuki.getAcceleration());
    }

    @Test
    public void decelerateBikeGear4(){
        Bike suzuki = new Bike();
        suzuki.turnedOn(true);
        suzuki.setAcceleration(4);
        suzuki.setDeceleration(4);
        assertEquals(0, suzuki.getDeceleration());
    }

    @Test
    public void decelerateBikeGear3(){
        Bike suzuki = new Bike();
        suzuki.turnedOn(true);
        suzuki.setAcceleration(3);
        suzuki.setDeceleration(3);
        assertEquals(0, suzuki.getDeceleration());
    }

    @Test
    public void decelerateBikeGear2(){
        Bike suzuki = new Bike();
        suzuki.turnedOn(true);
        suzuki.setAcceleration(2);
        suzuki.setDeceleration(2);
        assertEquals(0, suzuki.getDeceleration());
    }

    @Test
    public void decelerateBikeGear1(){
        Bike suzuki = new Bike();
        suzuki.turnedOn(true);
        suzuki.setAcceleration(1);
        suzuki.setDeceleration(1);
        assertEquals(0, suzuki.getDeceleration());
    }

}