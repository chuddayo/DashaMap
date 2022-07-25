package com.github.zipcodewilmington;

public class DashaMapTwo extends DashaMap {
    private String HashFunctionTwo(String input) {
        if (input.length() > 0) {
            return String.valueOf(input.charAt(1)).toLowerCase();
        }
        return null;
    }
}
