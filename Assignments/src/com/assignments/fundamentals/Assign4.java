package com.assignments.fundamentals;

import java.util.Scanner;

public class Assign4 {
	
	public void individualNumbers(int num)
	{
		
		String number = String.valueOf(num);
		for(int i = 0; i < number.length(); i++) {
		    int j = Character.digit(number.charAt(i), 10);
		    System.out.print(j+" ");
		}
	}
	public static void main(String[] args) {
		
		Assign4  assign=new Assign4();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value :");
		int num = sc.nextInt();
		
	    assign.individualNumbers(num);

	}

}
