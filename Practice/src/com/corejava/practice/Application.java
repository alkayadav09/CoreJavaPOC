package com.corejava.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Application {

	public static void main(String arg[]){
		System.out.println("Hello from Core Java Practice");
		
/*		FibbonacciSeries fb = new FibbonacciSeries(1,2);
		//fb.creatFibonacciSeries();
		fb.creatFibonacciSeriesByList();
*/	
		
/*		Order o1 = new Order(204,1000,"Sony");
		Order o2 = new Order(202,3000,"Panasonic");
		Order o3 = new Order(201,500,"Hitachi");
		
		List<Order>  orders = new ArrayList<Order>();
		orders.add(o1);
		orders.add(o2);
		orders.add(o3);
		
		Collections.sort(orders);
		
		List<Integer> or = new ArrayList<Integer>();
		or.add(100);
		or.add(200);
		or.add(500);
		or.add(300);
		or.add(400);
*/
		
/*		List<String> str = new ArrayList<String>();
		str.add("Hello");
		str.add("Alka");
		str.add("How R U");
		str.add("Do you like Java");
		str.add("Coding");
		//Collections.sort(str);
		Collections.sort(str , Collections.reverseOrder());
		System.out.println("List of Order object sorted in natural order : " + str);
		//System.out.println("List of Order object sorted in natural order : " + orders.get(0).getCustomer() + "  " + orders.get(1).getCustomer() + "  " + orders.get(2).getCustomer());
*/
		String str = "Today is my interview";
		
		System.out.println("String is : " + str);
		
		//String reverseStr = new StringBuffer(str).reverse().toString();
		
		StringManipulation strManipulation = new StringManipulation();
//		String reverseStr = strManipulation.reverse(str);
//		System.out.println("Reverse String is : " + reverseStr);
//		strManipulation.replaceString(str);
		strManipulation.replaceStringUsingCharAt(str);
	
		}
	
	
	 
}
