package com.assignments.fundamentals;

import java.util.Scanner;

//Write a Java method to display the middle character of a string. 
//Note: a) If the length of the string is odd there will be two middle characters.
//b) If the length of the string is even there will be one middle character.


public class Assign5 {

	public void middleChar(String str) {
		
		int length = str.length();
		int middle = length/2-1;
		
		if(length%2 == 0)
		{
			System.out.println(str.charAt(middle)+ " "+str.charAt(middle+1));
		}
		else
		{
			System.out.println(str.charAt(middle+1));
		}
		
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String :");
		String str = sc.next();
		
		Assign5 assign = new Assign5();
		assign.middleChar(str);

	}

}
