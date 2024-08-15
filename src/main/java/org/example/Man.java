package org.example;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Man {
    public static void main(String[] args) {
        Set<String> fruits=new HashSet<String>();
        fruits.add(new String("banana"));
        fruits.add(new String("papaya"));
        fruits.add(new String("mango"));
        fruits.add(new String("grapsh"));
        Set<String> sortedFruites = fruits.stream().sorted().collect(Collectors.toSet());
        System.out.println(sortedFruites);

    }
}
