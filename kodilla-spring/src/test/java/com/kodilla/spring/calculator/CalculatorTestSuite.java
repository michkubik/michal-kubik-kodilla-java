package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class CalculatorTestSuite {

    @Autowired
    private Calculator calculator;

    @Test
    public void testCalculations() {

        //Given
        double a = 5;
        double b = 2;
        //When
        calculator.add(a, b);
        calculator.sub(a, b);
        calculator.mul(a, b);
        calculator.div(a, b);

        //Then
        //do nothing

    }


}
