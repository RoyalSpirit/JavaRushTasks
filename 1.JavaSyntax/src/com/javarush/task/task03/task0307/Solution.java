package com.javarush.task.task03.task0307;

/* 
Привет StarCraft!
*/

public class Solution {
    public static void main(String[] args) {
        Zerg first = new Zerg();
        Zerg second = new Zerg();
        Zerg third = new Zerg();
        Zerg fourth = new Zerg();
        Zerg fifth = new Zerg();

        first.name = "ZergOne";
        second.name = "ZergTwo";
        third.name = "ZergThree";
        fourth.name = "ZergFour";
        fifth.name = "ZergFive";

        Protoss one = new Protoss();
        Protoss two = new Protoss();
        Protoss three = new Protoss();

        one.name = "ProtosOne";
        two.name = "ProtosTwo";
        three.name = "ProtosThree";

        Terran odin = new Terran();
        Terran dva = new Terran();
        Terran tri = new Terran();
        Terran chetire = new Terran();

        odin.name = "Odin";
        dva.name = "Dva";
        tri.name = "Tri";
        chetire.name = "Chetire";
    }

    public static class Zerg {
        public String name;
    }

    public static class Protoss {
        public String name;
    }

    public static class Terran {
        public String name;
    }
}
