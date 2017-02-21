package com.corejava.practice;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class SquareRootParameterizedTest {
	
	SquareRoot sqrt = new SquareRoot(); 
	private double input;
	private double expectedResult;
	private static final double DELTA = 1e-3;
	
	
	public SquareRootParameterizedTest(double input , double expectedResult){
		this.input = input;
		this.expectedResult = expectedResult;
	}
	
	@Parameters
	public static List<Object[]> data(){
		return Arrays.asList(new Object[][]{
			{4,2},
			{9,3},
			{10,3.1622},
			{16,4}
		});
	}
	
	@Test
	public void squareRootOfIntegerTest(){
		assertEquals(expectedResult , sqrt.getSquareRootOfInteger(input) , DELTA);
		
	}

}
