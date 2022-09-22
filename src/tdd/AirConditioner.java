package tdd;

import java.util.function.Supplier;

public class AirConditioner {
    private boolean isOn;
    private int temperature;


    public boolean isOn(boolean True) {
        boolean isOn = true;
        return isOn;

    }

    public boolean isOff(boolean False) {

        return False;
    }


    public void increaseTemperature(int increase) {
        temperature = temperature + increase;
        if (temperature > 30){
            temperature = 30;
        }
    }

    public int showTemperature() {
        return temperature;
    }

    public void decreaseTemperature(int decrease) {
        temperature = temperature - decrease;
        if (temperature < 16){
            temperature = 16;
        }

    }
}
