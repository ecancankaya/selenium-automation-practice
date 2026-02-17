package com.eyup.automation;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        int result = calc.sum(2, 3);
        System.out.println("sum(2,3) = " + result);

        int div = calc.divide(10, 2);
        System.out.println("divide(10,2) = " + div);

        // This should throw exception:
        calc.divide(10, 0);
    }
}
