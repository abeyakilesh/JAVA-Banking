package com.abey.banking;

public class LoginService {

    // demo credentials (beginner-friendly)
    private static final String CUSTOMER_ID = "abey-hdfc-1234";
    private static final String PASSWORD = "Abey1234";

    public static boolean authenticate(String id, String pass) {
        return CUSTOMER_ID.equals(id) && PASSWORD.equals(pass);
    }
}
