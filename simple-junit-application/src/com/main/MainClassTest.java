package com.main;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MainClassTest {
	
	private MainClass mainClass;

	@Before
	public void setUp() throws Exception {
		mainClass = new MainClassImpl();
	}
	
	@Test
	public void addTest() {
		assertEquals(10, mainClass.add(5, 5));
	}
	
	@Test
	public void subtractTest() {
		assertEquals(11, mainClass.subtract(20, 9));
	}
	
	@Test
	public void multiplyTest() {
		assertEquals(12, mainClass.multiply(6, 2));
	}
	
	@Test
	public void divideTest() {
		assertEquals(15, mainClass.divide(30, 2));
	}

	@Test
	public void squareTest() {
		assertEquals(25, mainClass.square(5));
	}

}
