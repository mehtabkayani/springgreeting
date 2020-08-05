package com.example.springgreeting;

public class Util {

    public StringBuilder reverseName(String name) {

        String input = name;

        StringBuilder input1 = new StringBuilder();

        input1.append(input);


        input1 = input1.reverse();


        return input1;
    }
}
