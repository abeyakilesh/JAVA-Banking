package com.abey.banking;

public class Admin {

    private static final String PIN = "1234";

    public static boolean login(String input) {
        return PIN.equals(input);
    }
}
