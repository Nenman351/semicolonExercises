package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AirConditionerTest {

    @Test
    public void isOnAirConditionerTest() {

        AirConditioner samsung = new AirConditioner();
        samsung.isOn(true);
        boolean isOn = samsung.isOn(true);
        assertTrue(isOn);
    }

    @Test
    public void isOffAirConditionerTest() {
        AirConditioner samsung = new AirConditioner();
        samsung.isOn(true);
        samsung.isOff(false);
        boolean isOff = samsung.isOff(false);
        assertFalse(isOff);
    }

    @Test
    public void increaseTemperature(){
        AirConditioner samsung = new AirConditioner();
        samsung.increaseTemperature(30);
        int temperature = samsung.showTemperature();
        assertEquals(30, temperature);

    }
    @Test
    public void decreaseTemperature(){
        AirConditioner samsung = new AirConditioner();
        samsung.increaseTemperature(25);
        samsung.decreaseTemperature(5);
        int temperature = samsung.showTemperature();
        assertEquals(20, temperature);
    }

    @Test
    public void whenIncreaseTemperatureBeyond30Test(){
        AirConditioner samsung = new AirConditioner();
        samsung.increaseTemperature(25);
        samsung.increaseTemperature(10);
        int temperature = samsung.showTemperature();
        assertEquals(30, temperature);
    }

    @Test
    public void whenDecreaseTemperatureBeyond16Test(){
        AirConditioner samsung = new AirConditioner();
        samsung.decreaseTemperature(20);
        samsung.decreaseTemperature(10);
        int temperature = samsung.showTemperature();
        assertEquals(16, temperature);
    }

}