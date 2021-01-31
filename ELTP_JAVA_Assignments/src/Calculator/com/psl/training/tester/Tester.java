package com.psl.training.tester;

import com.psl.training.service.CalculatorService;

public class Tester {
    public static void main(String[] args) {
        CalculatorService calculatorService = new CalculatorService();
        int result = calculatorService.performCalculations(CalculatorService.operations.ADD,10,20);
        System.out.println(result);
    }
}
