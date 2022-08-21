package com.company;


import java.util.Arrays;

public class Flat implements Housing{
    public double utilities;
    public Person[] family;

    public Person[] getFamily() {
        return family;
    }

    public void setFamily(Person[] family) {
        this.family = family;
    }

    public Flat(double utilities, Person[] family) {
        this.utilities = utilities;
        this.family = family;
    }

    @Override
    public void live() {
        System.out.println("Квартира состоит из 50 этажей");

    }

    @Override
    public String toString() {
        return "Flat{" +
                "utilities=" + utilities +
                ", family=" + Arrays.toString(family) +
                '}';
    }

    public double getUtilities() {
        return utilities;
    }

    public void setUtilities(double utilities) {
        this.utilities = utilities;
    }
}
