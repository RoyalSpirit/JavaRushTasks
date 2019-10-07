package com.javarush.task.task03.task0303;

/* 
Обмен валют
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(convertEurToUsd(5,6.45));
        System.out.println(convertEurToUsd(7, 4.78));
    }

    public static double convertEurToUsd(int eur, double course) {
        double convert;
        convert = eur * course;
        return convert;

    }
}
