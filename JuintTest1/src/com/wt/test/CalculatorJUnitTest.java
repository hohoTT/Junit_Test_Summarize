package com.wt.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.wt.testObject.Calculator;

public class CalculatorJUnitTest {

	@Test
    public void testAdd(){
        
        int num1 = 10;
        int num2 = 20;
        
        Calculator calculator = new Calculator();
        
        int result = calculator.add(num1, num2);
        int expect = 30;
        
        assertEquals(expect, result);
        
    }
	
	@Test
    public void testSubtract(){
        
        int num1 = 20;
        int num2 = 10;
        
        Calculator calculator = new Calculator();
        
        int result = calculator.subtract(num1, num2);
        int expect = 10;
        
        assertEquals(expect, result);
        
    }
    
    @Test
    public void testMultiply(){
        
        int num1 = 20;
        int num2 = 10;

        Calculator calculator = new Calculator();
        
        int result = calculator.multiply(num1, num2);
        int expect = 200;
        
        assertEquals(expect, result);
        
    }
    
    @Test
    public void testDivide(){
        
        int num1 = 20;
        int num2 = 10;

        Calculator calculator = new Calculator();
        
        int result = calculator.divide(num1, num2);
        int expect = 2;
        
        assertEquals(expect, result);
        
    }

}
