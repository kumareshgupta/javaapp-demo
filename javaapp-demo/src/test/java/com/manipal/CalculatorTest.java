package com.manipal;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class CalculatorTest {

	Calculator calculator = null;
	@Before
	public void setUp() throws Exception {
		calculator = new Calculator();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testSum() {
		assertEquals(18,  calculator.sum(10, 8));
	}

	@Test
	public void testMultiply() {
		assertEquals(80,  calculator.multiply(10, 8));
	}

}
