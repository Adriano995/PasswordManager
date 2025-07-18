package com.password.password_manager.util;

import java.security.SecureRandom;

public class Randomizer {
    
    private static final SecureRandom secureRandom = new SecureRandom();

    public static char getRandomChar(String characters) {
        int index = secureRandom.nextInt(characters.length());
        return characters.charAt(index);
    }
}
