package com.password.password_manager.model;

public class PasswordPolicy {
    
    private int lenght;
    private boolean includeUppercase;
    private boolean includeNumbers;
    private boolean includeSpecialCharacters;

    public PasswordPolicy(){}

    public PasswordPolicy(int lenght, boolean includeUppercase, boolean includeNumbers, boolean includeSpecialCharacters) {
        this.lenght = lenght;
        this.includeUppercase = includeUppercase;
        this.includeNumbers = includeNumbers;
        this.includeSpecialCharacters = includeSpecialCharacters;
    }

    public int getLenght() {
        return lenght;
    }

    public void setLenght(int lenght) {
        this.lenght = lenght;
    }

    public boolean isIncludeUppercase() {
        return includeUppercase;
    }

    public void setIncludeUppercase(boolean includeUppercase) {
        this.includeUppercase = includeUppercase;
    }

    public boolean isIncludeNumbers() {
        return includeNumbers;
    }

    public void setIncludeNumbers(boolean includeNumbers) {
        this.includeNumbers = includeNumbers;
    }

    public boolean isIncludeSpecialCharacters() {
        return includeSpecialCharacters;
    }

    public void setIncludeSpecialCharacters(boolean includeSpecialCharacters) {
        this.includeSpecialCharacters = includeSpecialCharacters;
    }

    
}
