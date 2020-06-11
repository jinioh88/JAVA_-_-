package com.example.java_design.ch1;

public class Person {
    private Phone homePhones;
    private Phone officePhone;

    public Person(Phone homePhones, Phone officePhone) {
        this.homePhones = homePhones;
        this.officePhone = officePhone;
    }
}
