package tdd.examples;

import snacks.Assignment.StringPalindrome;

public class Native {
    private String name;
    private int age;
    private String phoneNumber;
    private String emailAddress;
    private String address;


    public Native(Human human){
        this.name = human.getName();
        this.age = human.getAge();
        this.phoneNumber = human.getPhoneNumber();
        this.emailAddress = human.getEmailAddress();
    }
}
