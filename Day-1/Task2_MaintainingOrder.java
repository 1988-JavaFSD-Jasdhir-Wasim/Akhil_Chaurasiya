package com.task2;
import java.util.*;

public class Task2_MaintainingOrder {
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		Map<Integer,String> studentGrades = new LinkedHashMap<>();
		
		boolean val = true;
		while(val)
		{
			System.out.println("Enter the Student ID:");
			int id = sc.nextInt();
			
			System.out.println("Enter the Student Grade :");
			String grade = sc.next();
			
			studentGrades.put(id, grade);
			
			System.out.println("Do you want to add another grade? yes/no");
			String response = sc.next();
			
			if(response.equalsIgnoreCase("no"))
			{
				val = false;
			}
		}
		
		System.out.println("Student Grades :-");
		for(Map.Entry<Integer,String> entry:studentGrades.entrySet())
		{
			System.out.println("Student ID :" + entry.getKey() + ", Grade: "+ entry.getValue());
		}
		
		
		
	}
	
	
}
