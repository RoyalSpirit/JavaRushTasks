package com.javarush.task.task01.task0133;

/* 
Не думать о секундах…
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) {
        int secondsAfter15 = 0;
        System.out.println(someClass(1800));
    }

    public static int someClass(int seconds) {
        int a = seconds / 3600;
        int b = 3600 * a;
        int c = seconds - b;
        return c;
    }
}