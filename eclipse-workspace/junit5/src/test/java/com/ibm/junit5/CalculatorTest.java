package com.ibm.junit5;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class CalculatorTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("Before Class");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("After Class");
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("Before each");
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("After Each");
	}

	@Test
	void testSum() {
		int expected=6;
		Calculator calculator = new Calculator();
		int actual =calculator.sum(4, 2);
		assertEquals(expected, actual);
		//fail("Not yet implemented");
	}
	
	@Test
	void testDivide() {
		int expected=2;
		Calculator calculator = new Calculator();
		int actual =calculator.divide(4, 2);
		assertEquals(expected, actual);
		//fail("Not yet implemented");
	}
	
	@Test
	void testDivideByZero() {
		System.out.println("Divide");
		Calculator calculator=new Calculator();
		
		ArithmeticException exception = assertThrows(ArithmeticException.class, () -> calculator.divide(10, 0), "Expected divide() to throw, but it didn't");
		assertEquals("/ by zero", exception.getMessage());
		//fail("Not yet implemented");
	}
	
	@Test
	void testSlowMethodPerformance() {
		Calculator calculator = new Calculator();
		assertTimeout(Duration.ofMillis(200), () -> calculator.getConnection());
	}
	
	@ParameterizedTest
	@ValueSource(ints = {2,4,6,8,10})
	void testIsEvenWithEvenNumbers(int number) {
		Calculator calculator = new Calculator();
		assertTrue(calculator.isEven(number));
	}
	
	@ParameterizedTest
	@ValueSource(ints = {1,3,5,7,9})
	void testIsEvenWithOddNumbers(int number) {
		Calculator calculator = new Calculator();
		assertFalse(calculator.isEven(number));
	}
	
	

}
