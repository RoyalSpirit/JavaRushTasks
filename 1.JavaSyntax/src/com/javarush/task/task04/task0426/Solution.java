package com.javarush.task.task04.task0426;

/* 
Ярлыки и числа
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(reader.readLine());
        boolean plusOrMinus = number < 0;
        if (number == 0) {
            System.out.println("ноль");
        } else if (!plusOrMinus && number % 2 > 0) {
            System.out.println("положительное нечетное число");
        } else if (!plusOrMinus && number % 2 == 0) {
            System.out.println("положительное четное число");
        } else if (plusOrMinus && number % 2 == 0){
            System.out.println("отрицательное четное число");
        }
        else {
            System.out.println("отрицательное нечетное число");
        }
    }
}
