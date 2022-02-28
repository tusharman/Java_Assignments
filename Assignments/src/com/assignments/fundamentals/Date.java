package com.assignments.fundamentals;

public class Date {
	
	private int date;
	private String month;
	private int year;
	
	public Date() {

     System.out.println("In default cnstr");
	}
	
	

	public Date(int date, String month, int year) {
		super();
		this.date = date;
		this.month = month;
		this.year = year;
	}
 
	


	public int getDate() {
		return date;
	}



	public void setDate(int date) {
		this.date = date;
	}



	public String getMonth() {
		return month;
	}



	public void setMonth(String month) {
		this.month = month;
	}



	public int getYear() {
		return year;
	}



	public void setYear(int year) {
		this.year = year;
	}


	

	@Override
	public String toString() {
		return "Date [date=" + date + ", month=" + month + ", year=" + year + "]";
	}



	public static void main(String[] args) {
		
         Date date =new Date();
         Date date1 = new Date(12, "Aug", 1995);
         
         date.setDate(15);
         date.setMonth("sept");
         date.setYear(1995);
         
         System.out.print(date.getDate()+" ");
         System.out.print(date.getMonth()+" ");
         System.out.print(date.getYear()+" ");
         
         System.out.println();
         
         System.out.println(date1);
		
	}

}
