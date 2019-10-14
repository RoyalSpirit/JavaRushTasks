package com.javarush.task.task03.task0319;

/* 
Предсказание на будущее
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {

      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
      String name = reader.readLine();
      int first = Integer.parseInt(reader.readLine());
      int second = Integer.parseInt(reader.readLine());
        System.out.println(name + " получает " + first + " через " + second + " лет.");

    }
}
