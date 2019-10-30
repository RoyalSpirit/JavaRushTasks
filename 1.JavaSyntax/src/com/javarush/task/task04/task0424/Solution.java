package com.javarush.task.task04.task0424;

/* 
Три числа
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String one = reader.readLine();
        String two = reader.readLine();
        String three = reader.readLine();

        if (one.equals(two)) {
            System.out.println("3");
        }
        else if (two.equals(three)) {
            System.out.println("1");
        }
        else if (three.equals(one)) {
            System.out.println("2");
        }


    }
}
