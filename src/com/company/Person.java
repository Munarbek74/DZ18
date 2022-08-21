package com.company;

public class Person implements Housing{
    public String man;
    public String address;

    public Person(String man, String address) {
        this.man = man;
        this.address = address;
    }

    @Override
    public void live() {

    }

    public String getPeople() {
        return man;
    }

    public void setPeople(String  people) {
        this.man = people;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "man='" + man + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
