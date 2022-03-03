package com.assignments.fundamentals2;

public class Assign6 {

	private static String name;
	
	static {
		name="Alex";
	}
	
	
	public static String getName() {
		return name;
	}


	public static void setName(String name) {
		Assign6.name = name;
	}


	public static void main(String[] args) {
		
         System.out.println( "Name is : "+ Assign6.getName());
	}

}
