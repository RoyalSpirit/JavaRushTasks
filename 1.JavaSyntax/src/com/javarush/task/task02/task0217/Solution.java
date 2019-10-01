package com.javarush.task.task02.task0217;

/* 
Минимум четырех чисел
*/
public class Solution {
    public static int min(int a, int b, int c, int d) {
        if (min(a, b) <= b && a <= c && a <= d) {
            return a;
        } else if (b <= min(a, b) && b <= c && b <= d && b <= a) {
            return b;
        } else if (c <= min(a, b) && c <= d) {
            return c;
        } else {
            return d;
        }
        //напишите тут ваш код

    }

    public static int min(int a, int b) {
        if (a < b) {
            return a;
        } else {
            return b;
        }
        //напишите тут ваш код

    }

    public static void main(String[] args) throws Exception {
        System.out.println(min(-20, -10));
        System.out.println(min(-40, -10, -30, 40));
        System.out.println(min(-20, -40, -30, 40));
        System.out.println(min(-20, -10, -40, 40));
        System.out.println(min(-20, -10, -30, -40));
    }
}