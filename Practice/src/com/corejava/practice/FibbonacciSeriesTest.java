package com.corejava.practice;

import static org.junit.Assert.*;

import org.junit.Test;

public class FibbonacciSeriesTest {
	
	FibbonacciSeries fs = new FibbonacciSeries(1,2);
	
	@Test
	public void firstTenFibbonacciNumber(){
	
		Integer[] intArray = {1,2,3,5,8,13,21,34,55,89};
		assertArrayEquals("Fibbonacci Series encounter some error : " , intArray,
		        fs.creatFibonacciSeries());
	}

}
