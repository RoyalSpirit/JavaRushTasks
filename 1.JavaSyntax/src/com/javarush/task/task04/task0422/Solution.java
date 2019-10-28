package com.javarush.task.task04.task0422;

/* 
18+
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String someName = reader.readLine();
        int someAge = Integer.parseInt(reader.readLine());

        if (someAge < 18) {
            System.out.println("Подрасти еще");
        }

    }
}
