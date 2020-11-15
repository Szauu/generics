package com.example.generics;

import java.util.Arrays;
import java.util.List;

public class LowerBoundedWildcards {

    public static void main(String[] args) {
        // ? Wildcards
        // BoundedWildcards
        List<Double> list = Arrays.asList(1.2, 2.1);
        List<Number> list1 = Arrays.asList(1, 2);
        List<Long> list2 = Arrays.asList(-1L, 2L);
        //printNumbers(list);
        printNumbers(list1);
        printNumbers(list2);
    }

    static void printNumbers(List<? super Long> list) {
        list.forEach(e -> {
            System.out.println(e.getClass().getName() + " - " + e);
        });
    }
}
