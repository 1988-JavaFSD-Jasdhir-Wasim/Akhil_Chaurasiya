package com.task3;

public class Task1_GenericPair<T,U> {
	private T first;
	private U second;
	
	public Task1_GenericPair(T first,U second)
	{
		this.first = first;
		this.second = second;
	}
	
	public T getFirst()
	{
		return first;
	}
	
	public void setFirst(T first)
	{
		this.first = first;
	}
	
	public U getSecond()
	{
		return second;
	}
	
	public void setSecond(U second)
	{
		this.second = second;
	}
	
	public String toString()
	{
		return "Pair{" + 
				"first="+first +" "+
				"second="+second +
				'}';
	}
	
	public static void main(String[]args)
	{
		Task1_GenericPair<String,Integer> temp = new Task1_GenericPair<>("Akhil",43);
		System.out.println("Before adding the data:-");
		System.out.println(temp);
		
		temp.setFirst("Somesh");
		temp.setSecond(35);
		
		System.out.println("After adding the data:-");
		System.out.println(temp);
		
	}
}
