package com.javarush.task.task04.task0413;

/* 
День недели
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int someDay = Integer.parseInt(reader.readLine());

        if (someDay == 1)
            System.out.println("понедельник");

        if (someDay == 2)
            System.out.println("вторник");

        if (someDay == 3)
            System.out.println("среда");

        if (someDay == 4)
            System.out.println("четверг");

        if (someDay == 5)
            System.out.println("пятница");

        if (someDay == 6)
            System.out.println("суббота");

        if (someDay == 7)
            System.out.println("воскресенье");

        if (someDay > 7) System.out.println("такого дня недели не существует");
        if (someDay < 1) System.out.println("такого дня недели не существует");


    }
}