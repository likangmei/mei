package com.example.mathsapp;

import org.junit.Test;

import junit.framework.Assert;
import junit.framework.TestCase;

public class CalculatorTest extends TestCase {

	protected void setUp() throws Exception {
		super.setUp();
	}
	@Test
	public void testInput0(){
        Calculator a = new Calculator();
        boolean result = a.Input(2,3);
        Assert.assertEquals(true,result);        
    }
}
