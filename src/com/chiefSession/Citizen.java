package com.chiefSession;

import java.math.BigDecimal;

public class Citizen {
    private String firstname;
    private String surname;
    private BigDecimal earnings;


    public Citizen(){}

    public Citizen(String firstname){
        this.firstname = firstname;
    }

    public Citizen(String firstname, String surname){
        this.firstname = firstname;
        surname = surname;
    }

    public Citizen(String firstname, String surname, BigDecimal earnings){
        this(firstname, surname);
        this.earnings = earnings;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public BigDecimal getEarnings() {
        return earnings;
    }

    public void setEarnings(BigDecimal earnings) {
        this.earnings = earnings;
    }
}
