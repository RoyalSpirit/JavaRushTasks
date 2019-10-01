package com.javarush.task.task01.task0136;

/* 
Да хоть на Луну!
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(getWeight(888));
    }

    public static double getWeight(int earthWeight) {
        double weight;
        weight = (earthWeight * 17.00) / 100.00;
        return weight;
        //напишите тут ваш код
    }
}