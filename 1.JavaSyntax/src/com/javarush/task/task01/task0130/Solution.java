package com.javarush.task.task01.task0130;

/* 
Наш первый конвертер!
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(convertCelsiusToFahrenheit(41));

    }

    public static double convertCelsiusToFahrenheit(int celsius) {
        double faren = 5.0 / 9.0;
        return celsius / faren + 32;
    }
}