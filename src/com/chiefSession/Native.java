package com.chiefSession;

public class Native {

    private String nativeId;
    private String firstName;
    private String lastName;
    private static String chief = "Sam Immanuel";



    public Native(){

    }

    public Native(String firstName){
        this.firstName = firstName;
    }

    public Native(String firstName, String lastName){
        this(firstName);
        this.lastName = lastName;
    }

    public Native(String firstName, String lastName, String nativeId){
        this(firstName, lastName);
        this.nativeId = nativeId;
    }



    public String getNativeId() {
        return nativeId;
    }

    public void setNativeId(String nativeId) {
        this.nativeId = nativeId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public static String getChief() {
        return chief;
    }

    public static void setChief(String chief) {
        Native.chief = chief;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int countNatives(){
        return 1;
    }

    public int countNatives(String cohortName){
        int count = 0;
        if (cohortName.equals("paragon"))
            count = 37;
        return count;
    }

    public int countNatives(String cohortName, String hostel){
        int count = 0;
        if (cohortName.equals("paragon") && cohortName.equals("juno"))
            count = 5;

        return count;
    }

}
