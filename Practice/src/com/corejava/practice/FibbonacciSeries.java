package com.corejava.practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FibbonacciSeries {

	int first ;
	int second;
	
	public FibbonacciSeries(int first , int second){
		this.first = first;
		this.second = second;
	}
	public Integer[] creatFibonacciSeries(){
		//List<Integer> ar = new ArrayList<Integer>();
		Integer[] ar = new Integer[10];
		ar[0]=first;
		ar[1]=second;
		
		for(int i=2 ; i<10 ; i++)
		{
			ar[i]= ar[i-1] + ar[i-2];
			
		}
		
		for(int i= 0 ; i<10 ; i++){
			System.out.println(ar[i]);
		}
		return ar;
	}
	
	public void creatFibonacciSeriesByList(){
		
		List<Integer> ar = new ArrayList<Integer>();
		Iterator itr = ar.iterator();
		ar.add(first);
		ar.add(second);
		for(int i=2 ; i<10 ;i++){
			ar.add(ar.get(i-1)+ar.get(i-2));
		}
		
		for(int i=0 ;itr.hasNext() ;i++){
			System.out.println(ar.get(i));
		}
	}
}
