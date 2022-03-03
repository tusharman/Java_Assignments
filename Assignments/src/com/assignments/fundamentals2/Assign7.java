package com.assignments.fundamentals2;

//Write a program to calculate area of circle. Use PI value using static import
public class Assign7 {
  
	public static double areaOfCircle(int radius)
	{
		return 2 * Math.PI * radius;
	}
	public static void main(String[] args) {
		
		double areaOfCircle = Assign7.areaOfCircle(10);
		System.out.println(areaOfCircle);
      
	}

}
