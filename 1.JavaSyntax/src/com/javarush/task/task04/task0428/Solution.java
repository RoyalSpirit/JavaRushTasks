package com.javarush.task.task04.task0428;

/* 
Положительное число
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int someNumber = Integer.parseInt(reader.readLine());
        int someNumber1 = Integer.parseInt(reader.readLine());
        int someNumber2 = Integer.parseInt(reader.readLine());

        boolean firstMinus = someNumber <= 0;
        boolean secondMinus = someNumber1 <= 0;
        boolean thirdMinus = someNumber2 <= 0;

        if (firstMinus == true && (secondMinus == true && thirdMinus == true)) {
            System.out.println(0);
        }
        else if (secondMinus == true && (firstMinus == true && thirdMinus == true)) {
            System.out.println(0);
        }
        else if (thirdMinus == true && (firstMinus == true && secondMinus == true)) {
            System.out.println(0);
        }


        else if (firstMinus == true && (secondMinus == false && thirdMinus == false)) {
            System.out.println(2);
        }
        else if (secondMinus == true && (firstMinus == false && thirdMinus == false)) {
            System.out.println(2);
        }
        else if (thirdMinus == true && (firstMinus == false && secondMinus == false)) {
            System.out.println(2);
        }


        else if (firstMinus == true && (secondMinus == true && thirdMinus == false)) {
            System.out.println(1);
        }
        else if (secondMinus == true && (firstMinus == true && thirdMinus == false)) {
            System.out.println(1);
        }
        else if (thirdMinus == true && (firstMinus == true && secondMinus == false)) {
            System.out.println(1);
        }


        else if (firstMinus == false && (secondMinus == true && thirdMinus == true)) {
            System.out.println(1);
        }
        else if (secondMinus == false && (firstMinus == true && thirdMinus == true)) {
            System.out.println(1);
        }
        else if (thirdMinus == false && (firstMinus == true && secondMinus == true)) {
            System.out.println(1);
        }

        else if (firstMinus == false && (secondMinus == true && thirdMinus == false)) {
            System.out.println(2);
        }
        else if (secondMinus == false && (firstMinus == true && thirdMinus == false)) {
            System.out.println(2);
        }
        else if (thirdMinus == false && (firstMinus == true && secondMinus == false)) {
            System.out.println(2);
        }

        else System.out.println(3);


    }
}
