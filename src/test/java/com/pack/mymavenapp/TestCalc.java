package com.pack.mymavenapp;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class TestCalc {

	Calculator c= null;
	
	CalculatorService service= Mockito.mock(CalculatorService.class);
		
		
	@Before
	public void setUp() {
		c= new Calculator(service);
	}
	@Test
	public void testAdd() {
		when(service.add(2, 3)).thenReturn(5);
		assertEquals(5, c.performOps(2, 3));
		 
	}
	
}
