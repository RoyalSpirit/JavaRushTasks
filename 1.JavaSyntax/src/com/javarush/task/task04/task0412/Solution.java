package com.javarush.task.task04.task0412;

/* 
Положительное и отрицательное число
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int someNumber = Integer.parseInt(reader.readLine());

        if (someNumber > 0)
            System.out.println(someNumber * 2);

        if (someNumber < 0)
            System.out.println(someNumber + 1);

        if (someNumber == 0)
            System.out.println(0);
    }

}