package com.company;

public class DogTest {
    public static void main(String[] args) {
        Dog d1 = new Dog("Alex", 1);
        Dog d2 = new Dog("Taison", 5);
        Dog d3 = new Dog("Roksi");
        d3.setAge(1);
        System.out.println(d1);
        System.out.println(d1.intoHumanAge());
        System.out.println(d2.intoHumanAge());
        System.out.println(d3.intoHumanAge());

    }
}
