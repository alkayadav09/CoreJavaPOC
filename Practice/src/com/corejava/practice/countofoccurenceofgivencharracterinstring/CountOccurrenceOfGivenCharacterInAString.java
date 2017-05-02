package com.corejava.practice.countofoccurenceofgivencharracterinstring;

// java program to count the total number of occurrences of a given character in a string without using any loop

public class CountOccurrenceOfGivenCharacterInAString {
	
	public void countCharacterInAString(String inputString, char givenCharacter){

		char[] inputCharacterString = inputString.toCharArray();
		int count=0;
		for(int i=0; i<inputCharacterString.length; i++){
			System.out.println(inputCharacterString[i]);
			if(inputCharacterString[i]==givenCharacter){
				count++;
			}
		}
		System.out.println(givenCharacter + ":" + count);
	}

}
