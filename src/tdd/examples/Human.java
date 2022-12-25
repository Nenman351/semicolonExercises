package tdd.examples;

public class Human {
    private String name;
    private int age;
    private String phoneNumber;
    private String emailAddress;

    public Human(String name, int age, String phoneNumber, String emailAddress) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
    }


    public void setName(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getEmailAddress() {
        return emailAddress;
    }









}
