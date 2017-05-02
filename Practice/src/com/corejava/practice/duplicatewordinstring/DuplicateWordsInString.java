package com.corejava.practice.duplicatewordinstring;

import java.util.HashMap;
import java.util.Set;

public class DuplicateWordsInString {

	public void duplicateWords(String inputString){
		
		//Splitting inputString into words
		String[] words = inputString.split(" ");
		
		//Creating one HashMap with words as key and their count as value
		HashMap<String,Integer> wordCount = new HashMap<>();
		
		int count=1;
		//Checking each word
		for(int i=0 ; i<words.length ; i++){
			
			//whether it is present in wordCount
			if(wordCount.containsKey(words[i])){
				//If it is present, incrementing it's count by 1
				wordCount.put(words[i], wordCount.get(words[i])+1);
			}
			else{
				 //If it is not present, put that word into wordCount with 1 as it's value
				wordCount.put(words[i],count);
			}
		}
		
		//Extracting all keys of wordCount
		Set<String> wordsInString = wordCount.keySet();
		
		//Iterate through all words in the wordCount 
		for(String word : wordsInString){
			if(wordCount.containsKey(word)){
				//Printing that word and it's count
				System.out.println(word + ":" + wordCount.get(word));
			}
		}
	}
}
