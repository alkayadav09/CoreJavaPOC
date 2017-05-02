package com.corejava.practice.noofwordsinastring;

// java program to count the number of words in a string
public class App {

	public static void main(String args[]){
		
		CountWordsInAString count = new CountWordsInAString();
		count.countWords("Hello!! how are you ?");
		count.countWords("Hello there !!");
	}
}
