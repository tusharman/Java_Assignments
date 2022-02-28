package com.assignments.fundamentals2;

import java.util.ArrayList;
import java.util.List;

//Assignment # 2
//Create an array of Employees & display nos. of Employee objects created.

public class Employee {
    int id;
    String name;
    int salary;
    
    public Employee() {
		// TODO Auto-generated constructor stub
	}
    
    
    
	public Employee(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	
	


	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getSalary() {
		return salary;
	}



	public void setSalary(int salary) {
		this.salary = salary;
	}

	
	


	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}



	public static void main(String[] args) {
		List<Employee> employee =new ArrayList<Employee>();
		
		employee.add(new Employee(101, "john", 15000));
		employee.add(new Employee(101, "Mike", 25000));
		employee.add(new Employee(101, "Sam", 17000));
		
		System.out.println(employee);
	}

}
