package tdd;

public class Bike {
    private boolean turnedOn;
    private int gear;
    private int acceleration;
    private int deceleration;

    public boolean turnedOn(boolean True) {
        boolean turnedOn = true;
        return turnedOn;
    }


    public boolean turnedOff(boolean False) {
        boolean turnedOff = false;
        return turnedOff;
    }

    public int getAcceleration(){
        return acceleration;
}

    public void setAcceleration(int gear) {
        if(gear == 1){
            acceleration = gear +1;
        }
        if(gear == 2){
            acceleration = gear +2;
        }
        if(gear == 3){
            acceleration = gear +3;
        }
        if(gear == 4){
            acceleration = gear +4;
        }
    }

    public void setDeceleration(int gear) {
        if(gear == -4){
            int deceleration = gear + 4;
        }
        if(gear == -3){
            int deceleration = gear +3;
        }
        if(gear == -2){
            int deceleration = gear +2;
        }
        if(gear == -1){
            int deceleration = gear +1;
        }
    }

    public int getDeceleration() {
        return deceleration; }


}
