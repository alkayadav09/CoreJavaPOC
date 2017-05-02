package com.corejava.practice.noofwordsinastring;

public class CountWordsInAString {
	
	public void countWords(String inputString){
		
		String[] wordsInString = inputString.split(" ");
		System.out.println("Words in String : " + wordsInString.length);
	}

}
