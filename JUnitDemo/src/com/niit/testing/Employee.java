package com.niit.testing;

public class Employee {
	private int EmpId;
	private String name;
	private int salary;
	public Employee(int empId, String name, int salary) {
		super();
		EmpId = empId;
		this.name = name;
		this.salary = salary;
	}
	public int getEmpId() {
		return EmpId;
	}
	public void setEmpId(int empId) {
		EmpId = empId;
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
	
	public static String getEmpNameWithHighestSalary(){
		//** logic to get Highest paid employee**//
		return "Raj";
	}
	
	
	public static Employee getHighestPaidEmployee(){
		//**  * hiding logic to get  get Highest paid employee * **//
		return new Employee(1,"Raj",150000);
	}
	@Override
	public int hashCode() {
		
		return this.EmpId;
	}
	@Override
	public boolean equals(Object obj) {
		Employee emp=(Employee) obj;
		boolean status=false;
		if(this.name.equalsIgnoreCase(emp.name)
			&& this.EmpId==emp.EmpId
			&& this.salary==emp.salary){
				status=true;
			}
			return status;
	}
	

}
