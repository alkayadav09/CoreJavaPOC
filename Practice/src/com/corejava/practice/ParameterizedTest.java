package com.corejava.practice;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class ParameterizedTest {
	
	private StringManipulation strManipulation = new StringManipulation();
	private String input;
	private String expectedResult;
	
	@Parameters
	public static List<Object[]> data(){
		return Arrays.asList(new Object[][]{
			{"Today is my interview" , "Todby is my interview"},
			{"My name is Alka" , "My nbme is Alkb"}
		});
	}

	public ParameterizedTest(String input , String expectedResult){
		this.input = input;
		this.expectedResult = expectedResult;
	}
	
	@Test
	public void replaceString(){
		assertEquals(expectedResult, 
					strManipulation.replaceStringUsingCharAt(input));
	}
}
