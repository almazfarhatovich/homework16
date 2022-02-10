package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Circle circle = new Circle();
        int number = 5;
        Circle.area(number);
        Circle.circumference(number);
    }
}



//    Circle деген класс тузунуз, анын PI деген свойствасы, area
//        жана circumference деген статик методдору болсун.
//        areaны табуу учун: PI * (radius * radius)
//        circumferenceти табуу учун PI * 2 * radius деген формулалар колдонулат