package com.company;

import java.util.Arrays;

public class Hotel implements Housing {
    public double rent;
    public Person[] family;

    public Person[] getFamily() {
        return family;
    }

    public void setFamily(Person[] family) {
        this.family = family;
    }

    public Hotel(double rent, Person[] family) {
        this.rent = rent;
        this.family = family;
    }

    @Override
    public void live() {
        System.out.println("В отеле живут командированные на долгий срок семьи");
    }

    public double getRent() {
        return rent;
    }

    public void setRent(double rent) {
        this.rent = rent;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "rent=" + rent +
                ", family=" + Arrays.toString(family) +
                '}';
    }
}
