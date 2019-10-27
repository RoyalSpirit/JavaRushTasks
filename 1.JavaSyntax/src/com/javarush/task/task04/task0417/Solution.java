package com.javarush.task.task04.task0417;

/* 
Существует ли пара?
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());

        if (a == b && b == c && c == a) {
            System.out.print(a + " ");
            System.out.print(b + " ");
            System.out.print(c);
        } else if (a == b && (b != c || c != a)) {
            System.out.print(a + " ");
            System.out.print(b);
        } else if (b == c && (a != b || a != c)) {
            System.out.print(b + " ");
            System.out.print(c);
        } else if (a == c && (a != b || b != c)) {
            System.out.print(a + " ");
            System.out.print(c);
        }


    }
}