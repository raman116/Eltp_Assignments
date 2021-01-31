
package com.psl.training.service;

import com.psl.training.util.Calculator;

public class CalculatorService {
    public  enum operations {ADD, SUBTRACT, MULTIPLY, DIVIDE};
    public int performCalculations(operations op, int a, int b)
    {
        Calculator calculator = new Calculator();
        int result = 0;
        if(op.equals(operations.ADD))
        {
           result =  calculator.add(a,b);
        }
        else if(op.equals(operations.SUBTRACT))
        {
           result =  calculator.subtract(a,b);
        }
        else if(op.equals(operations.MULTIPLY))
        {
           result =  calculator.multiply(a,b);
        }
        else if(op.equals(operations.DIVIDE))
        {
            result = calculator.divide(a,b);
        }
        return result;
    }
}
