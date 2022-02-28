package com.assignments.fundamentals;

import java.util.Scanner;

public class Assign3 {
	//546
	//5+4+6
	public int add(int n) {
		 int sum;
		 
	       
	        for (sum = 0; n > 0; sum += n % 10,
	                                  n /= 10);
	 
	        return sum;
	}
	

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value from 0 to 1000");
		int num = sc.nextInt();
		Assign3 assign = new Assign3();
		  assign.add(222);
     System.out.println("Addition is : "+assign.add(num));
	}

}
