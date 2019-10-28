package com.javarush.task.task04.task0423;

/* 
Фейс-контроль
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String someName = reader.readLine();
        int someAge = Integer.parseInt(reader.readLine());

        if (someAge > 20) {
            System.out.println("И 18-ти достаточно");
        }

    }
}
