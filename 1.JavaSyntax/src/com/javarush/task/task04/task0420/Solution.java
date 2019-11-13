package com.javarush.task.task04.task0420;

/* 
Сортировка трех чисел
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int first = Integer.parseInt(reader.readLine());
        int second = Integer.parseInt(reader.readLine());
        int third = Integer.parseInt(reader.readLine());

        if (first >= second && second >= third) {
            System.out.println(first + " " + second + " " + third);
        }
        else if (first >= third && second <= third) {
            System.out.println(first + " " + third + " " + second);
        }
        else if (second >= third && third >= first) {
            System.out.println(second + " " + third + " " + first);
        }
        else if (second >= first && first >= third) {
            System.out.println(second + " " + first + " " + third);
        }
        else if (third >= first && first >= second) {
            System.out.println(third + " " + first + " " + second);
        }
        else if (third >= second && second >= first) {
            System.out.println(third + " " + second + " " + first);
        }


    }
}
