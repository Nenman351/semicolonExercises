package exceptionHandling;

public class Beans {

    private int numberOfSpoons;
    private boolean withOmiEwa;

    public Beans(int numberOfSpoons, boolean withOmiEwa) {
        this.numberOfSpoons = numberOfSpoons;
        this.withOmiEwa = withOmiEwa;

    }

    public int getNumberOfSpoons() {
        return numberOfSpoons;
    }

    public void setNumberOfSpoons(int numberOfSpoons) {
        this.numberOfSpoons = numberOfSpoons;
    }

    public boolean isWithOmiEwa() {
        return withOmiEwa;
    }

    public void setWithOmiEwa(boolean withOmiEwa) {
        this.withOmiEwa = withOmiEwa;
    }
}
