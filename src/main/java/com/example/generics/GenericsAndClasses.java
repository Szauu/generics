package com.example.generics;

public class GenericsAndClasses {

    public static void main(String[] args) {

        Box<Phone> box = new Box<>();
        //box.set("1");

        box.set(new Phone("samsung"));

        System.out.println(box.get());

        Box<Letter> box2 = new Box<>();
        box2.set(new Letter("Pawel"));
        System.out.println(box2.get());


    }
}
