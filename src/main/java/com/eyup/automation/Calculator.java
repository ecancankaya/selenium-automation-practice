package com.eyup.automation;

public class Calculator {
    public int sum(int a, int b) {
        return Math.addExact(a, b);
    }

    public int divide(int a, int b) {
       if (b == 0) {
            throw new IllegalArgumentException("Divider cannot be zero");
        }
        return a / b;
    }
}
