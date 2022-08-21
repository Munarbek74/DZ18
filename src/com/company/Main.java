package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Person[] people = {
        new Person("Акпаров А", "Бишкек 7 мкр дом 49"),
        new Person("Акпарова Р", "Бишкек 7 мкр дом 49"),
        new Person("Акпаров Н", "Бишкек 7 мкр дом 49"),
        new Person("Асанов У", "Бишкек 4 мкр дом 21"),
        new Person("Асанова Б", "Бишкек 4 мкр дом 21"),
        new Person("Асанова З", "Бишкек 4 мкр дом 21"),
        new Person("Маликов А", "Бишкек 3 мкр дом 1"),
        new Person("Маликова С", "Бишкек 3 мкр дом 1"),
        new Person("Маликов Г", "Бишкек 3 мкр дом 1"),
        new Person("Садыков А", "Бишкек 3 мкр дом 2"),
        new Person("Садыкова З", "Бишкек 3 мкр дом 2"),
        new Person("Садыков А", "Бишкек 3 мкр дом 2"),
        new Person("Даиров А", "Бишкек 5 мкр дом 1"),
        new Person("Даирова Ч", "Бишкек 5 мкр дом 1"),
        new Person("Даирова Ж", "Бишкек 5 мкр дом 1"),
        new Person("Сапаров А", "Бишкек 3 мкр дом 56"),
        new Person("Сапарова А", "Бишкек 3 мкр дом 56"),
        new Person("Сапаров Л", "Бишкек 3 мкр дом 56"),
        new Person("Каримов А", "Бишкек 6 мкр дом 1"),
        new Person("Каримова Т", "Бишкек 6 мкр дом 1"),
        new Person("Каримов В", "Бишкек 6 мкр дом 1"),
        new Person("Саттаров А", "Бишкек 10 мкр дом 1"),
        new Person("Саттарова Д", "Бишкек 10 мкр дом 1"),
        new Person("Орозов А", "Бишкек 9 мкр дом 1"),
        new Person("Орозова А", "Бишкек 9 мкр дом 1")
};
        Person[] people1 = new Person[9];
        Person[] people2 = new Person[8];
        Person[] people3 = new Person[8];

        for (int i = 0, j = 0, k =0, l =0; i < people.length; i++) {
            if (i>=0 && i<9) {
                people1[j] = people[i];
                j++;
            }
            if (i>8 && i<17) {
                people2[k] = people[i];
                k++;
            }
            if (i>16) {
                people3[l] = people[i];
                l++;
            }

        }


        Flat flats = new Flat(5000, people1);
        Hostel hostels = new Hostel(2500, people2);
        Hotel hotels = new Hotel(3500, people3);
        System.out.println(flats);
        flats.live();
        System.out.println("В квартирах живут " + people1.length + " человек");
        System.out.println(hostels);
        hostels.live();
        System.out.println("В общежитии живут " + people2.length + " человек");
        System.out.println(hotels);
        hotels.live();
        System.out.println("В гостинице живут " + people3.length + " человек");

    }
}
