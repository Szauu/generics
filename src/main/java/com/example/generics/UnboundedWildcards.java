package com.example.generics;

import java.util.Arrays;
import java.util.List;

public class UnboundedWildcards {

    public static void main(String[] args) {
        // ? Wildcards
        // BoundedWildcards
        List<Object> list = Arrays.asList(1, 2);
        List<Integer> list1 = Arrays.asList(1, 2);
        List<String> list2 = Arrays.asList("Ali", "Jamal");
        print(list);
        print(list1);
        print(list2);
    }

    static void print(List<?> list) {
        list.forEach(e -> {
            System.out.println(e.getClass().getName() + " - " + e);
        });
    }
}
