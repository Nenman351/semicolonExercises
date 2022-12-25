package hms;

public enum Type {
    EXECUTIVE(15000), CHEAP(10000), AWOYAYA(300);


    private final int price;

    Type(int price){
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}
