package examples;

public class AutoPolicy {
    private int accountNumber;
    private String makeAndModel1;
    private String state;

    public AutoPolicy(int accountNumber, String makeAndModel1, String state){
        this.accountNumber = accountNumber;
        this.makeAndModel1 = makeAndModel1;
        this.state = state;
    }

    public void setAccountNumber(int accountNumber){
        this.accountNumber = accountNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setMakeAndModel1(String makeAndModel1){
        this.makeAndModel1 = makeAndModel1;
    }

    public String getMakeAndModel1(){
        return makeAndModel1;
    }

    public void setState(String state){
        this.state = state;
    }

    public String getState(){
        return state;
    }
    public boolean isNoFaultState(){
        boolean noFaultState;

        switch (getState()){
            case "MA": case "NJ": case "PA":
              noFaultState = true;
              break;
            default:
                noFaultState = false;
                break;
        }

        return noFaultState;
    }
}
