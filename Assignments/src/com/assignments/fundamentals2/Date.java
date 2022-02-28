package com.assignments.fundamentals2;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class Date {
    

    public static void LocalDateTime()
    {
    	DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss"); 
    	LocalDateTime dateTime = LocalDateTime.now();
    	System.out.println("TodayS Date And Time is : "+dateTime);
        Month month = LocalDate.now().getMonth();
        LocalDate lastDateOfMonth = LocalDate.of(2022,month, 28);
        System.out.println("Last Date of the month : "+lastDateOfMonth);
//    	String formatedDate = date.format(format);
//    	System.out.println("Today date is : "+formatedDate);
    	System.out.println("Month is : "+month);
    	
    }



	public static void main(String[] args) {

      
      Date.LocalDateTime();
       

	}

}
