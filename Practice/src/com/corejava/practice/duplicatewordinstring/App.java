package com.corejava.practice.duplicatewordinstring;


// Write a java program to find the duplicate words and their number of occurrences in a string?

public class App {

	public static void main(String[] args) {

		DuplicateWordsInString duplicate = new DuplicateWordsInString();
		duplicate.duplicateWords("Hello Hello Alka Hello");
		System.out.println("------------------");
		duplicate.duplicateWords("Java is java again java");
	}

}
