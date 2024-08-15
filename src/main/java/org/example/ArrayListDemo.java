package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayListDemo {
    public static void main(String[] args) {
        List<String> houses=Arrays.asList("Banglou","flate","tower");
        houses.stream().sorted().collect(Collectors.toSet());
        System.out.println(houses);
    }
}
