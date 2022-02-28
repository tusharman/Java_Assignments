package com.cybage.assignments;

public class Assign4 {

	int id;
	String name;
	
	public Assign4() {
		
		System.out.println("In default constructor");
	}
	
	
	
	public Assign4(int id, String name) {
		super();
		System.out.println("In parameterized constructor...");
		this.id = id;
		this.name = name;
	}



	@Override
	public String toString() {
		return "Assign4 [id=" + id + ", name=" + name + "]";
	}



	public static void main(String[] args) {


		 Assign4 assign = new Assign4();  //default constructor gets called
		//System.out.println(assign.id);
		 Assign4 assign1 = new Assign4(101, "JHON");
		 System.out.println(assign1);    //parameterized constr gets called
	}

}
