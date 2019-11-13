package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int someNumber = Integer.parseInt(reader.readLine());
        boolean chet = someNumber % 2 == 0;

        if (chet && (someNumber >= 1 && someNumber < 10)) {
            System.out.println("четное однозначное число");
        }
        else if (!chet && (someNumber >= 1 && someNumber < 10)) {
            System.out.println("нечетное однозначное число");
        }
        else if (chet && (someNumber > 9 && someNumber < 100)) {
            System.out.println("четное двузначное число");
        }
        else if (!chet && (someNumber > 9 && someNumber < 100)) {
            System.out.println("нечетное двузначное число");
        }
        else if (chet && (someNumber > 99 && someNumber <= 999)) {
            System.out.println("четное трехзначное число");
        }
        else if (!chet && (someNumber > 99 && someNumber <= 999)) {
            System.out.println("нечетное трехзначное число");
        }

    }
}
