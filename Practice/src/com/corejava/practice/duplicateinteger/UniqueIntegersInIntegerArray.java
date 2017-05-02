package com.corejava.practice.duplicateinteger;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

// To print the unique integer values from a Integer Array with duplicate values
public class UniqueIntegersInIntegerArray {
	
	public void listUniqueIntegers(Integer[] input){
		HashMap<Integer,Integer> inputMap = new HashMap<>();
		
		for(int i=0; i<input.length; i++){
			if(inputMap.containsKey(input[i])){
				inputMap.put(input[i], inputMap.get(input[i])+1);
			}
			else{
				inputMap.put(input[i], 1);
			}
		}
		
		Set<Integer> uniqueIntegerValue = inputMap.keySet();
		
		Iterator<Integer> itr = uniqueIntegerValue.iterator();
		
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
	}
}
