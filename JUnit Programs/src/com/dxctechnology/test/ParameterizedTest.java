package com.dxctechnology.test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.dxctechnology.multiply.Calculator;

@RunWith(Parameterized.class)
public class ParameterizedTest {
	private int expected;
	private int first;
	private int second;
	
	public ParameterizedTest(int expected, int first, int second) {
		super();
		this.expected = expected;
		this.first = first;
		this.second = second;
	}


	@Parameters
	public static List setValues() {
		Integer[][] values = {{6,2,3},{25,5,5},{2,-2,-1},{0,0,3},{0,0,0}};
		return Arrays.asList(values);
	}
	
	@Test
	public void testSum() {
		Calculator calculator = new Calculator();
		int actual = calculator.mulitply(first, second);		
		assertEquals(expected, actual);		
	}
	
}
