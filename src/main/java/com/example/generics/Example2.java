package com.example.generics;

import java.util.ArrayList;
import java.util.List;

public class Example2 {

    public static void main(String[] args) {
 /*   Comparable number = 10;
    number.compareTo("10");*/

        Comparable<Integer> number = 10;
        System.out.println(number.compareTo(5));
    }

}
