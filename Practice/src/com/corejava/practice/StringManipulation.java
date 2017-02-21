package com.corejava.practice;

public class StringManipulation {


	public  String reverse(String str){
		StringBuilder strBuilder = new StringBuilder();
		char[] charStr = str.toCharArray();
		
		for(int i=charStr.length-1; i>=0 ; i--){
			strBuilder.append(charStr[i]);
		}
		return strBuilder.toString();
	}
	
	/*To replace a character in a given String with
	the new Character */
	public void replaceString(String originalStr){
		
		char newChar = 'b';
		System.out.println("Original String is : " + originalStr);
		char[] charArray = originalStr.toCharArray();
		for(int i=0 ; i<=originalStr.length()-1 ; i++){
			if(charArray[i]=='a'){
				charArray[i] = newChar;
			}
		}
		
		System.out.println("New String is :" + String.valueOf(charArray));
	}
	
	public String replaceStringUsingCharAt(String originalStr){
		char newChar = 'b';
		String newStr = null;
		System.out.println("Original String is : " + originalStr);
		for(int i=0 ; i<originalStr.length() ; i++){
			if(originalStr.charAt(i) == 'a'){
				char oldChar = originalStr.charAt(i);
				newStr = originalStr.replace(oldChar , newChar);
			}
		}
		System.out.println("New String is :" + newStr);
		return newStr ;
	}
	
	public String replaceStringWithAnotherString(String originalStr, String newStr , String toBeReplaced){
		char[] origCharArray = originalStr.toCharArray();
		char[] newCharArray = newStr.toCharArray();
		String newReplacedStr = originalStr.replace(toBeReplaced, newStr);
		System.out.println("New replaced String is : " + newReplacedStr);
		return newReplacedStr;
		
	}
}

