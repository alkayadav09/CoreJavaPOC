package com.corejava.practice;

public class Order implements Comparable<Order>{
	
	private int orderId;
	private int amount;
	private String customer;
	
	public Order(int orderId , int amount , String customer){
		this.orderId = orderId;
		this.amount = amount;
		this.customer = customer;
	}
	
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getCustomer() {
		return customer;
	}
	public void setCustomer(String customer) {
		this.customer = customer;
	}
	
	@Override
	public int compareTo(Order o) {
		return this.orderId > o.orderId ? 1 : (this.orderId < o.orderId ? -1 : 0);

	}
	

}
