package com.company;

import java.util.Arrays;

public class Hostel implements Housing{
    public double rent;
    public Person[] family;

    public Hostel( double rent, Person[] family) {
        this.rent = rent;
        this.family = family;
    }

    public Person[] getFamily() {
        return family;
    }

    public void setFamily(Person[] family) {
        this.family = family;
    }

    @Override
    public void live() {
        System.out.println("Обжетие предназначена как для семейных пар, так и студентов");
    }

    public double getRent() {
        return rent;
    }

    public void setRent(double rent) {
        this.rent = rent;
    }

    @Override
    public String toString() {
        return "Hostel{" +
                "rent=" + rent +
                ", family=" + Arrays.toString(family) +
                '}';
    }
}
