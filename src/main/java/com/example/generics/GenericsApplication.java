package com.example.generics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class GenericsApplication {

	public static void main(String[] args) {
		//SpringApplication.run(GenericsApplication.class, args);

		List<Integer> numbers = new ArrayList();
		numbers.add(1);
		//numbers.add("2");

		for (Object number : numbers){
			System.out.println((String)number);
		}

	}

}
