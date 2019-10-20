package com.javarush.task.task04.task0403;

/* 
Как зовут кота?
*/

public class Cat {
    private String name = "безымянный кот";

    public void setName(String name) {
        String catNewName = name;
        this.name = catNewName;

    }

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setName("Жужик");
        System.out.println(cat.name);
    }
}
