package com.password.password_manager.dto;

public class PasswordRequestDTO {
     private int length;
    private boolean includeUppercase;
    private boolean includeNumbers;
    private boolean includeSymbols;

    public PasswordRequestDTO() {}

    public PasswordRequestDTO(int length, boolean includeUppercase, boolean includeNumbers, boolean includeSymbols) {
        this.length = length;
        this.includeUppercase = includeUppercase;
        this.includeNumbers = includeNumbers;
        this.includeSymbols = includeSymbols;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
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

    public boolean isIncludeSymbols() {
        return includeSymbols;
    }

    public void setIncludeSymbols(boolean includeSymbols) {
        this.includeSymbols = includeSymbols;
    }
}
