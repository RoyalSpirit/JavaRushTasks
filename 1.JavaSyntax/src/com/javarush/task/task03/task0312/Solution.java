package com.javarush.task.task03.task0312;

/* 
Конвертируем время
*/

public class Solution {
    //напишите тут ваш код

    public static void main(String[] args) {
        System.out.println(convertToSeconds(3));
        System.out.println(convertToSeconds(7));

    }

    public static int convertToSeconds(int hour) {
        return hour * 3600;
    }
}
