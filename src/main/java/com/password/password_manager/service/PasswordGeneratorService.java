package com.password.password_manager.service;

import com.password.password_manager.model.GeneratedPassword;
import com.password.password_manager.model.PasswordPolicy;
import com.password.password_manager.util.Randomizer;

public class PasswordGeneratorService {
    
    private static final String LOWERCASE = "abcdefghijklmnopqrstuvwxyz";
    private static final String UPPERCASE = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String NUMBERS = "0123456789";
    private static final String SYMBOLS = "!@#$%^&*()-_=+[]{}|;:.<>?";

    public GeneratedPassword generate(PasswordPolicy policy) {
        StringBuilder pool = new StringBuilder(LOWERCASE);
        if (policy.isIncludeUppercase()) 
            pool.append(UPPERCASE);
        if (policy.isIncludeNumbers()) 
            pool.append(NUMBERS);
        if (policy.isIncludeSpecialCharacters()) 
            pool.append(SYMBOLS);

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < policy.getLenght(); i++) {
            result.append(Randomizer.getRandomChar(pool.toString()));
        }

        return new GeneratedPassword(result.toString());
    }
}
