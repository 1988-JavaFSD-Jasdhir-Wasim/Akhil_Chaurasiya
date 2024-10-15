package com.task1;
import java.util.*;

public class Task1_RightCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Set<String>usernames = new HashSet<>();
		
		usernames.add("Somesh");
		usernames.add("Tej");
		usernames.add("Pratik");
		usernames.add("Raghav");
		usernames.add("Shrey");
		usernames.add("Manjeet");
		
		System.out.println("Enter your username");
		String str = sc.next();
		
		
		if(usernames.contains(str))
		{
			System.out.println("Username already exist");
			usernames.remove(str);
			System.out.println("After removing that username");
			for(String s:usernames)
			{
				System.out.println(s);
			}
			
		}		
		else {
			usernames.add(str);
			System.out.println("Username added Successfully");
			for(String s:usernames)
			{
				System.out.println(s);
			}
		}
		
		
			
	}

}
