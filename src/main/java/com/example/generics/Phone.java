package com.example.generics;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Phone {

    private final String brand;

    public Phone(String brand) {
        this.brand = brand;
    }

}
