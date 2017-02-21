package com.corejava.practice;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringManipulationTest {
	
	StringManipulation strManipulation = new StringManipulation();
	
	@Test
	public void replaceString(){
		assertEquals("Result Fails : ", "Todby is my interview" , 
					strManipulation.replaceStringUsingCharAt("Today is my interview"));
	}
	
	@Test
	public void replaceTodayByTomorrow(){
		assertEquals("Today is not replaced by Tomorrow : " , "Tomorrow is my interview" , 
				        strManipulation.replaceStringWithAnotherString("Today is my interview", "Tomorrow", "Today"));
	}
}
